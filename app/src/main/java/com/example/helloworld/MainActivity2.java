package com.example.helloworld;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // 加载默认的聊天Fragment
        loadFragment(new ChatFragment());

        // 设置按钮点击事件
        findViewById(R.id.button_chat).setOnClickListener(v -> loadFragment(new ChatFragment()));
        findViewById(R.id.button_contacts).setOnClickListener(v -> loadFragment(new ContactsFragment()));
        findViewById(R.id.button_discovery).setOnClickListener(v -> loadFragment(new DiscoveryFragment()));
        findViewById(R.id.button_my).setOnClickListener(v -> loadFragment(new MyFragment()));
    }


    // 加载Fragment的方法
    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment); // 替换Fragment容器中的内容
        transaction.addToBackStack(null); // 将当前Fragment添加到返回栈，以便用户可以返回
        transaction.commit(); // 提交事务
    }
}
