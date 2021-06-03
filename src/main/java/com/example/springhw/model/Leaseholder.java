package com.example.springhw.model;

import lombok.*;

import javax.persistence.Entity;

@Entity
public class Leaseholder extends Resident{

    public Leaseholder(String name, String commentSubject, String commentText, Integer flatNumber, House house) {
        super(name, commentSubject, commentText, flatNumber, house);
    }

    public Leaseholder() {
        super();
    }

    public Leaseholder(String name, String commentSubject, String commentText, Integer flatNumber) {
        super(name, commentSubject, commentText, flatNumber);
    }
}
