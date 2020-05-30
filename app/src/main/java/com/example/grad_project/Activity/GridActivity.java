package com.example.grad_project.Activity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.grad_project.Adapter.EmoAdapter;
import com.example.grad_project.Item.EmoItem;
import com.example.grad_project.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {
    GridView gridView;
    private TabLayout tabLayout;

    ArrayList<EmoItem> datas = new ArrayList<EmoItem>(){
        {add(new EmoItem("Joy","기쁨,즐거움"));
        add(new EmoItem("Sadness","슬픔,그리움,걱정,사랑"));
            add(new EmoItem("Fear","두려움,무기력함"));
            add(new EmoItem("Anger","저항의지,충절,역겨움"));
            add(new EmoItem("Admiration","자연,종교"));

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);
        final Intent intent_emotion = new Intent(getApplicationContext(), ListActivity.class);
        tabLayout = (TabLayout) findViewById(R.id.tabs) ;

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int pos = tab.getPosition();

                if(pos ==0){
                    //fragment를 호출하는게 좋음
                    Intent intent = new Intent(getApplicationContext(),viewPagerActivity.class);
                    startActivity(intent);
                    finish();

                }else{
                    //fragment를 호출하는게 좋음
                    // 현재이므로 stay
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        EmoAdapter emoAdapter = new EmoAdapter(getApplicationContext(),datas);

        gridView =  (GridView) findViewById(R.id.grid_view);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    // 감정을 누르면 이동할 fragment 부르거나 intent
                    case 0:
//                        Toast.makeText(getApplicationContext(), "감정 : 기쁨", Toast.LENGTH_SHORT).show();
                        intent_emotion.putExtra("emotion",position);
                        startActivity(intent_emotion);
                        break;
                    case 1:
//                        Toast.makeText(getApplicationContext(), "감정 : 슬픔", Toast.LENGTH_SHORT).show();
                        intent_emotion.putExtra("emotion",position);
                        startActivity(intent_emotion);
                        break;
                    case 2:
//                        Toast.makeText(getApplicationContext(), "감정 : 두려움", Toast.LENGTH_SHORT).show();
                        intent_emotion.putExtra("emotion",position);
                        startActivity(intent_emotion);
                        break;
                    case 3:
//                        Toast.makeText(getApplicationContext(), "감정 : 저항의지", Toast.LENGTH_SHORT).show();
                        intent_emotion.putExtra("emotion",position);
                        startActivity(intent_emotion);
                        break;
                    case 4:
//                        Toast.makeText(getApplicationContext(), "감정 : 자연", Toast.LENGTH_SHORT).show();
                        intent_emotion.putExtra("emotion",position);
                        startActivity(intent_emotion);
                        break;
                }
            }
        });
        gridView.setAdapter(emoAdapter);
    }



}
