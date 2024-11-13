package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ContactsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contacts, container, false);

        // 为“爸爸”图片设置点击事件，跳转到详情页面
        view.findViewById(R.id.contact_image1).setOnClickListener(v -> openContactDetail("爸爸"));

        // 为“妈妈”图片设置点击事件，跳转到详情页面
        view.findViewById(R.id.contact_image2).setOnClickListener(v -> openContactDetail("妈妈"));

        return view;
    }

    // 通用方法：打开联系人详情页面
    private void openContactDetail(String contactName) {
        Intent intent = new Intent(getActivity(), ContactDetailActivity.class);
        intent.putExtra("contact_name", contactName); // 传递联系人姓名
        startActivity(intent);
    }
}
