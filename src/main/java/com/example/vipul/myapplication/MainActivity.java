package com.example.vipul.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usernameET;
    EditText passwordET;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameET = (EditText) findViewById(R.id.txt);
        passwordET = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.loginbutton);

        final String actualUsername = "A_Username";
        final String actualPassword = "Password";

        loginButton.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   String usernameEnterned = usernameET.getText().toString();
                   String passwordEntered = passwordET.getText().toString();

                   if ((actualPassword.equals(passwordEntered)) &&
                           usernameEnterned.equals(actualUsername)) {
                       Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                       MainActivity.this.startActivity(new Intent(MainActivity.this, SecondActivity.class));
                   } else {
                       Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                   }
               }
           }
        );
    }
}