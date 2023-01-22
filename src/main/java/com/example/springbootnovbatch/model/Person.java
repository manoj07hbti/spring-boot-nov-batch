package com.example.springbootnovbatch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue
    long personid;
    String name;
    int age;
    String city;

    // default constructor

    public Person() {
    }

    // parameterized constructor

    public Person( String name, int age, String city) {

        this.name = name;
        this.age = age;
        this.city = city;
    }
    // Getter and Setter

    public long getPersonid() {
        return personid;
    }

    public void setPersonid(long personid) {
        this.personid = personid;
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
}
