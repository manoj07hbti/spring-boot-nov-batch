package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateCubeController {

    // Write a code to calculate the cube of a number

    // Syntax for method : access_specifier return_type function or method_name(parameter){code}
    // Parameter--------an input parameter that is optional



    @RequestMapping("/cube") // endpoint
    public String calculateCube (){

        // Here we have taken return_type as String therefore,we will return the value
        // and after hitting the endpoint on the browser will get the output on the browser with given message

        // here used variable of int type
        // Syntax for variable : Datatype variable_name = value;

       int number = 5;
       int cube_of_number = number*number*number;

       return "Calculated the cube of a number :  "+cube_of_number; // output
                                                                    // here concatenation is used
                                                                    // + operator is used for adding two things-----"any message"+output
    }

    @RequestMapping("/cube1") // endpoint
    public int calculateCube1 () {

        // Here we have taken return_type as int therefore,we will return the value
        // and after hitting the endpoint on the browser will get the output on the browser without message

        // here used variable of int type
        // Syntax for variable : Datatype variable_name = value;

        int number = 5;
        int cube_of_number = number * number * number;

        return cube_of_number; // output


    }

    @RequestMapping("/cube2") // endpoint
    public void calculateCube2 () {

        // Here we have taken return_type as void therefore,we will not return the value
        // Therefore, We will use---- System.out.println();----- to print or get the output on the console
        // and after hitting the endpoint on the browser will get the output on the console with the given message

        // here used variable of int type
        // Syntax for variable : Datatype variable_name = value;

        int number = 5;
        int cube_of_number = number * number * number;

        System.out.println("Cube of a number is :"+cube_of_number); // output


    }








}
