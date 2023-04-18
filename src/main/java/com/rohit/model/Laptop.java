package com.rohit.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity

@Table(name = "jpa_laptop")
public class Laptop {
    @Id
    private int laptopId;
    private String modelNumber;
    private String brand;

    @OneToOne
    private Student student;
    // now this is @OneToOne mapping from both sides
    // now what hibernate does is, it makes foreign keys in both tables which is what we don't want
}
