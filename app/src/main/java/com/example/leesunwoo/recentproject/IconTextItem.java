package com.example.leesunwoo.recentproject;

import android.graphics.drawable.Drawable;

/**
 * Created by Leesunwoo on 2016-02-18.
 */
public class IconTextItem
{
    /**
     *  성별
     */
    private Drawable m_Draw_Gender;
    /**
     * 제목, 시간, 인원 들어가는 String형 배열
     */
    private String[] m_Str_Arr_Data;
    /**
     * 아이템이 있다면(선택가능하면) true를 가지고 있음.
     */
    private boolean m_bool_Selectable = true;

    /**
     * 초기화 구문
     */
    public IconTextItem(Drawable drawGender, String[] str_Arr_Obj)
    {
        m_Draw_Gender = drawGender;
        m_Str_Arr_Data = str_Arr_Obj;
    }
    /**
     * 성별그림, 제목, 날짜, 인원들을 한번에 받는 클래스.
     */
    public IconTextItem(Drawable drawIcon, String strObj1, String strObj2, String strObj3)
    {
        m_Str_Arr_Data = new String[3];
        m_Str_Arr_Data[0] = strObj1;
        m_Str_Arr_Data[1] = strObj2;
        m_Str_Arr_Data[2] = strObj3;
    }
    /**
     * 아이템이 선택 가능할 경우.
     */
    public boolean itemIsSelectable()
    {
        return m_bool_Selectable;
    }
    /**
     * 아이템을 세팅하는 경우.
     */
    public void setSelectable(boolean selectable)
    {
        m_bool_Selectable = selectable;
    }
    /**
     * 데이터(제목, 날짜, 인원)를 얻는 곳.
     */
    public String[] getstrArrData()
    {
        return m_Str_Arr_Data;
    }
    /**
     * 특정 데이터를 얻을때
     */
    public String getstrArrData(int index)
    {
        //만약에 특정 번지가 없거나(null) 또는 특정 번지의 길이가 index보다 작을 경우 null반환
        if(m_Str_Arr_Data==null || index >= m_Str_Arr_Data.length)
        {
            return null;
        }
        //그게아니라면 정상범위이므로 반환해준다.
        return m_Str_Arr_Data[index];
    }
    /**
     * 특정 데이터 전체를 수정하는 경우.
     */
    public void setStrArrData(String[] strObj)
    {
        m_Str_Arr_Data = strObj;
    }
    /**
     * 아이콘(성별)을 set 경우
     */
    public void setM_Draw_Gender(Drawable drawGender)
    {
        m_Draw_Gender = drawGender;
    }
    /**
     * 아이콘(성별)을 get하는 경우
     */
    public Drawable getM_Draw_Gender()
    {
        return m_Draw_Gender;
    }
    /**
     *
     */
    public int compareTo(IconTextItem other)
    {
        if(m_Str_Arr_Data != null)
        {
            String[] otherData = other.getstrArrData();
            if(m_Str_Arr_Data.length == otherData.length)
            {
                for(int i=0; i<m_Str_Arr_Data.length; i++)
                {
                    if(!m_Str_Arr_Data[i].equals(otherData[i]))
                    {
                        return 1;
                    }
                }
            }
            else
            {
                return -1;
            }
        }
        else
        {
            throw new IllegalArgumentException();
        }
        return 0;
    }
}
