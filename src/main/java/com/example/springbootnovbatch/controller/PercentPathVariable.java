package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentPathVariable {

    @RequestMapping("/percent/{score}/{total}")
    public String percent(@PathVariable double score, @PathVariable double total){

        double result=score/total*100;

        return "The percentage score is :"+result;
    }

}
