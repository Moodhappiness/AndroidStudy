package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "epoch";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "SecondActivity onCreate");

        Intent intent = getIntent();
        String message = intent.getStringExtra("extra_message");
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("name");
        int age = bundle.getInt("age");

        String fullMessage = message + "\nName: " + name + "\nAge: " + age;

        TextView textView = findViewById(R.id.text_view_message);
        textView.setText(fullMessage);

        Toast.makeText(this, "Received: " + fullMessage, Toast.LENGTH_SHORT).show();

        Button backButton = findViewById(R.id.button_back);
        backButton.setOnClickListener(v -> {
            Toast.makeText(SecondActivity.this, "Returning to MainActivity", Toast.LENGTH_SHORT).show();
            finish();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "SecondActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "SecondActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "SecondActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "SecondActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "SecondActivity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "SecondActivity onRestart ");
    }
}
