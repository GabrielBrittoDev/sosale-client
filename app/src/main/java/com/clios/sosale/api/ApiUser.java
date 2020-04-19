package com.clios.sosale.api;

import com.clios.sosale.model.Establishment;
import com.clios.sosale.model.User;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiUser {

    @GET("user/{id}")
    Call<List<User>> getUserById(
            @Header("Authorization") String authorization,
            @Path("id") int id);

    @GET("users")
    Call<List<User>> getUsers(@Header("Authorization") String authorization);

    @DELETE("user/{id}")
    Call<User> deleteUser(
            @Header("Authorization") String authorization,
            @Path("id") int id);

    @PUT("user/{id}")
    Call<User> updateUser(
            @Header("Authorization") String authorization,
            @Path("id") int id);

    @FormUrlEncoded
    @POST("users")
    Call<User> insertUser(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password,
            @Field("provider") boolean provider
    );

}
