package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class GridActivity extends AppCompatActivity {
    String[] buttonName={
            "joy","sadness","fear","anger","admiration"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        GridView gridlist=(GridView)findViewById(R.id.gridlist);
        ButtonAdapter buttonAdapter=new ButtonAdapter(this,buttonName);
        gridlist.setAdapter(buttonAdapter);
    }
}
