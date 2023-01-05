package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calc_request_param {
    @RequestMapping("/adding")
    public String add(@RequestParam int a,@RequestParam int b){
        int sum = a+b ;
        return "sum of "+ a + "& " + b +"is " +sum ;
    }
    @RequestMapping("/subtract_param")
    public String sub(@RequestParam int a,@RequestParam int b){
        int sub = a-b;
        return "subtract of "+ a +" &"+ b+" is "+ sub;
    }
    @RequestMapping("/multiply_param")
    public String multi(@RequestParam int a,@RequestParam int b){
        int multiply = a*b;
        return "multiply of "+ a + " & " + b + " is" + multiply;
    }
    @RequestMapping("/divide_param")
    public String divide(@RequestParam int a,@RequestParam int b){
        double divide =(double)a/b;
        return "division of "+ a +" & "+ b+" is "+divide;
    }
    @RequestMapping("/percent_param")
    public String percentage(@RequestParam int num ,@RequestParam int percent ){
        double percentage=(double) (num*percent)/100;
        return "percentage of "+ num +" is "+percentage;
    }
}
