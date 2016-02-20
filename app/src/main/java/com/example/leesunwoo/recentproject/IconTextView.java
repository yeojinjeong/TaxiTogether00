package com.example.leesunwoo.recentproject;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Leesunwoo on 2016-02-18.
 */
public class IconTextView extends LinearLayout {
    //성별
    private ImageView m_Img_Gender;
    // 제목
    private TextView m_TextV_Topic;
    //시각
    private TextView m_TextV_Time;
    //인원
    private TextView m_TextV_Person;

    public IconTextView(Context context, IconTextItem aItem)
    {
        super(context);
        //레이아웃 인플레이션
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.list_item, this, true);
        ////////////////////
        //성별 id 설정
        m_Img_Gender = (ImageView) findViewById(R.id.genderImg);
        //성별 그려줌.
        m_Img_Gender.setImageDrawable(aItem.getM_Draw_Gender());
        ///////////////////////
        //제목 설정
        m_TextV_Topic = (TextView) findViewById(R.id.topic);
        m_TextV_Topic.setText(aItem.getstrArrData(0));
        //날짜 설정
        m_TextV_Time = (TextView) findViewById(R.id.time);
        m_TextV_Time.setText(aItem.getstrArrData(1));
        //인원 설정
        m_TextV_Person= (TextView)findViewById(R.id.person);
        m_TextV_Person.setText(aItem.getstrArrData(2));
    }
    /**
     * 안에 들어갈 말 설정
     */
    public void setText(int index, String data)
    {
        if(index == 0)
        {
            m_TextV_Topic.setText(data);
        }
        else if(index ==1)
        {
            m_TextV_Time.setText(data);
        }
        else if(index ==2)
        {
            m_TextV_Person.setText(data);
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 성별 아이콘 설정
     */
    public void setGender(Drawable gender)
    {
        m_Img_Gender.setImageDrawable(gender);
    }
}
