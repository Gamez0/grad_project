package com.example.myapplication.Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.ButtonAdapter;
import com.example.myapplication.R;

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
