package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prime_controller {

    @RequestMapping("/prime/{num}")
    public String prime(@PathVariable int num) {
        int num1 = 0;
        String output = "";
        for (int i = 2; i < num; i++) {

            if (num % 2 == 0) {
                num1 += 1;
            }
        }
        if (num1 > 0) {
            output = "it is  not prime number " + num;
        } else {
            output = "it is  a prime number " + num;
        }
        return output;// http://localhost:8085/prime/11
    }


    // Requestparam
    @RequestMapping("/prime2")
    public String primenumber(@RequestParam int num) {
        int digit = 0;
        String output="" ;
        for (int i = 2; i<num; i++) {

            if (num % 2 == 0) {
                digit += 1;
            }
        }
        if (digit>0) {
            output = "it is not prime number " + num;
        } else {
            output = "it is  a prime number " + num;
        }
        return output;//   http://localhost:8085/prime2?num=11
    }
}