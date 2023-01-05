package com.example.springbootnovbatch.request_param;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_par {

    //Making Calculator - Add, sub, Multi ,Divide---

    //Add
    @RequestMapping("/sum")
    public String add (@RequestParam int a , @RequestParam int b){

        int sum = a+b;
        return "Addition of two number is "+ sum;
    }   // http://localhost:8082/sum?a=12&b=13

    //Subtraction

    @RequestMapping("/sub")
    public String sub (@RequestParam int a ,@RequestParam int b){

        int sub = a-b;
        return "Subtraction of two numbers is "+ sub;
    }     //   http://localhost:8082/sub?a=98&b=13

    //Multiply
    @RequestMapping("/multi")
    public String multi (@RequestParam int a , @RequestParam int b){

        int multi = a*b;
        return " Multiplication of two numbers is "+ multi;
    }   //   http://localhost:8082/multi?a=98&b=13

    //Divide
    @RequestMapping("/divide")
    public String divide (@RequestParam int a , @RequestParam int b ){

        double divide = (double) a/b;
        return "The division of two numbers is "+ divide;
    }    //  http://localhost:8082/divide?a=98&b=13




}
