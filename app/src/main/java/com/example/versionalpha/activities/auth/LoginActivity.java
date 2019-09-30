package com.example.versionalpha.activities.auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.versionalpha.R;
import com.example.versionalpha.backend.model.LoginUser;

public class LoginActivity extends AppCompatActivity {
    private EditText etEmail, etPassword;
    private Button btnLogin;
    private TextView tvRegister;

    private String username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText) findViewById(R.id.et_email);
        etPassword = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        tvRegister = (TextView) findViewById(R.id.tv_register);


        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = etEmail.getText().toString();
                password = etPassword.getText().toString();
                login(username,password);
            }
        });

    }



    public void login(String email,String password){
        LoginUser ul =new LoginUser(email, password);
        //TODO; Override methodes of UserClient
    }





}
