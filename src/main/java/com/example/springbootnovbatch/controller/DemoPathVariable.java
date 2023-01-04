package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoPathVariable {


    @RequestMapping("/eligibility/{age}/{city}")
    public String voting(@PathVariable int age, @PathVariable String city){

        String output="";
        if(age>=18 & city.equals("agra") ){

            output = "Person is eligible " + age + " And city :" + city;
        }
        else {

            output="Person is not  eligible  "+ age +" And city :"+city;
        }

        return output;
    }
}
