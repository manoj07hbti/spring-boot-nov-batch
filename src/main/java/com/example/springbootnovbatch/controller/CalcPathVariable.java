package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalcPathVariable {

    @RequestMapping("/addition/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {

        int sum = a + b;

        return "Addition is " + sum;

    }


    @RequestMapping("/subtraction/{a}/{b}")
    public String sub(@PathVariable int a, @PathVariable int b) {

        int sub = a - b;

        return "Subtraction  is " + sub;
    }



    @RequestMapping("/multi/{c}/{e}")
    public String multi(@PathVariable int c, @PathVariable int e) {

        int multi = c * e;

        return " Multiple  is " + multi;

    }


    @RequestMapping("/per/{m}/{n}")
    public String per (@PathVariable int m, @PathVariable int n) {

        int per = (m*n)/100;

        return " percentage is"+per ;
}

    @RequestMapping("/divi/{m}/{n}")
    public String divider (@PathVariable int m, @PathVariable int n) {

        int div = m/n;

        return " divide is"+div ;
}

}