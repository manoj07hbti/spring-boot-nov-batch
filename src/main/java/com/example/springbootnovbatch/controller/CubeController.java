package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CubeController {

    @RequestMapping("/cube")
    public String cube() {

        int number = 4;
        int cube = number*number*number;

        return "cube of "+number+" is : "+cube;

    }
}
