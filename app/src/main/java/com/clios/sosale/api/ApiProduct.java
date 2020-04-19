package com.clios.sosale.api;

import com.clios.sosale.model.Establishment;
import com.clios.sosale.model.Product;

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

public interface ApiProduct {

    @GET("product/{id}")
    Call<List<Product>> getProductsById(
            @Header("Authorization") String authorization,
            @Path("id") int id);

    @GET("products")
    Call<List<Product>> getProducts(
            @Header("Authorization") String authorization
            );

    @DELETE("product/{id}")
    Call<Product> deleteProduct(
            @Header("Authorization") String authorization,
            @Path("id") int id);

    @PUT("product/{id}")
    Call<Product> updateProduct(
            @Header("Authorization") String authorization,
            @Path("id") int id);

    @FormUrlEncoded
    @POST("products")
    Call<Product> insertProduct(
            @Header("Authorization") String authorization,
            @Field("name") String name,
            @Field("stock") boolean stock,
            @Field("price") double price,
            @Field("establishment") Establishment establishment
    );
}
