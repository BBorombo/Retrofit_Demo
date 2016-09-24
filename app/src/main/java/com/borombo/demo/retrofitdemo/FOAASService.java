package com.borombo.demo.retrofitdemo;

import com.borombo.demo.retrofitdemo.model.FOAASOperation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Erwan on 24/09/2016.
 */

interface FOAASService {

    String URL = "https://www.foaas.com/";

    @GET("/operations")
    Call<List<FOAASOperation>> listOperations();
}
