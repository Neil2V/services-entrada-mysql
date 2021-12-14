package com.entradaservice.models;


import javax.persistence.*;

@Entity
public class Boleto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private User user;

    private Sala sala;

    @OneToOne
    @JoinColumn(name = "User_id", nullable = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToOne
    @JoinColumn(name = "Sala_id", nullable = false)
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
