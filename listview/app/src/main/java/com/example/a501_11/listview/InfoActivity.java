package com.example.a501_11.listview;

import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 501-11 on 2018-02-28.
 */

public class InfoActivity extends AppCompatActivity {
    String[] movie_title, movie_actor, movie_director, movie_type;


    //1. 변수 만들기
    TypedArray movie_img;
    TextView textView_title, textView_dir_act, textView_type;
    ImageView imgView_poster;
    Button btn_go_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        Intent intent = getIntent();

        int movie_index = intent.getIntExtra("movie_index", -1);

        if(movie_index != -1) {
            Toast.makeText(InfoActivity.this,
                    Integer.toString(movie_index),
                    Toast.LENGTH_LONG).show();
        }

        movie_title = getResources().getStringArray(R.array.movie_title);
        movie_actor = getResources().getStringArray(R.array.movie_actor);
        movie_director = getResources().getStringArray(R.array.movie_director);
        movie_type = getResources().getStringArray(R.array.movie_type);
        movie_img = getResources().obtainTypedArray(R.array.movie_img);

        if(movie_index != -1) {
            Toast.makeText(InfoActivity.this,
                    movie_actor[movie_index]+
                            "/"+movie_type[movie_index]+
                            "/" +movie_director[movie_index],
                    Toast.LENGTH_LONG).show();
        }

        //2. 컴포넌트의 객체 만들기
        textView_title = (TextView)findViewById(R.id.textView_title);
        textView_dir_act = (TextView)findViewById(R.id.textView_dir_act);
        textView_type = (TextView)findViewById(R.id.textView_type);
        imgView_poster = (ImageView)findViewById(R.id.imgView_poster);
        btn_go_book = (Button)findViewById(R.id.btn_go_book);


        if (movie_index != -1){
            //3. 데이터를 컴포넌트를 통해 출력하기
            textView_title.setText(movie_title[movie_index]);
            imgView_poster.setImageResource(
                    movie_img.getResourceId(movie_index,-1)
            );

            /*switch (movie_index){
                case 0:
                    imgView_poster.setImageResource(R.drawable.poster2);
                    break;

                case 1:
                    imgView_poster.setImageResource(R.drawable.poster3);
                    break;

                case 2:
                    imgView_poster.setImageResource(R.drawable.poster4);
                    break;
            }*/
        }

        //4. 리스너 객체 만들기
        GoBookBtnListener goBookBtnListener = new GoBookBtnListener();
        //5. 버튼에 리스너 객체 등록하기
        btn_go_book.setOnClickListener(goBookBtnListener);
    }

    //3. 리스너 만들기 (예약버튼 누르면 예매페이지로 이동)
    class GoBookBtnListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(InfoActivity.this,BookActivity.class);
            startActivity(intent);
        }
    }
}
