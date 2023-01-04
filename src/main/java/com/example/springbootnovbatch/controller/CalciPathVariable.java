package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalciPathVariable {

    @RequestMapping("/Addition/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {

        int sum = a + b;
        return "add of the number is:" + sum;

    }

    @RequestMapping("/Subtraction/{a}/{b}")
    public String sub(@PathVariable int a, @PathVariable int b) {

        int sum = a - b;
        return "sub of the number is:" + sum;


    }

    @RequestMapping("/Multiplication/{a}/{b}")
    public String multi(@PathVariable double a, @PathVariable double b) {

        double sum = a * b;
        return "multiply of the number is:" + sum;

    }

    @RequestMapping("/division/{a}/{b}")
    public String add(@PathVariable double a, @PathVariable double b) {

        double sum = a + b;
        return "divide of the number is:" + sum;


    }
}
