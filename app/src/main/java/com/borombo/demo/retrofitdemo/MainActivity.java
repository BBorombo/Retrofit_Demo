package com.borombo.demo.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView listOperations = (RecyclerView) findViewById(R.id.list_operations);
        listOperations.setLayoutManager(new LinearLayoutManager(this));
        listOperations.setAdapter(new MyAdapter());
    }
}
