package com.clios.sosale.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    private int id;
    private String name;
    private boolean stock = true;
    private double price;
    private Establishment establishment;

}
