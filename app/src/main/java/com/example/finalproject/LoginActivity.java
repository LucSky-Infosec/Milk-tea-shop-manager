package com.example.finalproject;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject.DB.DBHelper;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin, buttonRegister;
    private CheckBox cbRememberPass;
    private DBHelper dbHelper;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.deleteDatabase("MilkTeaStoreDB");
        setContentView(R.layout.activity_login);
        setControl();
        setEvent();
    }

    private void setControl()
    {
        editTextUsername = findViewById(R.id.etUsername);
        editTextPassword = findViewById(R.id.etPassword);
        buttonLogin = findViewById(R.id.btnLogin);
        buttonRegister = findViewById(R.id.btnRegister);
        cbRememberPass = findViewById(R.id.cbRememberPass);
        sharedPreferences = getSharedPreferences("myPreferences", Context.MODE_PRIVATE);
    }

    private void setEvent()
    {

        dbHelper = new DBHelper(this);
        editTextPassword.setTransformationMethod(new PasswordTransformationMethod());
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                Log.d("LoginActivity", "Username: " + username);

                String password = editTextPassword.getText().toString();
                if (dbHelper.isAccountExists(username)) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("username", username);
                    editor.apply();
                    Toast.makeText(LoginActivity.this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "Tên đăng nhập hoặc mật khẩu không chính xác!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.createDemoAccount();
                dbHelper.createDemoStaff();
                Toast.makeText(LoginActivity.this, "Tài khoản demo đã được tạo", Toast.LENGTH_SHORT).show();
                // Tự động điền username và password vào EditText
                editTextUsername.setText("1");
                editTextPassword.setText("12345");
            };
        });
    }
}
