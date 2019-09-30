package com.example.versionalpha.activities.auth;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.versionalpha.R;
import com.example.versionalpha.backend.model.RegisterUser;


public class RegisterActivity extends AppCompatActivity {
    private EditText et_firstname, et_lastname, et_username, et_password, et_email, et_phone, et_country;
    private Button btn_register;

    private String firstname, lastname, username, password, email, phone, country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et_firstname = (EditText) findViewById(R.id.et_first_name);
        et_lastname = (EditText) findViewById(R.id.et_last_name);
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        et_email = (EditText) findViewById(R.id.et_email);
        et_phone = (EditText) findViewById(R.id.et_phone);
        et_country = (EditText) findViewById(R.id.et_country);
        btn_register = (Button) findViewById(R.id.btn_register);


        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstname = et_firstname.getText().toString();
                lastname = et_lastname.getText().toString();
                username = et_username.getText().toString();
                password = et_password.getText().toString();
                email = et_email.getText().toString();
                phone = et_phone.getText().toString();
                country = et_country.getText().toString();
                register( firstname,  lastname,  email,  phone,  password);
            }
        });

    }



    public void register(String firstname, String lastname, String email, String phone, String password){
        RegisterUser ru =new RegisterUser( firstname,  lastname,  email,  phone,  password);
        //TODO; Override methodes of UserClient
    }


}


