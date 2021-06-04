package com.example.springhw.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "owner")
public class Owner extends Resident{

    public Owner(String name, String commentSubject, String commentText, Integer flatNumber, House house) {
        super(name, commentSubject, commentText, flatNumber, house);
    }

    public Owner() {
    }

    public Owner(Long id, String name, String commentSubject, String commentText, Integer flatNumber, House house) {
        super(id, name, commentSubject, commentText, flatNumber, house);
    }
}
