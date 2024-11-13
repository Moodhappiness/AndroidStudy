package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "epoch";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "MainActivity onCreate");

        // 获取布局中的控件
        TextView textViewTop = findViewById(R.id.textView_top);
        TextView textViewBottom = findViewById(R.id.textView_bottom);
        Button buttonHello = findViewById(R.id.button_hello);

        // 设置上方 TextView 的内容
        textViewTop.setText("这是 MainActivity 设置的内容");

        // 按钮点击事件，跳转到 SecondActivity
        buttonHello.setOnClickListener(v -> {
            Log.d(TAG, "button_hello 被点击，准备跳转到 SecondActivity");

            // 创建 Intent，并传递数据给 SecondActivity
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("extra_message", "Hello from MainActivity!");

            // 使用 Bundle 传递更多数据
            Bundle bundle = new Bundle();
            bundle.putString("name", "ep0ch");
            bundle.putInt("age", 20);
            intent.putExtras(bundle);

            // 启动 SecondActivity
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity onRestart");
    }
}
