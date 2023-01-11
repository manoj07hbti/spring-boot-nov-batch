package com.example.springbootnovbatch.model;

public class Doctor {

    // Properties or data members of Doctor-----name,id ,department ,salary
    String name;
    int id;
    String department;
    double salary;


   // Parameterized constructor( to fill the data)


    public Doctor(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }


   // Getter and Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
