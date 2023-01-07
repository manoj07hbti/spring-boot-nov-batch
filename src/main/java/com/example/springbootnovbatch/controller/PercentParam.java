package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentParam {

    @RequestMapping("/percent_param")
    public String percent(@RequestParam double number, @RequestParam double percent) {
        double percentage = (number*percent)/100;

        return "Percentage is : "+percentage;
    }

}
