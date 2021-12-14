package com.entradaservice.models;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Asiento {

    @Id
    private Long id;

    private String fila;
    private String letra;

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
