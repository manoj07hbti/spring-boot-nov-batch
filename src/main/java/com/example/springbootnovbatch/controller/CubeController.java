package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CubeController {

    @RequestMapping("/cube")
    public String cube (){
        int a = 7;
        int cube =  a*a*a;
        return "Cube of "+a+" is = "+cube;
    }
}
