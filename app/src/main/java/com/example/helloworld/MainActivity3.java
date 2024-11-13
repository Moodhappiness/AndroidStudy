//package com.example.helloworld;
//
//import android.os.Bundle;
//import android.content.Context;
//import android.view.View; // 添加此行
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class MainActivity3 extends AppCompatActivity {
//
//    private RecyclerView recyclerView;
//    private List<Map<String, Object>> list1;
//    private Context context;
//    private adapter2 adapter2;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main3);
//
//        context = this;
//
//        recyclerView = findViewById(R.id.RecyclerView2);
//
//        recyclerView.setVisibility(View.VISIBLE); // 设置 RecyclerView 为可见
//
//        // 初始化数据
//        String[] phonename = {"A", "B", "C"};
//        String[] price = {"1000", "2000", "3000"};
//        String[] config = {"ssss", "qqqqq", "rrrrr"};
//
//        list1 = new ArrayList<>();
//        for (int i = 0; i < phonename.length; i++) {
//            Map<String, Object> map = new HashMap<>();
//            map.put("name", phonename[i]);
//            map.put("price", price[i]);
//            map.put("config", config[i]);
//            list1.add(map);
//        }
//
//        adapter2 = new adapter2(context, list1);
//        recyclerView.setAdapter(adapter2);
//
//        LinearLayoutManager manager = new LinearLayoutManager(context);
//        manager.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(manager);
//
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//    }
//}
