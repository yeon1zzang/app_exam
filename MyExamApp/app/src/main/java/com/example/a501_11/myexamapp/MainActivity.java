package com.example.a501_11.myexamapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edittext_num1;
    EditText edittext_num2;
    TextView textview_result;
    Button button_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1.레이아웃의 컴포넌트 ID확인(디자인탭)
        //2.컴포넌트의 객체 생성
        Button btn_test = (Button)findViewById(R.id.btn_test);
        Button btn_test2 = (Button)findViewById(R.id.btn_test2);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        edittext_num1 = (EditText)findViewById(R.id.edittext_num1);
        edittext_num1 = (EditText)findViewById(R.id.edittext_num2);
        textview_result = (TextView) findViewById(R.id.textview_result);
        button_add = (Button)findViewById(R.id.button_add);
        //4.리스너의 객체를 만듬
        MyListener myListener = new MyListener();
        MyListener2 myListener2 = new MyListener2();
        MyListener3 myListener3 = new MyListener3();
        MyListener4 myListener4 = new MyListener4();

        //5.컴포넌트 객체의 리스너를 등록
        btn_test.setOnClickListener(myListener);
        btn_test2.setOnClickListener(myListener2);
        imageView.setOnClickListener(myListener3);
        button_add.setOnClickListener(myListener4);

    }
    //3-1.버튼 리스너를 만듬
    class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,
                    "버튼을 클릭하였습니다.",Toast.LENGTH_SHORT).show();
        }
    }

    class MyListener2 implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,
                    "버튼2을 클릭하였습니다.",Toast.LENGTH_SHORT).show();
        }
    }

    //3-2.이미지뷰 리스너 만들기
    class MyListener3 implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,
                    "이미지뷰를 클릭하였습니다.",Toast.LENGTH_SHORT).show();
        }
    }

    //3-3.리스너 만들기
    class MyListener4 implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            String input_num1 = edittext_num1.getText().toString();
            String input_num2 = edittext_num2.getText().toString();

            int result = Integer.parseInt(input_num1) + Integer.parseInt(input_num2);
            textview_result.setText("결과 : " + result);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
