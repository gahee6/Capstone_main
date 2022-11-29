package com.example.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MainData> arrayList;
    private MainAdapter mainAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList = new ArrayList<>();

        mainAdapter = new MainAdapter(arrayList);
        recyclerView.setAdapter(mainAdapter);

        //임시 데이터
        arrayList.add(new MainData("#해시태그", "제목", "날짜", "닉네임"));
        arrayList.add(new MainData("#커피", "아아 사주세요", "11/1", "가희"));
        arrayList.add(new MainData("#제1실습관", "충전기 빌려주세요", "11/2", "지수"));
        arrayList.add(new MainData("#화장실", "휴지 갖다주세요", "11/3", "호준"));
        arrayList.add(new MainData("#바울관", "연필 빌려주세요", "11/4", "인찬"));
        arrayList.add(new MainData("#해시태그1", "캡스톤", "대출해주세요", "이찬"));
        arrayList.add(new MainData("#해시태그2", "제목1", "날짜1", "닉네임1"));
    }
}