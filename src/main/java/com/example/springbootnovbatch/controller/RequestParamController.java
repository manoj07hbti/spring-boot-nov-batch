package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {


    @RequestMapping("/voting")
    public String vote(@RequestParam String city , @RequestParam int age){


        if(city.equals("AGRA") & age>=18){
        return  "Eligible for voting in AGRA..." ;
        }
        else {
        return "NOT Eligible for voting ";
        }

    }

    @RequestMapping("/square")
    public String makeSquare(@RequestParam int number){

        int square=number*number;

        return "Square of given number "+number+ " is : "+square;
    }
}
