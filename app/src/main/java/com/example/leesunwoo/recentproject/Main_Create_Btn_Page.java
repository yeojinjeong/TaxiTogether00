package com.example.leesunwoo.recentproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


/**
 * Created by jyj on 2016-02-21.
 */
public class Main_Create_Btn_Page extends Activity {
    private EditText editText_topic;//제목
    private EditText editText_TextArea;//내용
    private Spinner[] info_spinner;
    private Button attend_Btn;
    private Button cancel_Btn;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_btn_screen);
        info_spinner = new Spinner[5];

        editText_topic=(EditText)findViewById(R.id.editTxt_topic);
        editText_TextArea=(EditText)findViewById(R.id.editTxt_TextArea);
        info_spinner[0]=(Spinner)findViewById(R.id.month_spinner);
        info_spinner[1]=(Spinner)findViewById(R.id.day_spinner);
        info_spinner[2]=(Spinner)findViewById(R.id.hour_spinner);
        info_spinner[3]=(Spinner)findViewById(R.id.minute_spinner);
        attend_Btn = (Button)findViewById(R.id.attend_btn);
        cancel_Btn = (Button)findViewById(R.id.cancel_btn);

    }

    public void attendBtnClicked(View v)
    {
        //제목, 날짜, 시간 인원

    }
    public void cancelBtnClicked(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }
}
