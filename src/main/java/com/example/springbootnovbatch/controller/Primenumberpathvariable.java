package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Primenumberpathvariable {
    @RequestMapping("/prime_path/{num}")
    public String primenumber(@PathVariable int num) {
      int  check =0; String output = null;
      for(int i=2;i<=num-1;i++){
          if(num%i==0){
              check+=1;
          }if(check>0){
               output = "number is not prime "+num;
          }
          else{
          output ="number is prime "+num;
          }

      }
        return output;
    }

}
