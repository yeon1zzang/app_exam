package com.example.a501_11.intentexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. 버튼 객체 만들기
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);

        //4. 리스너의 객체 만들기
        IntentBtnListener intentBtnListener = new IntentBtnListener();

        //5. 컴포넌트에 리스너 객체 등록하기
        btn_1.setOnClickListener(intentBtnListener);
        btn_2.setOnClickListener(intentBtnListener);
        btn_3.setOnClickListener(intentBtnListener);
        btn_4.setOnClickListener(intentBtnListener);
    }

    //3. 리스너의 클래스 만들기
    class IntentBtnListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_1: //Web
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.naver.com"));
                    startActivity(intent1);
                    break;
                case R.id.btn_2: //Map
                    Intent intent2 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("geo:36.6328790,127.5057380"));
                    startActivity(intent2);
                    break;
                case R.id.btn_3: //Phone
                    Intent intent3 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:01012345678"));
                    startActivity(intent3);
                    break;
                case R.id.btn_4: //Contacts
                    Intent intent4 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("content://contacts/people/"));
                    startActivity(intent4);
                    break;
            }
        }
    }
}
