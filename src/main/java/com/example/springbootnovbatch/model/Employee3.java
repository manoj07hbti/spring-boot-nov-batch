package com.example.springbootnovbatch.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Employee3 {

    // Step1: @Entity
    // Step2: @Id and @GeneratedValue
    // Step3: default constructor

// Properties or data member or instance variable or field----- name ,id,age,department,salary----etc

    @Id
    @GeneratedValue
    long id;

    String name;
    int age;

    @Column(name = "Emp_Dept") // it will change the column name from employeeDepartment to Emp_Dept
    String department;

    BigDecimal salary;




    // Default Constructor

    public Employee3() {

    }

    // Parameterized Constructor  (We will make it to fill the data)


    public Employee3(long id, String name, int age, String department, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    // Getter and Setter (Getter is used to get thd data and Setter is used to set or change the data)


    public long getId() {
        return id;
    }

    public void setId(long id) {
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
