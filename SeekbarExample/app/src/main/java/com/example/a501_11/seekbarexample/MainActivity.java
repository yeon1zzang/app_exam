package com.example.a501_11.seekbarexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SeekBar seekbar_red, seekbar_green, seekbar_blue;
    Button btn_red, btn_green, btn_blue;
    TextView show;
    int red = 0;
    int blue = 0;
    int green = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. 컴포넌트의 객체 만들기
        seekbar_red = (SeekBar)findViewById(R.id.seekbar_red);
        seekbar_green = (SeekBar)findViewById(R.id.seekbar_green);
        seekbar_blue = (SeekBar)findViewById(R.id.seekbar_blue);

        btn_red = (Button)findViewById(R.id.btn_red);
        btn_green = (Button)findViewById(R.id.btn_green);
        btn_blue = (Button)findViewById(R.id.btn_blue);

        show = (TextView)findViewById(R.id.textview_show);

        //4. 리스너의 객체 만들기
        SeekbarListener seekbarListener = new SeekbarListener();
        ButtonListener buttonListener = new ButtonListener();

        //5. 컴포넌트(Seekbar)의 객체에 리스너 객체를 등록하기
        seekbar_red.setOnSeekBarChangeListener(seekbarListener);
        seekbar_green.setOnSeekBarChangeListener(seekbarListener);
        seekbar_blue.setOnSeekBarChangeListener(seekbarListener);
        btn_red.setOnClickListener(buttonListener);
        btn_green.setOnClickListener(buttonListener);
        btn_blue.setOnClickListener(buttonListener);
    }

    //3. 리스너의 클래스 만들기
    class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_red:
                    seekbar_red.setProgress(255);
                    seekbar_green.setProgress(0);
                    seekbar_blue.setProgress(0);
                    break;
                case R.id.btn_green:
                    seekbar_red.setProgress(0);
                    seekbar_green.setProgress(255);
                    seekbar_blue.setProgress(0);
                    break;
                case R.id.btn_blue:
                    seekbar_red.setProgress(0);
                    seekbar_green.setProgress(0);
                    seekbar_blue.setProgress(255);
                    break;
            }
        }
    }

    class SeekbarListener implements SeekBar.OnSeekBarChangeListener{

        //Seekbar를 움직일 때 호출
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            //show.setText("현재 값 : "+i);
            switch (seekBar.getId()){
                case R.id.seekbar_red:
                    red=i;
                    break;
                case R.id.seekbar_blue:
                    blue=i;
                    break;
                case R.id.seekbar_green:
                    green=i;
                    break;
            }
            show.setBackgroundColor(Color.rgb(red,green,blue));
        }

        //Seekbar를 터치할 때 호출
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            //Toast.makeText(MainActivity.this,
            //     "start",Toast.LENGTH_SHORT).show();

        }

        //Seekbar에서 손을 뗄 때 호출
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            //Toast.makeText(MainActivity.this,
            //     "stop",Toast.LENGTH_SHORT).show();
            //show.setBackgroundColor(Color.rgb(red,green,blue));
        }
    }
}
