package com.example.leesunwoo.recentproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 2016-02-20.
 */
public class Forgot_Btn_Page extends Activity
{
    private EditText edit_phoneNum;
    private EditText edit_emailAddr;
    private Button signBtn;
    private Button cancelBtn;
    public MenuButton c_menuBtn = new MenuButton();
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login_btn_screen);
        edit_phoneNum=(EditText)findViewById(R.id.edit_id_forgot_txt);
        edit_emailAddr=(EditText)findViewById(R.id.edit_email_forgot_txt);
        signBtn=(Button)findViewById(R.id.findBtn_forgot_btn);
        cancelBtn=(Button)findViewById(R.id.cancelBtn_forgot_btn);
    }
    public void signBtnClicked(View v)
    {
        Intent intent = new Intent(getApplicationContext(), StartScreen.class);
        startActivity(intent);
        finish();
    }
    public void cancelBtnClicked(View v)
    {
        Intent intent = new Intent(getApplicationContext(), StartScreen.class);
        startActivity(intent);
        finish();
    }
}
