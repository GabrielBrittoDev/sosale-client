package com.clios.sosale.api;

import com.clios.sosale.model.Category;
import com.clios.sosale.model.Establishment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiCategory {

    @GET("categories")
    Call<List<Category>> getCategories(@Header("Authorization") String authorization);


}
