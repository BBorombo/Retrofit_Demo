package com.borombo.demo.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.borombo.demo.retrofitdemo.model.FOAASOperation;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listOperations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RecyclerView listOperations = (RecyclerView) findViewById(R.id.list_operations);
        listOperations.setLayoutManager(new LinearLayoutManager(this));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(FOAASService.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        FOAASService service = retrofit.create(FOAASService.class);

        Call<List<FOAASOperation>> operationsService = service.listOperations();

        operationsService.enqueue(new Callback<List<FOAASOperation>>() {
            @Override
            public void onResponse(Call<List<FOAASOperation>> call, Response<List<FOAASOperation>> response) {
                Log.d("Return", response.body().toString());
                listOperations.setAdapter(new MyAdapter(response.body()));


            }

            @Override
            public void onFailure(Call<List<FOAASOperation>> call, Throwable t) {

            }
        });

    }
}
