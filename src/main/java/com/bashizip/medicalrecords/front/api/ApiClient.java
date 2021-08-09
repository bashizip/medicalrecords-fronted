/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bashizip.medicalrecords.front.api;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 *
 * @author Patrick
 */
public class ApiClient {

    public static final String BASE_URL = "http://localhost:8484/api/1.0/emr/";
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public interface Api {
        // Request method and URL specified in the annotation

        @GET("/medicalrecords")
        Call<MedicalRecord> getAll();

        @POST("/medicalrecords")
        Call<MedicalRecord> createUser(@Body MedicalRecord user);
    }

}
