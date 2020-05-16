package com.example.myapplication.Adapter;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Item.EmoItem;
import com.example.myapplication.R;

import java.util.ArrayList;


public class EmoAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    ArrayList<EmoItem> emoList;

    public EmoAdapter(Context context,ArrayList<EmoItem> list){
        super();
        this.context=context;
        emoList=list;

    }
    @Override
    public int getCount() {
        return emoList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 5;
    }

    @Override
    public int getItemViewType(int position) {
        if(position==0){
            return 0;
        }else if(position==1){
            return 1;
        }else if(position==2){
            return 2;
        }else if(position==3){
            return 3;
        }else if(position==4){
            return 4;
        }else {
            return 5;
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GridView grid = (GridView)parent;
        int size = grid.getColumnWidth();

        if(inflater==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView == null){
            convertView = inflater.inflate(R.layout.row_item,null);
            convertView.setLayoutParams(new GridView.LayoutParams(size, size));
        }
        TextView emoName = convertView.findViewById(R.id.emotionNameTextView);
        TextView emoSubName = convertView.findViewById(R.id.emotionSubNameTextView);

        emoName.setText(emoList.get(position).getName());
        emoSubName.setText(emoList.get(position).getSubName());

        switch(position){
            case 0:
                convertView.setBackgroundColor(Color.parseColor("#a8d8ea"));
                break;
            case 1:
                convertView.setBackgroundColor(Color.parseColor("#aa96da"));
                break;
            case 2:
                convertView.setBackgroundColor(Color.parseColor("#fcbad3"));
                break;
            case 3:
                convertView.setBackgroundColor(Color.parseColor("#ffffd2"));
                break;
            case 4:
                convertView.setBackgroundColor(Color.parseColor("#bb3b0e"));
                break;
        }
        return convertView;
    }
}
