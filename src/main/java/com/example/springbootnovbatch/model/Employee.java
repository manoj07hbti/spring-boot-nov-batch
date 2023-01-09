package com.example.springbootnovbatch.model;

public class Employee {

    String name;
    int ID;
    double Salary;

    // Parameterized Constructor
    public Employee(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        Salary = salary;
    }


    // GETTER AND SETTER


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
