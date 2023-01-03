package com.example.springbootnovbatch.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calci_Controller {

    //make a calculator -- Add, Sub, Multi , Divide

    //add
    @RequestMapping("/addition")
    public String addition (){

        int a = 12;
        int b = 12;

        int sum = a+b;

        return "Addition of 12 and 12 is  = "+sum;
        // use annotation for printing the sum and making endpoint  -- @ Requestmapping
        // http://localhost:port/endpoint
        // http://localhost:8081/addition
    }
    //Sub
    @RequestMapping("/subtraction")
    public String sub(){

        int a = 44;
        int b = 12;

        int sub = a-b;

        return "Subtraction of 44 and 12 is = "+ sub;
        //  http://localhost:8081/subtraction
    }
    //Multi
    @RequestMapping("/multiply")
    public String multiply(){

        int a = 12;
        int b = 13;

        int multi = a*b;

        return "Multiplyof 12 and 13 is  = "+ multi;
        // http://localhost:8081/multiply
    }
    // Divide
    @RequestMapping("/division")
    public String divide (){

        int a = 24;
        int b = 5;

        double divide = (double) a/b;
        return "Division of 24 and 5 is = "+ divide;
        //   http://localhost:8081/division
    }

}
