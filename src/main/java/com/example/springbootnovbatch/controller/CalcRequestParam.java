package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcRequestParam {

    @RequestMapping("/add_param")
    public String add(@RequestParam int a, @RequestParam int b){

        int sum=a+b;

        return "Addition is "+sum;
    }
}
