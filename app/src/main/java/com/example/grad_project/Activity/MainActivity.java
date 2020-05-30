package com.example.grad_project.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.grad_project.R;

public class MainActivity extends AppCompatActivity {
//aaaaaaaa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this,viewPagerActivity.class);

        startActivity(intent);
        finish();
    }
}
