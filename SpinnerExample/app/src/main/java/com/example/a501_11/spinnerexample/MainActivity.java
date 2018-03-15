package com.example.a501_11.spinnerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner_fruits;
    ArrayAdapter arrayAdapter;
    boolean isInitSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. spinner 객체 만들기
        spinner_fruits = (Spinner)findViewById(R.id.spinner_fruits);

        //3. adapter 객체 만들기 (자료를 adapter에 제공)
        arrayAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.fruits,
                android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //4. spinner 객체에 adapter 객체 등록하기
        spinner_fruits.setAdapter(arrayAdapter);

        //6. 리스너 객체 만들기
        FruitsListener fruitsListener = new FruitsListener();

        //7. 리스너 객체를 spinner 객체에 등록하기
        spinner_fruits.setOnItemSelectedListener(fruitsListener);
    }

    //5. 리스너 클래스 만들기
    class FruitsListener implements Spinner.OnItemSelectedListener{

        //spinner에서 항목이 선택되었을 때
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            if(isInitSpinner){
                //상황 1. spinner가 생성될 때
                isInitSpinner = true;
            } else {
                //상황 2. spinner 생성 후에 항목이 선택되었을 때
                Toast.makeText(MainActivity.this,
                        arrayAdapter.getItem(i).toString(),
                        Toast.LENGTH_SHORT).show();
            }
        }

        //spinner에서 항목이 선택되지 않았을 때
        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }
}
