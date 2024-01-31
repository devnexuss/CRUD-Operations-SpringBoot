package com.example.Assignment1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// Lombok annotations to automatically generate getters, setters, constructors
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;             // Unique identifier for the student
    private String name;        // Name of the student
    private String gender;      // Gender of the student
    private int age;            // Age of the student
    private String course;      // Course of the student
}
