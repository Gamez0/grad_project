package com.example.grad_project.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.grad_project.R;

public class ReviewDialog extends Dialog {
    RatingBar star;
    EditText content;
    TextView cancel;
    TextView confirm;

    public ReviewDialog(@NonNull final Context context) {
        super(context);
        setContentView(R.layout.dialog_review);
        star = findViewById(R.id.dialog_review_star);
        content = findViewById(R.id.dialog_text);
        cancel = findViewById(R.id.dialog_review_cancel);
        confirm = findViewById(R.id.dialog_review_confirm);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,star.getRating()+" "+content.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
