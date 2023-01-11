package com.example.springbootnovbatch.model;

public class Vehicle {

    String name;
    int model;
    double price;
    String brand;


    // parametrized constructor


    public Vehicle(String name, int model, double price, String brand) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.brand = brand;
    }


    // Getter And Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
