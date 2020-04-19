package com.clios.sosale.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("stock")
    @Expose
    private boolean stock = true;

    @SerializedName("price")
    @Expose
    private double price;

    @SerializedName("establishment")
    @Expose
    private Establishment establishment;

}
