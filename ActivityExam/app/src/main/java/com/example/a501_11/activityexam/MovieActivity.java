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

public class MovieActivity extends AppCompatActivity {
    VideoView videoView_third;
    Button btn_third_to_main;
    RatingBar ratingBar_third;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        //비디오뷰
        videoView_third = (VideoView)findViewById(R.id.videoView_third);
        String uriPath = "android.resource://"+getPackageName() + "/" +R.raw.movie;
        Uri uri = Uri.parse(uriPath);
        videoView_third.setVideoURI(uri);

        final MediaController mediaController = new MediaController(this);
        videoView_third.setMediaController(mediaController);

        //레이팅바
        ratingBar_third = (RatingBar)findViewById(R.id.ratingBar_third);
        MovieActivity.RatingListener ratingListener = new MovieActivity.RatingListener();
        ratingBar_third.setOnRatingBarChangeListener(ratingListener);

        //버튼
        btn_third_to_main = (Button)findViewById(R.id.btn_third_to_main);
        MovieActivity.MovieToMainListenner MovieToMainListenner = new MovieActivity.MovieToMainListenner();
        btn_third_to_main.setOnClickListener(MovieToMainListenner);

    }

    class RatingListener implements RatingBar.OnRatingBarChangeListener {

        @Override
        public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
            Toast.makeText(MovieActivity.this,
                    Double.toString(v),
                    Toast.LENGTH_LONG).show();
        }
    }


    class MovieToMainListenner implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            //현재 화면을 제거
            finish();
        }
    }
}
