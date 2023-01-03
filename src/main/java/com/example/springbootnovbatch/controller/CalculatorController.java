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
    public String sub (){
        int a= 15, b=5;
        int sub = a-b;

        return "Subtraction of "+a+" - "+b+" = "+sub;
    }

    @RequestMapping("/multiply")
    public String multiply (){
        int a= 10, b=10;
        int multi = a*b;

        return "Multiplication of "+a+" * "+b+" = "+multi;
    }
    @RequestMapping("/divide")
    public String divide (){
        double a= 15, b=5;
        double div = a/b;

        return "Divide of "+a+" / "+b+" = "+div;
    }
}
