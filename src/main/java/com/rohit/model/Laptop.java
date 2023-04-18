package com.rohit.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "jpa_laptop")
public class Laptop {
    @Id
    private int laptopId;
    private String modelNumber;
    private String brand;
}
