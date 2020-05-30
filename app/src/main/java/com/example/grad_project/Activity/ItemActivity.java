package com.example.grad_project.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.grad_project.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import com.example.grad_project.Dialog.ReviewDialog;

public class ItemActivity extends AppCompatActivity {
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        fab = findViewById(R.id.item_edit);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReviewDialog dialog = new ReviewDialog(ItemActivity.this);
                dialog.show();
            }
        });
    }
}