package com.example.a501_11.baseadapter2;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 501-11 on 2018-03-14.
 */


    //2. Base Adapter 만들기
public class MyAdapter extends BaseAdapter {
    //2-1. 매개변수 만들기

    /*
    * arrayList : 자료를 저장하고 있는 arrayList
    * LayoutInflater : 항목을 표현하기 위해 활용하는 객체
    * Context : MainActivity의 정보
    * item_layout_id : 항목 Layout 파일의 아이디
     */

    Context context;
    LayoutInflater layoutInflater;
    ArrayList<MyItemFormat> arrayList;
    int item_layout_id;

    //2-2. Adapter의 생성자 만들기
    public MyAdapter(Context context, ArrayList<MyItemFormat> arrayList,
                     int item_layout_id) {
        this.context = context;
        this.arrayList = arrayList;
        this.item_layout_id = item_layout_id;
        //항목을 표시할 객체 LayoutInflater를 생성
        this.layoutInflater =
                (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    //2-3. arrayList의 저장된 항목의 개수를 알려주는 getCount() 함수 수정
    @Override
    public int getCount() {
        return arrayList.size();
    }

    //2-4. arrayList에 저장된 항목 객체를 알려주는 getItem() 함수 수정
    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    //2-5. arrayList의 인덱스 (순서번호)를 알려주는 getItemId() 함수를 수정
    @Override
    public long getItemId(int i) {
        return i;
    }

    //2-6.arrayList에 저장한 정보를 항목 레이아웃에 표현하는 함수
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //항목 레이아웃을 Listview에 추가해주는 부분
        if (view == null) {
            view = layoutInflater.inflate(item_layout_id,
                    viewGroup,
                    false);
        }

        //컴포넌트 객체를 만듬
        ImageView product_img_left = (ImageView)view.findViewById(R.id.product_img_left);
        ImageView product_img_right = (ImageView)view.findViewById(R.id.product_img_right);
        TextView product_name_left = (TextView)view.findViewById(R.id.product_name_left);
        TextView product_name_right = (TextView)view.findViewById(R.id.product_name_right);
        TextView product_price_left = (TextView)view.findViewById(R.id.product_price_left);
        TextView product_price_right = (TextView)view.findViewById(R.id.product_price_right);
        TextView product_score_left = (TextView)view.findViewById(R.id.product_score_left);
        TextView product_score_right = (TextView)view.findViewById(R.id.product_score_right);
        RatingBar product_star_left = (RatingBar)view.findViewById(R.id.product_star_left);
        RatingBar product_star_right = (RatingBar)view.findViewById(R.id.product_star_right);
        ConstraintLayout constraintLayout_left_box =
                (ConstraintLayout)view.findViewById(R.id.constraintLayout_left_box);
        ConstraintLayout constraintLayout_right_box =
                (ConstraintLayout)view.findViewById(R.id.constraintLayout_right_box);

        //컴포넌트 객체에 데이터를 추가
        product_img_left.setImageResource(arrayList.get(i).product_img_left);
        product_img_right.setImageResource(arrayList.get(i).product_img_right);
        product_name_left.setText(arrayList.get(i).product_name_left);
        product_name_right.setText(arrayList.get(i).product_name_right);
        product_price_left.setText(arrayList.get(i).product_price_left);
        product_price_right.setText(arrayList.get(i).product_price_right);
        product_score_left.setText(Double.toString(arrayList.get(i).product_score_left));
        product_score_right.setText(Double.toString(arrayList.get(i).product_score_right));
        product_star_left.setRating(Float.parseFloat(Double.toString(arrayList.get(i).product_score_left)));
        product_star_right.setRating(Float.parseFloat(Double.toString(arrayList.get(i).product_score_right)));

        //컴포넌트에 리스너 등록
        constraintLayout_left_box.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context,"왼쪽 박스가 선택됨", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        constraintLayout_right_box.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context,"오른쪽 박스가 선택됨", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        //return 값을 view로 설정
        return view;
    }
}
