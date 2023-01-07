package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenController {

    @RequestMapping("/Even")
    public String Even() {
        String output="";
        for (int i = 1; i<101; i++) {

            if(i%2==0) {
                output+=i;
                output+=", ";
            }
        }
        return output;
    }

}
