package com.example.springbootnovbatch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "DATABASE_DOCTOR_TABLE")
public class Doctor {

    @Id
    @GeneratedValue
    long ID;

    String name;
    int age;
    double salary;
    String dep;


    public Doctor() {
    }

    public Doctor(String name, int age, double salary, String dep) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dep = dep;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
}
