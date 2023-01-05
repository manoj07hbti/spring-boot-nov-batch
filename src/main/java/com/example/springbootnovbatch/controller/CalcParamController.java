package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcParamController {

    @RequestMapping("/add_param")
    public String add(@RequestParam int a, @RequestParam int b){

        int sum=a+b;

        return "Addition is "+sum;       // http://localhost:8085/add_param?a=12&b=25

    }


    @RequestMapping("/sub_param")
    public String sub(@RequestParam int a, @RequestParam int b) {

        int sub = a - b;

        return "Subtraction  is " + sub;   // http://localhost:8085/sub_param?a=15&b=5
    }



    @RequestMapping("multi_param")
    public String multi(@RequestParam int c,@RequestParam  int e) {

        int multi = c * e;

        return " Multiple  is " + multi;  // http://localhost:8085/multi_param?c=22&e=2

    }


    @RequestMapping("percent_param")
    public String percent (@RequestParam int x, @RequestParam int y) {

        int per = (x*y)/100;

        return " percentage is" + per;  //http://localhost:8085/percent_param?x=10&y=2550

    }





}
