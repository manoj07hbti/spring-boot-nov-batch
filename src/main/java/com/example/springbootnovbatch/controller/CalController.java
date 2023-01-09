package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalController {

    @RequestMapping("/add")
    public String add() {
        int a = 3;
        int b = 2;
        int sum  = a + b;

        return "Addition is "+sum;
    }
}
