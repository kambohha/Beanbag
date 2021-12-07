package com.example.beanbag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    Button btnsignup,btnnavigation ,btnHome;
    EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        btnsignup = findViewById(R.id.btnsignup);
        btnnavigation = findViewById(R.id.btnreg);
        email=findViewById(R.id.eEmail);
        password=findViewById(R.id.epassword);
        btnnavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennavigation();
            }
        });
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignup();


            }
        });
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
    public  void opensignup(){
        new DBHelper(this);
        Intent i=new Intent(this,SignUp.class);
        startActivity(i);
    }
    public void opennavigation(){



    }
    public void openHome(){
        Intent i=new Intent(this,Home.class);
        startActivity(i);
    }


}




