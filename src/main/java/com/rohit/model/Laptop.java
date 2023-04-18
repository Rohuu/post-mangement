package com.rohit.model;


import jakarta.persistence.*;

@Entity

@Table(name = "jpa_laptop")
public class Laptop {
    @Id
    private int laptopId;
    private String modelNumber;
    private String brand;

    @OneToOne
    // this student(foreign key) is a join column for laptop table which can be renamed too
    @JoinColumn(name = "student_id")
    private Student student;
    // now this is @OneToOne mapping from both sides
    // now what hibernate does is, it makes foreign keys in both tables which is what we don't want
}
