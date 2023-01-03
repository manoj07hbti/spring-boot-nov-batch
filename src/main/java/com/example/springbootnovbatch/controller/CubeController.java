package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CubeController {
    @RequestMapping("/cube")
    public String makecube (){
        int num = 5;
        int cube =  num*num*num;
        return "Cube of "+num+" is = "+cube;
    }
}
