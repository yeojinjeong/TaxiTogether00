package com.example.leesunwoo.recentproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * 처음 로그인, 회원가입등을 할 수 있는 곳
 */
public class StartScreen extends Activity {
    /**
     * 각 버튼 초기화 구성
     */
    public MenuButton c_menuBtn = new MenuButton();
    private Button login_Btn;
    private Button join_Btn;
    private Button forgot_Btn;

    /**
     * 각 버튼에 대한 아이디 설정
     * @param saveInstance
     */
    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.start_screen);  //스크린을 띄워 줌
        login_Btn = (Button)(findViewById(R.id.loginBtn));
        join_Btn = (Button)(findViewById(R.id.joinBtn));
        forgot_Btn = (Button)findViewById(R.id.forgetBtn);
    }

    /**
     * intent로 각각 연결해 줌.
     * @param v
     */
    //forget버튼을 눌렀을때.
    public void forgetBtnClicked(View v)
    {
        Intent intent1 = new Intent(getApplicationContext(),Forgot_Btn_Page.class);
        startActivity(intent1);
        finish();
    }
    //join버튼을 눌렀을 때
    public void joinBtnClicked(View v)
    {
        Intent intent2 = new Intent(getApplicationContext(), Join_Btn_Page.class);
        startActivity(intent2);
        finish();
    }
    //login버튼을 눌렀을 때
    public void loginBtnClicked(View v)
    {
        Intent intent3 = new Intent(getApplicationContext(), Login_Btn_Page.class);
        startActivity(intent3);
        finish();
    }


}
