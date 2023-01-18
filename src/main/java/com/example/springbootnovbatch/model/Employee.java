package com.example.springbootnovbatch.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name= "demo_Employee_table")
public class Employee {

    @Id
    @GeneratedValue
    long ID;
    String name;
    @Column(name="STD_age")
    int age;
    double salary;
    String dep;

    //DEFAULT CONSTRUCTOR
    public Employee() {
    }


    // parametrized constr by right click


    public Employee(String name, int age, double salary, String dep) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dep = dep;
    }

    // getter and setter


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
