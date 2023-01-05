package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class vote_paramController {

    @RequestMapping("/vote")
    public String voting(@RequestParam int age, @RequestParam String city) {

        String output = "";
        if (age >= 18 & city.equals("Delhi")) {

            output = "Rahul is eligible his age is  " + age + " And  his city  is  " + city;
        } else {

            output = " Rahul is not  eligible  his age is  " + age + " And  his city  is " + city;
        }

        return output;   //  http://localhost:8085/vote?age=22&city=Delhi

    }
}