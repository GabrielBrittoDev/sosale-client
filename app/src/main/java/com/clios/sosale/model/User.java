package com.clios.sosale.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private boolean provider = false;


}
