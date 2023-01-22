package com.example.springbootnovbatch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="DEMO_STUDENT")
public class Student {

    @Id
    @GeneratedValue
    long id;
    String name;
    @Column(name="STD_AGE")
    int age;
    String section;

    //Default constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }


    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
