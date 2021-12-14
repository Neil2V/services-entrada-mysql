package com.entradaservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;
    private String dni;


    public User(){

    }

    public User(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
