package com.example.a501_11.activityexam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.VideoView;

/**
 * Created by 501-11 on 2018-02-27.
 */

public class FirstActivity extends AppCompatActivity {
    VideoView videoView_first;
    Button btn_first_to_main;
    RatingBar ratingBar_first;

    @Override
    protected void  onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //3. 화면 전환 후 이전 액티비티에서 보낸 인텐트를 수신
        Intent intent = getIntent();

        //4. 인텐트 안에서 데이터를 읽음
        String temp = intent.getIntExtra("MainToFirst");
        int temp_number = intent.getIntExtra("MainToFirst_number", -1);

        if(temp != null){
            Toast.makeText(FirstActivity.this,
                    temp,
                    Toast.LENGTH_LONG).show();
        }




        //2. videoview 객체 만들기
        videoView_first = (VideoView)findViewById(R.id.videoView_first);
        //3. 동영상 파일 경로 설정하기
        String uriPath = "android.resource://"+getPackageName() + "/" +R.raw.rain;
        //4. uri로 동영상 연결하기
        Uri uri = Uri.parse(uriPath);
        //5. videoview 객체에 uri(동영상의 정보)등록하기
        videoView_first.setVideoURI(uri);

        //6. 동영상을 컨트롤 할 수 있는 media controller를 videoview에 추가하기
        final MediaController mediaController = new MediaController(this);
        videoView_first.setMediaController(mediaController);

        //2. 컴포넌트의 객체 만들기
        btn_first_to_main = (Button)findViewById(R.id.btn_first_to_main);
        //4. 리스너 객체 만들기
        FirstToMainListenner firstToMainListenner = new FirstToMainListenner();
        //5. 리스너를 컴포넌트의 객체에 등록하기
        btn_first_to_main.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //5. 수신한 데이터를 처리 후 이전 액티비티에 보내기 위한 인텐트 생성하고 데이터 추가
                Intent intent = new Intent();
                intent.putExtra("MainToFirst", "first에서 main에게 전달하는 데이터");
                setResult(RESULT_OK, intent);

                finish();
            }
        });


        //2. 컴포넌트의 객체 만들기
        ratingBar_first = (RatingBar)findViewById(R.id.ratingBar_first);
        //4. 리스너 객체 만들기
        RatingListener ratingListener = new RatingListener();
        //5. 컴포넌트 객체에 리스너 객체 등록
        ratingBar_first.setOnRatingBarChangeListener(ratingListener);


    }

    //3. 리스너 만들기
    class FirstToMainListenner implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            //현재 화면을 제거
            finish();
        }
    }

    //3. 리스너 만들기 RatingBar.OnRatingBarChangeListener
    class RatingListener implements RatingBar.OnRatingBarChangeListener {

        @Override
        public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
            Toast.makeText(FirstActivity.this,
                    Double.toString(v),
                    Toast.LENGTH_LONG).show();
        }
    }
}
