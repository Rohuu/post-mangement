package com.rohit.model;


import jakarta.persistence.*;

@Entity
@Table(name = "jpa_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String about;

    @OneToOne
    private Laptop laptop;
}
