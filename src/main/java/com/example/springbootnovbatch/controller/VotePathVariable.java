package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VotePathVariable {

    @RequestMapping("/vote/{age}/{city}")
    public String voting (@PathVariable int age, @PathVariable String city){
        String output;
        if(age>=18 & city.equals("kanpur")){
            output = "Person is Eligible for voting in - "+city+ " and Age is - "+age;
        }else {
            output = "Person is not Eligible for voting in - "+city+ " and Age is - "+age;
        }
        return output;
    }
}
