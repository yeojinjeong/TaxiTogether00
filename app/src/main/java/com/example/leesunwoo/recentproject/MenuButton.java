package com.example.leesunwoo.recentproject;

import android.widget.Button;
import android.widget.ImageView;

/**
 * 모든 버튼이나 클릭했을 경우 구현되는 버튼을 모아놓은 곳.
 */
public class MenuButton {
    private android.widget.Button m_HomeBtn;
    private android.widget.Button m_ListBtn;
    private android.widget.Button m_InfoBtn;
    private android.widget.Button m_CreateBtn;
    private android.widget.ImageView m_imgViewMain;
    private android.widget.ImageView m_firstImgView;
    private android.widget.Button m_LoginBtn;
    private android.widget.Button m_JoinBtn;
    private android.widget.Button m_backBtn;
    private android.widget.Button m_refreshBtn;
    private android.widget.Button m_ForgetBtn;

//////////////get Image View//////////////
    public ImageView getM_firstImgView()
    {
        return m_firstImgView;
    }
    public ImageView getM_imgViewMain() {
        return m_imgViewMain;
    }

///////////////////get Button///////////
    public Button getM_backBtn()
    {
        return m_backBtn;
    }
    public Button getM_refreshBtn()
    {
        return m_refreshBtn;
    }
    public Button getM_JoinBtn()
    {
        return m_JoinBtn;
    }


    public android.widget.Button getM_HomeBtn()
    {
        return m_HomeBtn;
    }

    public android.widget.Button getM_ListBtn()
    {
        return m_ListBtn;
    }

    public android.widget.Button getM_InfoBtn()
    {
        return m_InfoBtn;
    }

    public android.widget.Button getM_CreateBtn()
    {
        return m_CreateBtn;
    }

    public Button getM_ForgetBtn()
    {
        return m_ForgetBtn;
    }

    public void setM_ForgetBtn(Button m_ForgetBtn)
    {
        this.m_ForgetBtn = m_ForgetBtn;
    }

    public Button getM_LoginBtn()
    {
        return m_LoginBtn;
    }

    /////////////////set ImageView////////////////////////////

    public void setM_firstImgView(ImageView m_firstImgView)
    {
        this.m_firstImgView = m_firstImgView;
    }

    public void setM_imgViewMain(ImageView m_imgViewMain)
    {
        this.m_imgViewMain = m_imgViewMain;
    }

    //////////////////set Button////////////////////////////

    public void setM_refreshBtn(Button m_refreshBtn)
    {
        this.m_refreshBtn = m_refreshBtn;
    }



    public void setM_backBtn(Button m_backBtn)
    {
        this.m_backBtn = m_backBtn;
    }

    public void setM_JoinBtn(Button m_JoinBtn)
    {
        this.m_JoinBtn = m_JoinBtn;
    }
    public void setM_HomeBtn(android.widget.Button m_HomeBtn)
    {
        this.m_HomeBtn = m_HomeBtn;
    }

    public void setM_ListBtn(android.widget.Button m_ListBtn)
    {
        this.m_ListBtn = m_ListBtn;
    }

    public void setM_InfoBtn(android.widget.Button m_InfoBtn)
    {
        this.m_InfoBtn = m_InfoBtn;
    }

    public void setM_CreateBtn(android.widget.Button m_CreateBtn)
    {
        this.m_CreateBtn = m_CreateBtn;
    }
    public void setM_LoginBtn(Button m_LoginBtn)
    {
        this.m_LoginBtn = m_LoginBtn;
    }



}
