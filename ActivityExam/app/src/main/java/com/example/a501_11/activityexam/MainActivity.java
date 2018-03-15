package com.example.a501_11.activityexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_first, btn_second, btn_third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_first = (Button)findViewById(R.id.btn_first);
        btn_second= (Button)findViewById(R.id.btn_second);
        btn_third= (Button)findViewById(R.id.btn_third);

        CallListener callListener = new CallListener();
        btn_first.setOnClickListener(callListener);
        btn_second.setOnClickListener(callListener);
        btn_third.setOnClickListener(callListener);
    }

    class CallListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_first:
                    //1. 데이터를 송신할 액티비티에서 전달할 인텐트를 만듬
                    intent = new Intent(MainActivity.this, FirstActivity.class);
                    //startActivity(intent);

                    //2. 전달할 인텐트에 데이터를 추가
                    intent.putExtra("MainToFirst", "메인에서 퍼스트로 전달하는 데이터");
                    intent.putExtra("MainToFirst_number", 10000);
                    startActivityForResult(intent,1);

                    break;

                case R.id.btn_second:
                    intent = new Intent(getApplicationContext(),
                            SecondActivity.class);

                    intent.putExtra("MainToSecondButton", "두번째.");
                    startActivityForResult(intent,1);

                    break;

                case R.id.btn_third:
                    intent = new Intent(getApplicationContext(),
                            MovieActivity.class);

                    break;
            }
            //startActivity : 실제 화면을 전환시켜줄 명령어
            startActivity(intent);
        }
    }

    //6. 인텐드에 포함된 데이터를 읽어오는 함수
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    Toast.makeText(MainActivity.this,
                            data.getStringExtra("FristToMain"),
                            Toast.LENGTH_LONG).show();
                }
        }
    }
}


