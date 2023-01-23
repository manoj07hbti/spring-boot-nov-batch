package com.example.springbootnovbatch.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity  //  @Entity (name = " Employee4_Table") It will change the table name from Employee4 to Employee4_Table
public class Employee4 {

    // Step1: @Entity
    // Step2: @Id and @GeneratedValue
    // Step3: default constructor


    // Properties or data member or instance variable or field-------id, name ,age,city,department,salary----etc

    @Id // it is primary key
    @GeneratedValue
    long id;

    String name;
    int age;
    String city;

    @Column(name = "Emp_Dept") // It will change the column name from department to Emp_Dept
    String department;
    BigDecimal salary;



    // Default Constructor
    public Employee4() {

    }


    // Parameterized Constructor (it is used to fill the data)

    public Employee4(long id, String name, int age, String city, String department, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.department = department;
        this.salary = salary;
    }


    // Getter and Setter (Getter is used to get the data and Setter is used to set or change the data)


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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
