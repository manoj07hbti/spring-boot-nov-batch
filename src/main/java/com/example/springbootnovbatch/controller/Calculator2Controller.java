package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator2Controller {

    @RequestMapping("/add")
    public String add() {
        int a = 5;
        int b = 12;

        int sum = a + b;

        return "Addition is.. :" + sum;

    }

    @RequestMapping("/sub")
    public String sub() {
        int a = 6;
        int b = 4;
        int sub = a-b;

        return "Subtract is : "+sub;
    }

    @RequestMapping("/multi")
    public String multi() {
        int a = 6;
        int b = 4;
        int multi = a*b;

        return "Multiply is : "+multi;
    }


    @RequestMapping("/div")
    public String div() {
        double a = 6;
        double b = 4;
        double div = a/b;

        return "Divide is : "+div;
    }

}
