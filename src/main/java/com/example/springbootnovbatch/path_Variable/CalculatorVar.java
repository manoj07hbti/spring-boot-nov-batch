package com.example.springbootnovbatch.path_Variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorVar {

    //Making Calculator - Add, sub, Multi ,Divide---

    //Add
    @RequestMapping("add/{a}/{b}")
    public String add (@PathVariable int a , @PathVariable int b){

        int sum = a+b;
        return "Addition of two number is "+ sum;
    } // http://localhost:8081/add/12/13

    //Subtraction

    @RequestMapping("/sub/{a}/{b}")
    public String sub (@PathVariable int a ,@PathVariable int b){

        int sub = a-b;
        return "Subtraction of two numbers is "+ sub;
    }     //   http://localhost:8081/sub/44/13

    //Multiply
    @RequestMapping("/multi/{a}/{b}")
    public String multi (@PathVariable int a , @PathVariable int b){

        int multi = a*b;
        return " Multiplication of two numbers is "+ multi;
    }   //   http://localhost:8081/multi/44/10

    //Divide
    @RequestMapping("/divide/{a}/{b}")
    public String divide (@PathVariable int a , @PathVariable int b ){

        double divide = (double) a/b;
        return "The division of two numbers is "+ divide;
    }    //   http://localhost:8081/divide/44/10
}
