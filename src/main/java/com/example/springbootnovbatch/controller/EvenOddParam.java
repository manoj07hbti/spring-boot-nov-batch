package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddParam {

    @RequestMapping("/Even_param")
    public String Even (@RequestParam int number) {
        String output="";
        for (int i = 1; i<101; i++) {

            if(i%2==0) {
                output+=i;
                output+=", ";
            }
        }
        return output;
    }

    @RequestMapping("/Odd_param")
    public String Odd(@RequestParam int number) {
        String output="";
        for (int i = 1; i<101; i++) {

            if(!(i%2==0)) {
                output+=i;
                output+=", ";
            }
        }
        return output;
    }

}
