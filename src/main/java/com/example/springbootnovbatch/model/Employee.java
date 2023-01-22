package com.example.springbootnovbatch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="DEMO_EMPLOYEE_TABLE")
public class Employee {

    @Id
    @GeneratedValue
    long id;

    String name;

    double Salary;

    // Default Constructor
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;

        Salary = salary;
    }


    // GETTER AND SETTER


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
