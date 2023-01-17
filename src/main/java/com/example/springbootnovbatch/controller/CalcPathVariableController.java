package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcPathVariableController {

    @RequestMapping("/Addition/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {

        int sum = a + b;
        return "Addition is : "+sum;
    }


    @RequestMapping("/Subtract/{a}/{b}")
    public String sub(@PathVariable int a, @PathVariable int b) {

        int sub = a - b;
        return "Subtract is : "+sub;
    }


    @RequestMapping("/Multiply/{a}/{b}")
    public String multi(@PathVariable int a, @PathVariable int b) {

        int multi = a * b;
        return "Multiply is : "+multi;
    }


    @RequestMapping("/Divide/{a}/{b}")
    public String div(@PathVariable double a, @PathVariable double b) {

        double div = a / b;
        return "Divide is : "+div;
    }
}
