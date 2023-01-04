package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatePercentageController {

    // Step1: We have created a class name ending with controller------------CalculatePercentageController
    // We will use Annotation @RestController for making the controller class
    // and this annotation will be used above the class due to which the springframework will understand that this is a controller class
    // Annotation automatically will import because it parts of the springframework

    // Step2: We will create an endpoint , and it should be unique
    // for creating the endpoint we will use Annotation @RequestMapping("/ endpoint_name")
    // and this annotation will be used above the method due to which the springframework will understand that here an endpoint is created



    // Note : To run the program ------First, we will run the program in intelliJ and will get the port after this we will hit the endpoint on the browser
    // And we will get the output


    // Syntax for method : access_specifier return_type function or method_name(parameter){code}
    // Parameter--------an input parameter that is optional


    // Write a code to calculate the percentage of a number


    @RequestMapping("/percentage") // endpoint
     public String calculatePercentage (){

         // Here we have taken return_type as String therefore,we will return the value
         // and after hitting the endpoint on the browser will get the output on the browser with given message

         // here used variable of int type
         // Syntax for variable : Datatype variable_name = value;

         int number = 100;
         int percent = 10;
         int result = (number*percent)/100;

         return "Percentage of a number is :"+result; // here concatenation is used
                                                      // + operator is used for adding two things-----"any message"+output
                                                      // output
     }


    @RequestMapping("/percentage1") // endpoint
    public int calculatePercentage1 (){

        // Here we have taken return_type as int  therefore,we will return the value
        // and after hitting the endpoint on the browser will get the output on the browser

        // here used variable of int type
        // Syntax for variable : Datatype variable_name = value;

        int number = 100;
        int percent = 10;
        int result = (number*percent)/100;

        return result; // output


    }


    @RequestMapping("/percentage2") // endpoint
    public void calculatePercentage2 (){

        // Here we have taken return_type as void  therefore,we will not return the value
        // Therefore, We will use---- System.out.println();----- to print or get the output on the console
        // and after hitting the endpoint on the browser will get the output on the console with the given message

        // here used variable of int type
        // Syntax for variable : Datatype variable_name = value;

        int number = 100;
        int percent = 10;
        int result = (number*percent)/100;

        System.out.println("Percentage of a number is :"+result); // output


    }






}
