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
    // here student has a laptop but in laptop class  we have no student
    // which means by student we can access laptop but by laptop we can't access student
    // this is called unidirectional mapping
}
