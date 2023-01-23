package com.example.springbootnovbatch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Postman {

    @Id
    @GeneratedValue

    long id;
    String name;
    int age;
    String postoffice;
    @Column(name = "salary", precision = 10, scale = 2)
    public BigDecimal salary;

    // default Constructor

    public Postman() {
    }

    // Parameterized Constructor


    public Postman(long id, String name, int age, String postoffice, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.postoffice = postoffice;
        this.salary = salary;
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

    public String getPostoffice() {
        return postoffice;
    }

    public void setPostoffice(String postoffice) {
        this.postoffice = postoffice;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
