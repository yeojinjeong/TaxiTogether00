package com.example.leesunwoo.recentproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by user on 2016-02-20.
 */
public class Login_Btn_Page extends Activity
{
    private EditText edit_Id;
    private EditText edit_pw;
    private Button signBtn;
    private Button cancelBtn;
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login_btn_screen);
        edit_Id=(EditText)findViewById(R.id.editId_login);
        edit_pw=(EditText)findViewById(R.id.editpw_login);
        signBtn=(Button)findViewById(R.id.loginBtn);
        cancelBtn=(Button)findViewById(R.id.cancelBtn_login);
    }
    public void loginBtnClicked(View v)
    {
        String id = edit_Id.getText().toString();
        String pw = edit_pw.getText().toString();
        if(id.equals("1")&&pw.equals("1"))
        {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
        else
        {
            Toast.makeText(this, "올바른 아이디와 비밀번호를 입력해 주세요.", Toast.LENGTH_SHORT).show();
        }
    }
    public void cancelBtnClicked(View v)
    {
        Intent intent = new Intent(getApplicationContext(), StartScreen.class);
        startActivity(intent);
        finish();
    }

}
