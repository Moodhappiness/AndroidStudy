package com.example.helloworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ContactDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);

        // 获取传递过来的联系人姓名
        String contactName = getIntent().getStringExtra("contact_name");

        // 根据联系人姓名显示不同的详细信息
        TextView nameTextView = findViewById(R.id.contact_name);
        TextView detailTextView = findViewById(R.id.contact_detail);
        nameTextView.setText(contactName);

        if ("爸爸".equals(contactName)) {
            detailTextView.setText("爸爸的详细信息...");
        } else if ("妈妈".equals(contactName)) {
            detailTextView.setText("妈妈的详细信息...");
        }

        // 设置返回按钮的点击事件
        Button backButton = findViewById(R.id.button_back);
        backButton.setOnClickListener(v -> finish());
    }
}
