package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class calculatorpathvariable {
    @RequestMapping("/sum/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){

        int sum =a+b;
        return "addition is "+sum;
    }
    @RequestMapping("/sub/{a}/{b}")
    public String subtract(@PathVariable int a,@PathVariable int b){
        int sub= a-b;
        return  "subtraction is "+sub;
    }
    @RequestMapping("/division/{a}/{b}")
    public String divide(@PathVariable int a,@PathVariable int b){
        double divide =(double) (a/b);
        return"division is "+divide;
    }
    @RequestMapping("/multy/{a}/{b}")
    public String multi(@PathVariable int a,@PathVariable int b){
        int multiply = a*b;
        return "multiply is "+multiply;
    }
    @RequestMapping("/percent/{num}/{percent}")
    public String percent(@PathVariable int num,@PathVariable int percent){
        double percentage =(double)(num*percent)/100;
        return "percentage is "+percentage;
    }


}
