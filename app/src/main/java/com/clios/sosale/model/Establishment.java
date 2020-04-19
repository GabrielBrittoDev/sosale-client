package com.clios.sosale.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Establishment {

    private int id;
    private String name;
    private String cnpj;
    private String address;
    private String phone;
    private User user;

}
