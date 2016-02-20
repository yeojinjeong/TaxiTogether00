package com.example.leesunwoo.recentproject;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 리스트뷰와 리스트뷰 하나당 들어갈 객체에 들어갈 변수들을 연결시켜줄 adapter
 * Created by Leesunwoo on 2016-02-18.
 */
public class IconTextListAdapter extends BaseAdapter
{
    private Context mContext;

    private List<IconTextItem> m_List_items = new ArrayList();

    public IconTextListAdapter(Context context)
    {
        mContext = context;
    }

    public void addItem(IconTextItem it)
    {
        m_List_items.add(it);
    }

    public void setM_List_items(List<IconTextItem> lit)
    {
        m_List_items = lit;
    }

    //얼마나 들어가 있는지
    public int getCount()
    {
        return m_List_items.size();
    }

    public Object getItem(int position)
    {
        return m_List_items.get(position);
    }

    public boolean areAllItemsSelectable()
    {
        return false;
    }

    public boolean isSelectable(int position)
    {
        try
        {
            return m_List_items.get(position).itemIsSelectable();
        }
        catch(IndexOutOfBoundsException ex)
        {
            return false;
        }
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        IconTextView itemView;
        if (convertView == null) {
            itemView = new IconTextView(mContext, m_List_items.get(position));
        } else {
            itemView = (IconTextView) convertView;

            itemView.setGender(m_List_items.get(position).getM_Draw_Gender());
            itemView.setText(0, m_List_items.get(position).getstrArrData(0));
            itemView.setText(1, m_List_items.get(position).getstrArrData(1));
            itemView.setText(2, m_List_items.get(position).getstrArrData(2));
        }

        return itemView;
    }

}

