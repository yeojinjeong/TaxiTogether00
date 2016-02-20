package com.example.leesunwoo.recentproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * 처음에 어플 화면 띄워주는 곳.
 */
public class FirstScreen extends Activity
{
    public MenuButton c_menuBtn= new MenuButton();
    /**
     * 현재 화면에서 클릭하게된다면 login, join등이 가능해짐.
     */
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);
        c_menuBtn.setM_firstImgView((ImageView) findViewById(R.id.firstImgView));
    }

    /**
     * 화면을 클릭하게 된다면 이동하게됨.
     * @param v
     */
    public void onImgClicked(View v)
    {
        Intent intent = new Intent(getApplicationContext(), StartScreen.class);
        startActivity(intent);
        finish();
    }
}
