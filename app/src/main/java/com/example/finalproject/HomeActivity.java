package com.example.finalproject;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.finalproject.DB.DBHelper;
import com.example.finalproject.Model.Account;
import com.example.finalproject.Model.Staff;
import com.squareup.picasso.Picasso;

import java.io.File;

public class HomeActivity extends AppCompatActivity {
    private ImageView ivAccAvatar;
    private TextView tvAccName, tvAccId, tvAccRole;
    private View staffOptionLayout;
    private DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // Lấy thông tin user được truyền từ Activity trước đó
        String username = (String)getIntent().getSerializableExtra("username");
        setControl();
        setEvent();
    }
    private void setControl()
    {
        ivAccAvatar = findViewById(R.id.ivAccAvatar);
        tvAccName = findViewById(R.id.tvAccName);
        tvAccId = findViewById(R.id.tvAccID);
        tvAccRole = findViewById(R.id.tvAccRole);
        staffOptionLayout = findViewById(R.id.StaffOption);
    }
    private void setEvent()
    {
        showAccInfo();
        staffOptionLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setPressed(true);
                Intent intent = new Intent(HomeActivity.this, StaffActivity.class);
                startActivity(intent);
            }
        });
    }

    private void showAccInfo(){
        dbHelper = new DBHelper(this);
        SharedPreferences sharedPreferences = getSharedPreferences("myPreferences", MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "");
        // Lấy thông tin tài khoản đăng nhập
        Account account = dbHelper.getAccountByUsername(username);
        // Lấy thông tin nhân viên với ID của tài khoản
        Staff staff = dbHelper.getStaffById(account.getStaffID());
        String role = (staff.getRole() == 0) ? "Nhân viên" : "Quản lý";
        Picasso.get().load(new File(staff.getAvatar())).into(ivAccAvatar);
        tvAccName.setText(staff.getLastName()+" "+staff.getFirstName());
        tvAccId.setText(String.valueOf(staff.getId()));
        tvAccRole.setText(role);
    }
}