package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Calculatorcontroller {
    @RequestMapping("/add")
    public String add(){
        int a=5;
        int b=6;
        int sum=a+b;
        return "Addition is : "+sum;
    }
    @RequestMapping("/Sub")
    public String minus(){
        int a=8;
        int b=5;
        int minus=a-b;
        return  "Subtraction is : "+minus;
    }
    @RequestMapping("/Multiply")
    public String multiply(){
        int a=5;
        int b=6;
        int multiply=a*b;
        return "Multiply is : "+multiply;
    }
    @RequestMapping("/divide")
    public String divide(){
        int a=10;
        int b=5;
        int divide=a/b;
        return "Divide is : "+divide;
    }
}
