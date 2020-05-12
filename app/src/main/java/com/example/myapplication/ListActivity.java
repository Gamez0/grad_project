package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

import data.BoardData;

public class ListActivity extends AppCompatActivity {
    RecyclerView rv;//
    ArrayList<BoardData> datas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rv = findViewById(R.id.list_rv);
        setData();
        setRv();
    }

    private void setRv() {
        RecyclerView.LayoutManager lm = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        BoardAdapter adapter = new BoardAdapter(this,datas);

        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void setData() {
        /*
        * String title;
        String writer;
        String date;
        String readcomment;
        * */
        datas.clear();
        datas.add(new BoardData("git연습","박지원","1621.03.21","조회수 23 댓글 2"));
        datas.add(new BoardData("이번엔 push까지","박지원","1621.03.21","조회수 23 댓글 2"));
        datas.add(new BoardData("push실패..","박지원","1621.03.21","조회수 23 댓글 2"));
        datas.add(new BoardData("ㅇㅇ","박지원","1621.03.21","조회수 23 댓글 2"));
        datas.add(new BoardData("다섯번째시도","박지원","1621.03.21","조회수 23 댓글 2"));
        datas.add(new BoardData("청산별곡6","박지원","1621.03.21","조회수 23 댓글 2"));


    }
}
