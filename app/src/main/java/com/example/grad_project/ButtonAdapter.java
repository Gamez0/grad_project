package com.example.grad_project;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

public class ButtonAdapter extends BaseAdapter {
    Context context = null;
    String[] buttonName = null;

    public ButtonAdapter(Context context, String[] buttonName) {
        this.context = context;
        this.buttonName = buttonName;
    }

    public int getCount() {
        return (null != buttonName) ? buttonName.length : 0;
    }

    public Object getItem(int position) {
        return buttonName[position];
    }


    public long getItemId(int position) {
        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        Button button = null;

        if (null != convertView) {
            button = (Button) convertView;
        } else {

            button = new Button(context);
            button.setText(buttonName[position]);

            //------------------------------------------------------------

        }

        return button;


    }
}
