package com.example.springbootnovbatch.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "PERSON_DATA")
public class Person {

    @Id
    @GeneratedValue
    long id;
    String name;
    int age;
    String city;
    BigDecimal salary;


    public Person() {
    }

    public Person(String name, int age, String city, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.salary = salary;
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

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
