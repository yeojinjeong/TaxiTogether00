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
public class Join_Btn_Page extends Activity
{
    private EditText edit_Id;
    private EditText edit_pw;
    private EditText edit_phoneNum;
    private EditText edit_emailAddr;
    private Button signBtn;
    private Button cancelBtn;
    public MenuButton c_menuBtn = new MenuButton();
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login_btn_screen);
        edit_Id=(EditText)findViewById(R.id.editId_joinbtn);
        edit_pw=(EditText)findViewById(R.id.editpw_joinbtn);
        edit_phoneNum=(EditText)findViewById(R.id.edit_phoneN_joinbtn);
        edit_emailAddr=(EditText)findViewById(R.id.edit_email_joinbtn);
        signBtn=(Button)findViewById(R.id.signBtn_joinbtn);
        cancelBtn=(Button)findViewById(R.id.cancelBtn_joinbtn);
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
