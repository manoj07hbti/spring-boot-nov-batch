package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentageController {

    @RequestMapping("/percentage")
    public String percent() {
        int num = 453;
        double percent = 15;

        double percentage = (num*percent)/100;
        return "Percentage of "+num+" is -: "+percentage;
    }

}
