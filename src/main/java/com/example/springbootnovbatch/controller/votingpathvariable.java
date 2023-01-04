package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class votingpathvariable {
    @RequestMapping("/vote/{age}/{city}")
    public String voting(@PathVariable int age,@PathVariable String city){
        String output;
        if(age>=18 & city.equals("tundla")){
            output ="person is applicaple for voting "+"age is "+age +"city is "+city;
        }
        else{
            output = "person not applicable for voting "+"age is"+ age +"city is "+city;

        }
        return output;
    }
}
