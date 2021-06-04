package com.example.springhw.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "tenant")
public class Tenant extends Resident{

    public Tenant(String name, String commentSubject, String commentText, Integer flatNumber, House house) {
        super(name, commentSubject, commentText, flatNumber, house);
    }

    public Tenant() {
        super();
    }

    public Tenant(String name, String commentSubject, String commentText, Integer flatNumber) {
        super(name, commentSubject, commentText, flatNumber);
    }
}
