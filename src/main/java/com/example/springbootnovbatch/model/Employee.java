package com.example.springbootnovbatch.model;

public class Employee {

    String name;
    int age;
    double salary;
    String dep;

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
