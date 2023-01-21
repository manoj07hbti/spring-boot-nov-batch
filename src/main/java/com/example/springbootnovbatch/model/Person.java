package com.example.springbootnovbatch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity (name= "Person_Table")
public class Person {


    // Step1 : @Entity
    // Step2 : @Id and @GeneratedValue----for Long id
    // Step3 : default constructor

    // Properties or data member or instance variable or fields--------name ,age,department ,salary
    @Id  // Primary key
    @GeneratedValue
    Long id;


    String name;
    int age;

    @Column(name = "Person_Dept")
    String department;
    BigDecimal salary;


    // default constructor

    public Person() {
    }


    // Parameterized Constructor


    public Person(Long id, String name, int age, String department, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    // Getter and Setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
