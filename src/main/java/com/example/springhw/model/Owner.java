package com.example.springhw.model;

import lombok.*;

import javax.persistence.Entity;

@Entity
public class Owner extends Resident {

    public Owner(String name, String commentSubject, String commentText, Integer flatNumber, House house) {
        super(name, commentSubject, commentText, flatNumber, house);
    }

    public Owner() {
        super();
    }

    public Owner(String name, String commentSubject, String commentText, Integer flatNumber) {
        super(name, commentSubject, commentText, flatNumber);
    }
}
