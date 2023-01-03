package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentCalculatorController {

    // Method for calculator : addition , subtraction , multiplication ,division


    // Step1: We have created a class ,name ending with Controller--------AssignmentCalculatorController
    // Step2 : We will use Annotation @RestController  for making the controller class
    // and this annotation will be used above the class due to which the springframework will understand that this is a controller class
    // Annotation automatically will import because it parts of the springframework


    // Step3 : We will create an endpoint, and it should be unique
    // for creating the endpoint we will use Annotation @RequestMapping("/ endpoint_name")
    // and this annotation will be used above the method due to which the springframework will understand that here an endpoint is created


    // Note : To run the program ------First, we will run the program in intelliJ and will get the port after this we will hit the endpoint on the browser
    // And we will get the output


    // Syntax for method : access_specifier return_type function or method_name(parameter){code}
    // Parameter--------an input parameter that is optional



     @RequestMapping("/addition")
     public int addition (){

       int a = 10;
       int b = 20;

       int sum = a+b;
       return  +sum;

     }


    @RequestMapping("/addition1")
    public String addition1 (){

        int a = 10;
        int b = 20;

        int sum = a+b;
        return " The addition of two numbers are : " +sum;

    }



    @RequestMapping("/subtraction")
    public String subtraction (){

        int a = 100;
        int b = 20;

        int result = a-b;
        return " The subtraction of two numbers are : " +result;

    }


    @RequestMapping("/subtraction1")
    public double subtraction1 (){

        double a = 10.58;
        double b = 2.5;

        double result = (double)a-b; // Here used type-casting
        return  +result;

    }





    @RequestMapping("/multiplication")
    public String multiplication (){

        int a = 5;
        int b = 4;

        int result = a*b;
        return " The multiplication of two numbers are : " +result;

    }


    @RequestMapping("/multiplication1")
    public double multiplication1 (){

        int a = 5;
        int b = 4;

        double result = (double) a*b; // Here used type-casting
        return  +result;

    }


    @RequestMapping("/multiplication2")
    public int multiplication2 (){

        int a = 10;
        int b = 20;

        int result =  a*b;
        return  +result;

    }


    @RequestMapping("/multiplication3")
    public float multiplication3 (){

        int a = 10;
        int b = 20;

        float result =  (float) a*b; // here used type casting
        return  +result;

    }


    @RequestMapping("/division")
    public String division (){

        int a = 10;
        int b = 2;

        int result = a/b;
        return " The division of two numbers are : " +result;

    }


    @RequestMapping("/division1")
    public String division1 (){

        int a = 150;
        int b = 34;

        double result = (double)a/b; // here used type casting
        return " The division of two numbers are : " +result;

    }









}
