package com.entradaservice.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class Asiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int numeroasiento;

    private boolean ocupado;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sala_id")
    @JsonIgnoreProperties("asientos")
    private Sala sala;


    public Asiento(){

    }

    public Asiento(int numeroasiento,boolean ocupado) {
        this.numeroasiento = numeroasiento;
        this.ocupado = ocupado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroasiento() {
        return numeroasiento;
    }

    public void setNumeroasiento(int numeroasiento) {
        this.numeroasiento = numeroasiento;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
