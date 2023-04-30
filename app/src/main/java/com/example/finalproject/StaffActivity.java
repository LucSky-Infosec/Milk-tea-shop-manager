package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.finalproject.Adapters.StaffAdapter;
import com.example.finalproject.DB.DBHelper;
import com.example.finalproject.DB.StaffTable;
import com.example.finalproject.Model.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffActivity extends AppCompatActivity {
    private ListView mListViewStaff;
    private StaffAdapter mStaffAdapter;
    private View addStaff;
    private ImageButton btnBack;
    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        setControl();
        setEvent();
    }
    private void setControl(){
        mListViewStaff = findViewById(R.id.listViewStaff);
        // khởi tạo StaffAdapter và set cho ListView
        mStaffAdapter = new StaffAdapter(this, generateStaffList());
        mListViewStaff.setAdapter(mStaffAdapter);
        addStaff = findViewById(R.id.addStaff);
        btnBack = findViewById(R.id.back_button);
    }
    private void setEvent(){
        addStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setPressed(true);
                Intent intent = new Intent(StaffActivity.this, StaffDetailsActivity.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setPressed(true);
                Intent intent = new Intent(StaffActivity.this, HomeActivity.class);
                startActivity(intent);
                finish(); // Kết thúc Activity hiện tại và quay trở lại Activity trước đó
            }
        });
    }
    private ArrayList<Staff> generateStaffList() {
        // tạo danh sách nhân viên từ database
        ArrayList<Staff> staffList = new ArrayList<>();
        dbHelper = new DBHelper(this);
        ArrayList<Staff> dbStaffList = dbHelper.getAllStaff();
        for (Staff staff : dbStaffList) {
            staffList.add(staff);
        }
        return staffList;
    }
}