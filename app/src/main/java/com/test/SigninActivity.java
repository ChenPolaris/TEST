package com.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SigninActivity extends AppCompatActivity {

    EditText name;
    EditText password;
    EditText password_agin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        name = (EditText)findViewById(R.id.name);
        password = (EditText)findViewById(R.id.password);
        password_agin = (EditText)findViewById(R.id.passwordAgin);
    }

    public void SignIn(View view) {
        String userPWD = password.getText().toString().trim();
        String userPWDA = password_agin.getText().toString().trim();
        if(userPWDA.equals(userPWD)){
            Toast.makeText(getApplicationContext(),"注册成功",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"注册失败",Toast.LENGTH_LONG).show();
        }
    }
}
