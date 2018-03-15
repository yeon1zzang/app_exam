package com.example.a501_11.baseadapter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MyItemFormat> arItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1-2. 항목의 객체를 모아놓은 arrayList 생성
        arItem = new ArrayList<MyItemFormat>();

        //1-3. arrayList에 자료 객체를 만들어서 넣음
        arItem.add(new MyItemFormat(R.drawable.img1, R.drawable.img2,
                "체크 수트","트월 수트","3,300,000",
                "3,200,000", 4, 5));
        arItem.add(new MyItemFormat(R.drawable.img3, R.drawable.img4,
                "조깅 팬츠","조깅 팬츠","960,000",
                "1,300,000", 4, 3));
        arItem.add(new MyItemFormat(R.drawable.img5, R.drawable.img6,
                "울 스웨터","저지 자켓","1,050,000",
                "1,250,000", 2, 4.5));


        //int num_product = 6;
        /*for (int i = 0; i < (num_product/2); i++) {
            arItem.add(new MyItemFormat());
        }*/

        ListView listView = (ListView)findViewById(R.id.listview_main);
        listView.setAdapter(new MyAdapter(MainActivity.this,
                arItem, R.layout.listview_my_item));
    }
}
