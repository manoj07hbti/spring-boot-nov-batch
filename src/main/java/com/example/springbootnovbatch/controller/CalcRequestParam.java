package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcRequestParam {

    @RequestMapping("/add_param")
    public String add(@RequestParam int a, @RequestParam int b) {

        int sum = a + b;
        return "Addition is : "+sum;
    }


    @RequestMapping("/sub_param")
    public String sub(@RequestParam int a, @RequestParam int b) {

        int sub = a - b;
        return "Subtract is : "+sub;
    }


    @RequestMapping("/multi_param")
    public String multi(@RequestParam int a, @RequestParam int b) {

        int multi = a * b;
        return "Multiply is : "+multi;
    }


    @RequestMapping("/div_param")
    public String div(@RequestParam int a, @RequestParam int b) {

        int div= a / b;
        return "Divide is : "+div;
    }

}
