package com.example.grad_project.Adapter;
//슈퍼클래스가 adapter<vhc>
//file > depences > app> +>lib dendence > recycler view
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grad_project.Activity.ItemActivity;
import com.example.grad_project.R;

import java.util.ArrayList;

import com.example.grad_project.Item.BoardItem;

public class BoardAdapter extends RecyclerView.Adapter<BoardAdapter.ViewHolder>{
//여기까지 쓰고 alt+enter
    Context mContext;
    ArrayList<BoardItem> data;

    public BoardAdapter(Context mContext, ArrayList<BoardItem> data) {
        this.mContext = mContext;
        this.data = data;
    }

    @NonNull
    @Override
    public BoardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_board,parent,false);
        return new ViewHolder(itemView);
    }
    //R.layout.item_board 이게 중요

    @Override
    public void onBindViewHolder(@NonNull BoardAdapter.ViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title = itemView.findViewById(R.id.item_board_title);
        TextView writer = itemView.findViewById(R.id.item_board_writer);
        TextView date = itemView.findViewById(R.id.item_board_date);
        TextView comment = itemView.findViewById(R.id.item_board_read_comment);

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //click event
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(mContext, title.getText().toString(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mContext, ItemActivity.class);
                    mContext.startActivity(intent);

                }
            });
        }

        public void bind(BoardItem boardItem) {
            title.setText(boardItem.getTitle());
            writer.setText(boardItem.getWriter());
            date.setText(boardItem.getDate());
            comment.setText(boardItem.getReadComment());

        }
    }
}







