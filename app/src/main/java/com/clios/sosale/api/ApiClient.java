package com.clios.sosale.api;

import lombok.Getter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit;

    private static String BASE_URL = "";

    private static String token = "";

    public static Retrofit getApiClient(){
        if (retrofit == null ){
            ApiClient.BASE_URL = BASE_URL;
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;

    }


    public static String getToken() {
        return token;
    }

    public static void setToken(String token) {
        ApiClient.token = token;
    }
}
