package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentageParam {

                                     //http://localhost:8081/per-param?number=325&total=500
    @RequestMapping("per-param")
    public String percentage(double number,double total){
        String output;
        double result=number/total*100;

        return output="The number score :"+number+"outoff:"+total+"Your percentage is:"+result;

    }
}
