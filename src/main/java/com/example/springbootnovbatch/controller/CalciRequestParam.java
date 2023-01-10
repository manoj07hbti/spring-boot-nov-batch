package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalciRequestParam {

    @RequestMapping("/add-param")
    public String add(@RequestParam double a,@RequestParam double b){

        String output;

        double result=a+b;
        return output ="The sum of the number "+a+"and"+b+" is :"+result;

    }

    @RequestMapping("/sub-param")
    public String sub(@RequestParam double a,@RequestParam double b){

        String output;

        double result=a-b;
        return output ="The sub of the number "+a+"and"+b+" is :"+result;

    }


    @RequestMapping("/multi-param")
    public String multi(@RequestParam double a,@RequestParam double b){

        String output;

        double result=a*b;         //http://localhost:8081/multi-param?a=7&b=8
        return output ="The multiply of the number "+a+"and"+b+" is :"+result;

    }

    @RequestMapping("/div-param")
    public String div(@RequestParam double a,@RequestParam double b){

        String output;

        double result=a/b;
        return output ="The division of the number "+a+"and"+b+" is :"+result;

    }
}
