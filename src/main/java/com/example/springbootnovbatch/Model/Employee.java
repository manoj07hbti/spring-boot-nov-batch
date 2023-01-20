package com.example.springbootnovbatch.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Employee_Database_Table")
public class Employee {
    @Id
    @GeneratedValue
    long id;
    String name;
    @Column(name = "emp_name")
    String company;
    int salary;

// default constructor
    public Employee() {
    }

    public Employee(String name, String company, int salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
