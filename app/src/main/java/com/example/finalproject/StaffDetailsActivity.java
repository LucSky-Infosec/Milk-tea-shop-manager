package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.finalproject.Adapters.StaffAdapter;

public class StaffDetailsActivity extends AppCompatActivity {
    private ImageButton btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_details);
        setControl();
        setEvent();
    }
    private void setControl(){
        btnBack = findViewById(R.id.back_button);

    }
    private void setEvent(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setPressed(true);
                Intent intent = new Intent(StaffDetailsActivity.this, StaffActivity.class);
                startActivity(intent);
                finish(); // Kết thúc Activity hiện tại và quay trở lại Activity trước đó
            }
        });
    }
}