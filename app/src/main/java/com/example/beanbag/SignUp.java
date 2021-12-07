package com.example.beanbag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText name, email, password, cpassword,username;
    RadioButton btnmale ,btnfmale ;
    TextView tv;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name=(EditText)findViewById(R.id.name);
        img = (ImageView) findViewById(R.id.image);
        email = (EditText) findViewById(R.id.eEmail);
        password = (EditText) findViewById(R.id.epassword);
        cpassword=(EditText)findViewById(R.id.Cpassword);
        username=(EditText)findViewById(R.id.username);
        btnmale=(RadioButton)findViewById(R.id.male);
        btnfmale=(RadioButton)findViewById(R.id.Fmale);
    }
    public void addRecord(View view) {
      DBHelper db = new  DBHelper(this);
        String res=db.addRecord(name.getText().toString(),username.getText().toString(),email.getText().toString(),password.getText().toString(),cpassword.getText().toString(),btnfmale.getText().toString(),btnfmale.getText().toString());
        Toast.makeText(this,res,Toast.LENGTH_LONG).show();
        name.setText("");
        username.setText("");
        email.setText("");
        password.setText("");
        cpassword.setText("");
        btnmale.setText("");
        btnfmale.setText("");
    }
}