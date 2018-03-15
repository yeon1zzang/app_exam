package com.example.a501_11.activityexam;

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

public class SecondActivity extends AppCompatActivity {
    VideoView videoView_second;
    Button btn_second_to_main;
    RatingBar ratingBar_second;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //2. videoview 객체 만들기
        videoView_second = (VideoView)findViewById(R.id.videoView_second);
        //3. 동영상 파일 경로 설정하기
        String uriPath = "android.resource://"+getPackageName() + "/" +R.raw.moon;
        //4. uri로 동영상 연결하기
        Uri uri = Uri.parse(uriPath);
        //5. videoview 객체에 uri(동영상의 정보)등록하기
        videoView_second.setVideoURI(uri);

        //6. 동영상을 컨트롤 할 수 있는 media controller를 videoview에 추가하기
        final MediaController mediaController = new MediaController(this);
        videoView_second.setMediaController(mediaController);

        //2. 컴포넌트의 객체 만들기
        btn_second_to_main = (Button)findViewById(R.id.btn_second_to_main);
        //4. 리스너 객체 만들기
        SecondActivity.SecondToMainListenner SecondToMainListenner = new SecondActivity.SecondToMainListenner();
        //5. 리스너를 컴포넌트의 객체에 등록하기
        btn_second_to_main.setOnClickListener(SecondToMainListenner);

        //2. 컴포넌트의 객체 만들기
        ratingBar_second = (RatingBar)findViewById(R.id.ratingBar_second);
        //4. 리스너 객체 만들기
        SecondActivity.RatingListener ratingListener = new SecondActivity.RatingListener();
        //5. 컴포넌트 객체에 리스너 객체 등록
        ratingBar_second.setOnRatingBarChangeListener(ratingListener);
    }

    //3. 리스너 만들기
    class SecondToMainListenner implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            //현재 화면을 제거
            finish();
        }
    }

    class RatingListener implements RatingBar.OnRatingBarChangeListener {

        @Override
        public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
            Toast.makeText(SecondActivity.this,
                    Double.toString(v),
                    Toast.LENGTH_LONG).show();
        }
    }
}
