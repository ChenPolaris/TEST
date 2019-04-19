package com.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    EditText name;
    EditText password;
    Button btnLogin;
    Button btnSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = (EditText)findViewById(R.id.name);
        password = (EditText)findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(listener);
        //为按钮绑定监听器listener
        btnSignin = (Button)findViewById(R.id.btn_signin);
        btnSignin.setOnClickListener(listener);
    }
    //按钮响应事件
    // 方法二：监听接口方法
    //同时监听多个按钮
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_signin:
                    Toast.makeText(getApplicationContext(), "进入注册", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(loginActivity.this,SigninActivity.class));
                    break;
                case R.id.btn_login:
                    btn_login_click();//较为复杂的响应事件单列出函数实现
                    break;
            }
        }
    };

    //btnlogin按钮的响应事件
    public void btn_login_click(){
        String username = "tys";
        String userkey = "tys-050720";
        //trim()去掉字符串前后空白，去除字符串中的制表符
        String userN = name.getText().toString().trim();
        String userPWD = password.getText().toString().trim();
        if(userN.equals(username) && userPWD.equals(userkey))
        {
            //打印,
            // toast参数context要求的上下文，最容易出错
            //text为要显示的内容
            //第三个参数是显示时长
            Toast.makeText(getApplicationContext(),"登陆成功",Toast.LENGTH_SHORT).show();
            //跳转界面
            startActivity(new Intent(loginActivity.this,ClientMainActivity.class));
        }
        else{
            Toast.makeText(getApplicationContext(),"登陆失败",Toast.LENGTH_SHORT).show();
        }
    }
}

