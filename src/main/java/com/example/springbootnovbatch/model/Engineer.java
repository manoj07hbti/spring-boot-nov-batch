package com.example.springbootnovbatch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name= "Engineer_Table")
public class Engineer {
    @Id
    @GeneratedValue
    long engineerid;

    String name;
    int age;
    String steam;

    // default constructor

    public Engineer() {
    }
    // parameterized constructor

    public Engineer( String name, int age, String steam) {
        this.name = name;
        this.age = age;
        this.steam = steam;
    }
    //getter and setter

    public long getEngineerid() {
        return engineerid;
    }

    public void setEngineerid(long engineerid) {
        this.engineerid = engineerid;
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

    public String getSteam() {
        return steam;
    }

    public void setSteam(String steam) {
        this.steam = steam;
    }
}
