package com.example.springbootnovbatch.model;

public class Doctor {
    String name;
    int age;
    String deprt;
    double salary;

    // Parameterized Constructor

    public Doctor(String name, int age, String deprt, double salary) {
        this.name = name;
        this.age = age;
        this.deprt = deprt;
        this.salary = salary;
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

    public String getDeprt() {
        return deprt;
    }

    public void setDeprt(String deprt) {
        this.deprt = deprt;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
