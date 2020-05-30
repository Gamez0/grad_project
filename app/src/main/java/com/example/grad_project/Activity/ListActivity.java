package com.example.grad_project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.grad_project.Adapter.BoardAdapter;
import com.example.grad_project.Item.BoardItem;
import com.example.grad_project.R;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    RecyclerView rv;//
    ArrayList<BoardItem> datas = new ArrayList<>();
    int emotion_value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        emotion_value = getIntent().getExtras().getInt("emotion");
        Toast.makeText(getApplicationContext(), "받은 감정 : "+emotion_value, Toast.LENGTH_SHORT).show();

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
        datas.add(new BoardItem("git연습","박지원","1621.03.21","조회수 23 댓글 2"));
        datas.add(new BoardItem("이번엔 push까지","박지원","1621.03.21","조회수 23 댓글 2"));
        datas.add(new BoardItem("push실패..","박지원","1621.03.21","조회수 23 댓글 2"));
        datas.add(new BoardItem("ㅇㅇ","박지원","1621.03.21","조회수 23 댓글 2"));
        datas.add(new BoardItem("다섯번째시도","박지원","1621.03.21","조회수 23 댓글 2"));
        datas.add(new BoardItem("여섯째!","박지원","1621.03.21","조회수 23 댓글 2"));


    }
}
