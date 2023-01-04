package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddEvenController {

    @RequestMapping("/even")
    public String even() {
        String output = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {

                output += i;
                output += " , ";
            }
        }
        return "even is " + output;
    }


    @RequestMapping("/odd")
    public String odd() {
        String output = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {

                output += i;
                output += " , ";
            }
        }
        return "odd is " + output;

    }


}


