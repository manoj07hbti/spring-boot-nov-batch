package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoteRequestParam {
    @RequestMapping("/vote")
    public String voting (@RequestParam int age, @RequestParam String city){
        String output;
        if(age>=18 & city.equals("kanpur")){
            output = "Person is Eligible for voting in - "+city+ " and Age is - "+age;
        }else {
            output = "Person is not Eligible for voting in - "+city+ " and Age is - "+age;
        }
        return output;
    }
}
