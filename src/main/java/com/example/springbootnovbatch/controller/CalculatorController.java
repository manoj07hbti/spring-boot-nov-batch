package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/add")
    public String add(){
        int a=5;
        int b=12;

        int sum=a+b;

        return "Addition is :"+sum;
    }

    @RequestMapping("/sub")
    public String sub(){
        int a=5;
        int b=12;

        int sub=a-b;

        return "Subtract is :"+sub;
    }


    @RequestMapping("/multi")
    public String multi(){
        int a=5;
        int b=12;

        int multi=a*b;

        return "Multiply is :"+multi;
    }


    @RequestMapping("/div")
    public String div(){
        double a=5;
        double b=12;

        double div=a/b;

        return "Divide is :"+div;
    }
}
