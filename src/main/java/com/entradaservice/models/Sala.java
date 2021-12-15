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

    public int getNumerosala() {
        return numerosala;
    }

    public void setNumerosala(int numerosala) {
        this.numerosala = numerosala;
    }

    public int getNumeroasiento() {
        return numeroasiento;
    }

    public void setNumeroasiento(int numeroasiento) {
        this.numeroasiento = numeroasiento;
    }
}
