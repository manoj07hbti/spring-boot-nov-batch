package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentageController {
    @RequestMapping("/percentage")
    public String percentage(){
        double number= 325;
        double total=500;

        double percent=number/total*100;
        return "the percentage of the following student is"+percent;
    }
}


