package com.example.springbootnovbatch.model;

public class CompanyM {

    String name;
    int estd;
    double turnover;

    public CompanyM(String name, int estd, double turnover) {
        this.name = name;
        this.estd = estd;
        this.turnover = turnover;
    }


// GETTER AND SETTER----



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstd() {
        return estd;
    }

    public void setEstd(int estd) {
        this.estd = estd;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }
}
