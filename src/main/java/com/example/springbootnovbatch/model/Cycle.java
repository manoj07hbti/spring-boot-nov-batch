package com.example.springbootnovbatch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "DATABASE_CYCLE_LIST")
public class Cycle {

    @Id
    @GeneratedValue
    long ID;
    String name;


    double price;
    int model;

    // NON DEFAULT CONSTRUCTOR
    public Cycle() {
    }

    public Cycle(String name, double price, int model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
