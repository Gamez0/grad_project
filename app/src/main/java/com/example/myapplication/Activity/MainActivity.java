package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
//aaaaaaaa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = new Intent(this,ListActivity.class);
        startActivity(intent);
        finish();
    }
}
