package com.example.springhw.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "house_id")
    private Long id;
    private String address;

    @OneToMany(mappedBy = "house")
    private List<Owner> owners;

    @OneToMany(mappedBy = "house")
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
