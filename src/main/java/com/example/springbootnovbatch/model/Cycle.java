package com.example.springbootnovbatch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "DATABASE_CYCLE_LIST")
public class Cycle {

    @Id
    @GeneratedValue
    long ID;
    String name;


    BigDecimal price;
    int model;

    public Cycle() {
    }

    // NON DEFAULT CONSTRUCTOR
    public Cycle(String name, BigDecimal price, int model) {
    }

    public Cycle(long ID, String name, BigDecimal price, int model) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.model = model;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}