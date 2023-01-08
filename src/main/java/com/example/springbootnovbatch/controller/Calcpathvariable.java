package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calcpathvariable {
    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){
        int sum=a+b;
        return "addition is "+sum;
    }
    @RequestMapping("/sub/{a}/{b}")
    public String sub(@PathVariable int a,@PathVariable int b){
        int sub=a-b;
        return "sub is "+sub;
    }
    @RequestMapping("/multiply/{a}/{b}")
    public String multiply(@PathVariable int a,@PathVariable int b){
        int sum=a*b;
        return "multipl is "+sum;
    }
    @RequestMapping("/divide/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b){
        int sum=a/b;
        return "divide is "+sum;
    }



}
