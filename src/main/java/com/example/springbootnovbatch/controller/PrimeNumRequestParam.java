package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PrimeNumRequestParam {
    @RequestMapping("/check_prime_param")
    public String primenumber(@RequestParam int num){
        int check = 0; String output;
        for(int i=2; i<num; i++){
            if (num%i==0){
                check+=1;
            }
        }
        if (check>0){
            output = num+" is not a Prime Number";
        }else {
            output = num+" is a Prime Number";
        }
        return output;
    }
}
