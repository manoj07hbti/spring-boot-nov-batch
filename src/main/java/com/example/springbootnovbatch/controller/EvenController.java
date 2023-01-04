package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenController {


    @RequestMapping("/even")
    public String even() {

        String output = "";

        for (int i=1; i<= 100;i++) {

            if (i % 2 == 0) {


                output += i;  // concatinate output=output+1
                output += " ,";

            }
        }
        return output;
    }


}
