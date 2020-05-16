package com.example.myapplication.Adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Item.EmoItem;
import com.example.myapplication.R;

import java.util.ArrayList;


public class EmoAdapter extends RecyclerView.Adapter<EmoAdapter.ViewHolder> {
    Context context;
    ArrayList<EmoItem> list;
    public EmoAdapter(Context context,ArrayList<EmoItem> list){
        super();
        this.context=context;
        this.list=list;

    }
    @Override
    public void onBindViewHolder(@NonNull EmoAdapter.ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }
    @NonNull
    @Override
    public EmoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_emo,parent,false);
        return new ViewHolder(itemView);
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name = itemView.findViewById(R.id.item_emo_name);
        TextView subName = itemView.findViewById(R.id.item_emo_subname);
        public ViewHolder(@NonNull View itemView){
            super(itemView);


        }
        public void bind(EmoItem emoItem){
            name.setText(emoItem.getName());
            subName.setText(emoItem.getSubName());

        }
    }


}
