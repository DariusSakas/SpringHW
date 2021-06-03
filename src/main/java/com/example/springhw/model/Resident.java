package com.example.springhw.model;

import lombok.*;

import javax.persistence.*;

@MappedSuperclass
public abstract class Resident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String commentSubject;
    private String commentText;
    private Integer flatNumber;
    @ManyToOne
    private House house;

    public Resident(String name, String commentSubject, String commentText, Integer flatNumber, House house) {
        this.name = name;
        this.commentSubject = commentSubject;
        this.commentText = commentText;
        this.flatNumber = flatNumber;
        this.house = house;
    }

    public Resident() {
    }

    public Resident(String name, String commentSubject, String commentText, Integer flatNumber) {
        this.name = name;
        this.commentSubject = commentSubject;
        this.commentText = commentText;
        this.flatNumber = flatNumber;
    }
}
