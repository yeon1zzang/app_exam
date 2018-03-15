package com.example.a501_11.baseadapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item_dataFormat> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //arrayList 객체 생성
        arrayList = new ArrayList<Item_dataFormat>();
        arrayList.add(new Item_dataFormat(R.drawable.ic_launcher_foreground,
                "galaxy","samsung"));
        arrayList.add(new Item_dataFormat(R.drawable.ic_launcher_background,
                "iphone","apple"));
        arrayList.add(new Item_dataFormat(R.drawable.ic_launcher_background,
                "pixel","google"));

        ListView listView = (ListView)findViewById(R.id.listview_main);
        listView.setAdapter(new MyItemAdapter(arrayList,this,R.layout.listview_item));
    }

    //항목에 표현할 자료들을 저장하는 객체의 class
    class Item_dataFormat {
        int img;
        String title;
        String subTitle;

        public Item_dataFormat(int img, String title, String subTitle) {
            this.img = img;
            this.title = title;
            this.subTitle = subTitle;
        }
    }
}
