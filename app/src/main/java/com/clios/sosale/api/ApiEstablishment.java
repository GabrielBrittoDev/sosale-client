package com.clios.sosale.api;

import com.clios.sosale.model.Category;
import com.clios.sosale.model.Establishment;
import com.clios.sosale.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiEstablishment {

    @GET("establishment/{id}")
    Call<Establishment> getEstablishmentsById(
            @Header("Authorization") String authorization,
            @Path("id") int id);

    @GET("establishments")
    Call<List<Establishment>> getEstablishments( @Header("Authorization") String authorization);

    @DELETE("establishment/{id}")
    Call<Establishment> deleteEstablishment(
            @Header("Authorization") String authorization,
            @Path("id") int id);

    @PUT("establishment/{id}")
    Call<Establishment> updateEstablishment(
            @Header("Authorization") String authorization,
            @Path("id") int id);

    @FormUrlEncoded
    @POST("establishments")
    Call<Establishment> insertEstablishment(
            @Header("Authorization") String authorization,
            @Field("name") String name,
            @Field("cnpj") String cnpj,
            @Field("address") String address,
            @Field("phone") String phone,
            @Field("category")Category category,
            @Field("user")User user
            );


}
