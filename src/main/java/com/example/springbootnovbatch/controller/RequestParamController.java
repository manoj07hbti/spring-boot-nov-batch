package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @RequestMapping("/voting")
    public String vote(@RequestParam String city , @RequestParam int age) {

        String result = "";
        if (city.equals("Agra") & age >= 18) {
            result = "Eligible for voting...";
        } else {
            result = "not eligible for voting...";
        }
        return result;
    }


    @RequestMapping("/square")
    public String makeSquare(@RequestParam int number) {
        int square = number*number;
        return "Square of " +number+" is : "+square;
    }

}
