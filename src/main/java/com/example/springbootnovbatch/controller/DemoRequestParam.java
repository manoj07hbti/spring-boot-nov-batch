package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRequestParam {

@RequestMapping("/voting-path")
    public String voting(@RequestParam String city,@RequestParam int age) {

       // String output ;

        if (age >=18 & city .equals ("agra")) {

            return  "the person is eligible for vote in ";          // with using return t
        }

        else {
            return   "the person is not eligible for vote in :\t" + city + "\tand his age is" + age;
        }


    }
}


//  http://localhost:8081/voting-path?city=agra&age=17
