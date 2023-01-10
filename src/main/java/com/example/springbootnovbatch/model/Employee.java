package com.example.springbootnovbatch.model;


public class Employee {

    // Data member or properties or instance variables or fields of Employee----name,id,salary ---etc

   String name;
   int id;
   double salary;


     // Parameterized constructor (we will make it to fill the data)

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


     // getter and setter (it is used to get the data by getter method and set the data by setter method)


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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
