package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentPathVariable {

    @RequestMapping("/Percentage/{number}/{percent}")

    public String Percent(@PathVariable double number, @PathVariable double percent) {
        double percentage = (number*percent)/100;

        return "Percentage is : "+percentage;
    }
}
