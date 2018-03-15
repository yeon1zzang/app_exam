package com.example.a501_11.listview;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.GregorianCalendar;

/**
 * Created by 501-11 on 2018-03-05.
 */

public class BookActivity extends AppCompatActivity {

    Button btn_time, btn_date;
    int year,month,day,hour,min;
    DatePickerListener datePickerListener;
    TimePickerListener timePickerListener;
    TextView textview_book_date, textview_book_time;
    //Seekbar 추가 컴포넌트 변수
    TextView textview_seats;
    SeekBar seekbar_seats;
    Button btn_seats;


    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        //현재 시간과 날짜를 얻음
        GregorianCalendar cal = new GregorianCalendar();
        year = cal.get(cal.YEAR);
        month = cal.get(cal.MONTH);
        day = cal.get(cal.DAY_OF_MONTH);
        hour = cal.get(cal.HOUR);
        min = cal.get(cal.MINUTE);

        //2. 컴포넌트(버튼)의 객체 만들기
        btn_time = (Button)findViewById(R.id.btn_time);
        btn_date = (Button)findViewById(R.id.btn_date);
        textview_book_date = (TextView)findViewById(R.id.textview_book_date);
        textview_book_time = (TextView)findViewById(R.id.textview_book_time);

        textview_seats = (TextView)findViewById(R.id.textview_seats);
        seekbar_seats = (SeekBar)findViewById(R.id.seekbar_seats);
        btn_seats = (Button)findViewById(R.id.btn_seats);

        //4. 리스너 객체 만들기
        BtnListener btnListener = new BtnListener();
        timePickerListener = new TimePickerListener();
        datePickerListener = new DatePickerListener();
        SeekBarListener seekBarListener = new SeekBarListener();
        SeekBtnListener seekBtnListener = new SeekBtnListener();

        //5. 리스너 객체를 컴포넌트에 등록하기
        btn_date.setOnClickListener(btnListener);
        btn_time.setOnClickListener(btnListener);
        seekbar_seats.setOnSeekBarChangeListener(seekBarListener);
        btn_seats.setOnClickListener(seekBtnListener);
    }

    //3. 리스너 클래스 만들기
    class SeekBarListener implements SeekBar.OnSeekBarChangeListener {

        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            textview_seats.setText("현재 좌석 : "+ (i+1) +"석");
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    class SeekBtnListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            seekbar_seats.setProgress(0);
        }
    }

    /* 버튼 리스너 먼저 생성 후에 그 안에 Timepicker, Datepicker 클래스를
     사용해야하기 때문에 아래 리스너 클래스 생성 */

    //Timepickerdialog true : 24시표기, false : 12시표기

    class BtnListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_date :
                    //6. 리스너 객체를 활용하여 다이얼로그 호출
                    new DatePickerDialog(BookActivity.this, datePickerListener,
                            2018,3,6).show();
                    break;

                case R.id.btn_time:
                    new TimePickerDialog(BookActivity.this, timePickerListener,
                            11,43,false).show();
                    break;
            }
        }
    }
    //DatePicker 리스너 클래스 생성
    class DatePickerListener implements DatePickerDialog.OnDateSetListener{

        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            textview_book_date.setText("예매날짜 : "+i+"년 "+(i1+1)+"월 "+i2+"일 ");
        }
    }

    //TimePicker 리스너 클래스 생성
    class TimePickerListener implements TimePickerDialog.OnTimeSetListener{

        @Override
        public void onTimeSet(TimePicker timePicker, int i, int i1) {
            textview_book_time.setText("예매시간 : "+i+"시 "+i1+"분 ");
        }
    }
}
