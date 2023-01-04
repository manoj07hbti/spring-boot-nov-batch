package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/add")
    public String add(){
        int a=5;
        int b=12;

        int sum=a+b;

        return "Addition is :"+sum;

    }

    @RequestMapping("/even")
    public String even(){
        String output="";
        for (int i=1; i<=100; i++){

            if(i%2==0) {


                output+=i;// output= output + i
                output+=", ";
            }
        }

        return output;
    }
}
