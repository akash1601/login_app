package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText LoginID;
    private EditText Password;
    private Button Login;
    private Button SignUP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginID= (EditText) findViewById(R.id.editText);
        Password= (EditText) findViewById(R.id.editText2);
        Login=(Button) findViewById(R.id.button);
        SignUP=(Button) findViewById(R.id.button2);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(LoginID.getText().toString(),Password.getText().toString());
            }
        });
        SignUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();

            }
        });
    }
    private void open(){
        Intent intent=new Intent(MainActivity.this, SignupActivity.class);
        startActivity(intent);
    }
    private void validate(String userName, String userPassword){
        if ((userName.equals("Admin")) && (userPassword.equals("Admin"))){
            Intent intent=new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        } else {

            System.out.println("try again");

        }
    }
}

