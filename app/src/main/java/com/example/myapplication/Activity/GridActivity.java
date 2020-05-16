package com.example.myapplication.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.myapplication.Adapter.EmoAdapter;
import com.example.myapplication.Item.EmoItem;
import com.example.myapplication.R;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {
    RecyclerView rv;
    EmoAdapter adapter;
    GridLayoutManager layoutManager;
    ArrayList<EmoItem> datas = new ArrayList<EmoItem>(){
        {add(new EmoItem("Joy","기쁨,즐거움"));
        add(new EmoItem("Sadness","슬픔,그리움,걱정,사랑"));
            add(new EmoItem("Fear","두려움,무기력함"));
            add(new EmoItem("Anger","저항의지,충절,역겨움"));
            add(new EmoItem("Admiration","자연,종교"));

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        rv = (RecyclerView) findViewById(R.id.gridlist);
        adapter=new EmoAdapter(getApplicationContext(),datas);
        layoutManager=new GridLayoutManager(getApplicationContext(),2);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }



}
