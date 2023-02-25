package com.example.revgen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //public void onSignUpTxtClick(View view){
        //method that will execute if the user clicks "Don't have an account? Sign Up"
        //TextView txt_SignUp = findViewById(R.id.textView_SignUp_SignIn);
        //startActivity(new Intent(this, SignUp.class));
    //}
}