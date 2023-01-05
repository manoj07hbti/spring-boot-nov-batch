package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Voting_param {
    @RequestMapping("/voting_param")
    public String voting(@RequestParam int age,@RequestParam String city){

        if(age>=18 & city.equals("Tundla") ){
            return "the person is have right to vote because he belong to "+city+" and age "+age;
        }
        else {
            return  "not have right to vote because not belong to city or not age";
        }


    }
}
