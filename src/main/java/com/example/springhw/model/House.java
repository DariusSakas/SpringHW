package com.example.springhw.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "house")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "house_id")
    private Long id;
    private String address;

    @OneToMany(mappedBy = "house", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Owner> owners;

    @OneToMany(mappedBy = "house", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Tenant> tenants;

    public House(String address) {
        this.address = address;
    }

    public House(Long id, String address, List<Owner> owners, List<Tenant> tenants) {
        this.id = id;
        this.address = address;
        this.owners = owners;
        this.tenants = tenants;
    }

    public House(String address, List<Owner> owners, List<Tenant> tenants) {
        this.address = address;
        this.owners = owners;
        this.tenants = tenants;
    }

    public House() {
    }
}
