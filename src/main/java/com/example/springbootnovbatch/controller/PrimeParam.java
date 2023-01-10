package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeParam {

    @RequestMapping("/prime-param")
    public String primenumber(@RequestParam int number){
        int check = 0; String output;
        for(int i=2; i<number; i++){
            if (number%i==0){
                check+=1;
            }
        }
        if (check>0){
            output = number+" is not a Prime Number";
        }else {
            output = number+" is a Prime Number";
        }
        return output;
    }
}
