package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VotingPVController {


@RequestMapping("/voting/{city}/{age}")
    public String voting(@PathVariable String city, @PathVariable int age) {

        String output ;

        if (age >=18 & city .equals ("agra")) {

            output = "the person is eligible for vote in :\t" + city + "\tand his age is" + age;
        } else {
            output = "the person is not eligible for vote in :\t" + city + "\tand his age is" + age;
        }
        return output;


    }
}
