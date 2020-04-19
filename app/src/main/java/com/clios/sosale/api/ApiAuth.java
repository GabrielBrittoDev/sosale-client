package com.clios.sosale.api;

import com.clios.sosale.model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiAuth {

    @POST("auth/login")
    Call<User> checkLogin(
            @Field("name") String name,
            @Field("email") String email
    );

    @GET("auth/me")
    Call<User> authenticatedUser(
            @Header("Authorization") String authorization
    );

}
