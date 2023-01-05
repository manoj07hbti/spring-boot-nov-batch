package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalciRequestParam {
    //url syntax - http://localhost:8081/add_param?a=23&b=12
    @RequestMapping("/add_param")
    public String add(@RequestParam int a, @RequestParam int b){
        String output;
        int result=a+b;
        return output = "Addition of "+a+" + "+b+" = "+result;
    }
    @RequestMapping("/sub_param")
    public String sub(@RequestParam int a,@RequestParam int b){
        String output;
        int result=a-b;
        return output = "subtraction of "+a+" - "+b+" = "+result;
    }
    @RequestMapping("/multi_param")
    public String mul(@RequestParam int a,@RequestParam int b){
        String output;
        int result=a*b;
        return output = "multiplication of "+a+" * "+b+" = "+result;
    }
    @RequestMapping("/div_param")
    public String div(@RequestParam int a,@RequestParam int b){
        String output;
        double result=(double) a/b;
        return output = "division of "+a+" / "+b+" = "+result;

    }
}
