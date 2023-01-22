package com.example.springbootnovbatch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="DEMO_ENGINEER")
public class Engineer {

    @Id
    @GeneratedValue
    long id;
    String name;
    int age;
    double salary;
    String department;

    // DEFAULT CONSTRUCTOR
    public Engineer() {
    }

    // PARAMETERIZED CONSTRUCTOR

    public Engineer(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    // GETTER AND SETTER

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
