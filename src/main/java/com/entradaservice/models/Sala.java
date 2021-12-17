package com.entradaservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private int numerosala;

    @OneToMany(mappedBy = "sala",fetch = FetchType.LAZY)
    @JsonIgnoreProperties("sala")
    private Set<Asiento> asientos = new HashSet<>();

    public Sala() {
    }

    public Sala(int numerosala) {

        this.numerosala = numerosala;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumerosala() {
        return numerosala;
    }

    public void setNumerosala(int numerosala) {
        this.numerosala = numerosala;
    }

    public Set<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(Set<Asiento> asientos) {
        this.asientos = asientos;
    }

}
