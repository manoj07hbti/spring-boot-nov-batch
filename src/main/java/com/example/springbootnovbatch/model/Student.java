package com.example.springbootnovbatch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue

    long id;
    String name;
    int age ;
    String section;


    // Default Constructor


    public Student() {
    }

    // PArameterized Constructor

    public Student(long id, String name, int age, String section) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.section = section;
    }

    // Getter and setter


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
