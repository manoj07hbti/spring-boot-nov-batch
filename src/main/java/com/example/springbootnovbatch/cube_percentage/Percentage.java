package com.example.springbootnovbatch.cube_percentage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Percentage {

    //percentage
    @RequestMapping("/percentage")
    public String percent(){

        int a= 5605;
        int percent = 12;

        double percentage = (double) (a*percent)/100;

        return "12 percent of 5605 is =  "+ percentage;
        //    http://localhost:8081/percentage

    }

}
