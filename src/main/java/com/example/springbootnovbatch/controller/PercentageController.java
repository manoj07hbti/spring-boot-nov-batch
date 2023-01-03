package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentageController {

    @RequestMapping("/percentage")
    public String percentage (){
        double num = 2452, per = 15;
        double result = (num*per)/100;

        return per+" Percentage of "+num+" is : "+result;
    }
}
