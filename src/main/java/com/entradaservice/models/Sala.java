package com.entradaservice.models;

import javax.persistence.*;

@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private int numerosala;

    @Column(unique = true)
    private int numeroasiento;

    public Sala() {
    }

    public Sala(int numerosala, int numeroasiento) {
        this.numerosala = numerosala;
        this.numeroasiento = numeroasiento;
    }

    public int getNumeroSala() {
        return numerosala;
    }

    public void setNumeroSala(int numerosala) {
        this.numerosala = numerosala;
    }

    public int getNumeroAsiento() {
        return numeroasiento;
    }

    public void setNumeroAsiento(int numeroasiento) {
        this.numeroasiento = numeroasiento;
    }
}
