package com.example.springhw.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String commentSubject;
    private String commentText;
    private Integer flatNumber;
    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house;

    public Owner(String name, String commentSubject, String commentText, Integer flatNumber) {
        this.name = name;
        this.commentSubject = commentSubject;
        this.commentText = commentText;
        this.flatNumber = flatNumber;
    }

    public Owner(String name, String commentSubject, String commentText, Integer flatNumber, House house) {
        this.name = name;
        this.commentSubject = commentSubject;
        this.commentText = commentText;
        this.flatNumber = flatNumber;
        this.house = house;
    }
}
