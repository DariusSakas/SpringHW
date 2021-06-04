package com.example.springhw.model;


import javax.persistence.*;

@Entity
@Table(name = "tenant")
public class Tenant extends Resident{
    /**
     * Kodel iskelus House house per end point'a grazina house, bet kitu parametru is super() ne?
     * 1. Konstruktorius super nebuvo all args?
     * 2. REIKALINGI GETTERiai ir SETTERiai <<<<<< per juos gaudomi duomenys
     * */

    public Tenant(String name, String commentSubject, String commentText, Integer flatNumber, House house) {
        super(name, commentSubject, commentText, flatNumber, house);
    }

    public Tenant() {
    }

    public Tenant(Long id, String name, String commentSubject, String commentText, Integer flatNumber, House house) {
        super(id, name, commentSubject, commentText, flatNumber, house);
    }
}

