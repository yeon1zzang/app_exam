package com.example.a501_11.preferenceexample;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText_content;
    Button button_save, button_load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_content = (EditText)findViewById(R.id.editText_content);
        button_load = (Button)findViewById(R.id.button_load);
        button_save = (Button)findViewById(R.id.button_save);

        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //preference 객체 생성
                SharedPreferences pref = getSharedPreferences("file_name", 0);
                SharedPreferences.Editor editor = pref.edit();

                //저장할 데이터를 준비
                editor.putString("test_string","저장하고 싶은 값");
                editor.putString("test_string2", "또 저장하는 값");
                editor.putInt("test_string3", 100);
                editor.putString("my_string", editText_content.getText().toString());
                editText_content.setText("");

                //데이터를 preference에 저장
                editor.commit();
            }
        });

        button_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //preference 객체 생성
                SharedPreferences pref = getSharedPreferences("file_name",0);

                //데이터 읽어오기
                String temp1 = pref.getString("test_string","default_string");
                String temp2 = pref.getString("test_string2","defatlt_string");
                int temp3 = pref.getInt("test_string3",-1);
                String temp4 = pref.getString("my_string","no_data");

                editText_content.setText(temp4);
            }
        });
    }
}


//1. 이름, 전화번호 edittext 값 검사하기 => getText() 활용
//2. 값이 빈칸인 경우 Toast로 메세지 출력하기
//3. 빈칸이 아닌 경우 preference에 전화번호, 이름 값 저장하기 (preference 파일 이름, key값 확인)
//4. 저장한 값을 읽어와 Toast로 출력하기

//*이름, 전화번호 edittext에 빈칸인 경우는 메세지 출력, 저장하지 X
//*빈칸이 아닌 경우 preference에 저장
