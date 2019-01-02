package com.example.markazinet.serviceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.markazinet.serviceapp.Adapter.adapter;

import java.util.ArrayList;

import butterknife.BindView;

public class JsonActivity extends AppCompatActivity {

    @BindView(R.id.recycle1)
    RecyclerView rec;
    adapter adapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("ee");
        arrayList.add("uu");
        arrayList.add("vv");
        rec.setLayoutManager(new LinearLayoutManager(this));
        rec.setAdapter(adapter1);
    }
}
