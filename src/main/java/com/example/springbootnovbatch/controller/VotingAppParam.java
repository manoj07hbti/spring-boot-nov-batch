package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VotingAppParam {

    @RequestMapping("/Voting_Param")
    public String VotingApp(@RequestParam int age, @RequestParam String city) {

        String output;

        if(age>18 & city.equals("Agra")) {
            output = "Person is eligible for voting : Your age is "+age+" and your city is "+city;
        }
        else{
            output = "Person is not eligible for voting : your age is "+age+" and your city is "+city;
        }

        return output;
    }

}
