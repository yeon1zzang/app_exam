package com.example.a501_11.baseadapterexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 501-11 on 2018-03-13.
 */

public class MyItemAdapter extends BaseAdapter {

    ArrayList<MainActivity.Item_dataFormat> arrayList; //listview에 표현할 정보
    LayoutInflater inflater; //항목을 표현하는 객체의 변수
    Context context; //MainActivity의 정보를 저장하는 변수
    int item_layout; //항목의 레이아웃 아이디

    public MyItemAdapter(ArrayList<MainActivity.Item_dataFormat> arrayList,
                         Context context, int item_layout) {

        this.arrayList = arrayList;
        this.context = context;
        this.item_layout = item_layout;
        //MainActivity의 정보를 활용하여 항목에 표시할 준비
        this.inflater = (LayoutInflater)context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
    }


    //항목의 개수를 알려주는 함수
    @Override
    public int getCount() {
        return arrayList.size();
    }

    //항목의 정보 객체를 알려주는 함수
    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    //항목의 정보 객체의 인덱스를 알려주는 함수
    @Override
    public long getItemId(int i) {
        return i;
    }

    //항목의 정보를 항목 레이아웃에 표현하는 함수
    @Override
    /*
        *매개변수 설명
        *i : arrayLisy,listview
     */
    public View getView(int i, View view, ViewGroup viewGroup) {
        //첫번째 항목을 만드는 경우 (아무것도 없음)
        if(view == null) {
            view = inflater.inflate(item_layout, viewGroup, false);
        }

        //항목에 들어가는 컴포넌트의 객체
        ImageView img = (ImageView)view.findViewById(R.id.imageview);
        TextView title = (TextView)view.findViewById(R.id.textView_title);
        TextView subtitle = (TextView)view.findViewById(R.id.textView_text);

        //arrayList 에서 정보를 가져와서 컴포넌트에 값을 배치
        img.setImageResource(arrayList.get(i).img);
        title.setText(arrayList.get(i).title);
        subtitle.setText(arrayList.get(i).subTitle);
        return view;
    }
}
