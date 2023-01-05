package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentagePathVariableController {

    //  Write a program to create an endpoint of the percentage(method) which takes two input parameters
    // and gives the output on the browser with the given message


    // Step1 : We have created a class---- name ending with controller
    // For creating the controller class ,we will use this annotation @RestController
    // and this annotation is used above the class due to which spring framework will understand that this is a controller class


    // Step2: We will create an endpoint ,it should be unique
    // For creating the endpoint ,we will use this annotation @RequestMapping("/endpoint_name")
    // and this annotation is used above the method due to which spring framework will understand that here an endpoint is created

    // Syntax for method: access_specifier return_type function or method_name (parameter){code}
    // Parameter--------an input parameter that is optional


    // Step3: We want to pass values from the browser (user input---input from the keyboard)
    // There are two types to pass values from the browser
    // 1)PathVariable   2) RequestParam
    // Note: Path Variable type is safer than Request Param
    // The annotation used for Path Variable is -----@PathVariable
    //  The annotation used for Request Param  is -----@RequestParam


    // Here we are using PathVariable therefore endpoint is:
    // @RequestMapping("/endpoint_name/{path_variable_name1}/{path_variable_name2}")

    // Method is : method(@PathVariable Datatype  path_variable_name)
    // path_variable_name means : number and percent


    // URL : to hit the endpoint on the browser---- http://localhost:port/endpoint_name/value/value


    // http://localhost:port/endpoint_name/100/5 : output is 5

    @RequestMapping("/percentage/{number}/{percent}")
    public String percentage(@PathVariable int number , @PathVariable int percent){

        int calculate_percentage = (number*percent)/100;

        return "  Calculated percentage is :" +calculate_percentage; // output
                                                                     // Here concatenation is used
                                                                     // + operator is used for adding two things-----" any message"+output;

    }


    // http://localhost:port/endpoint_name/55/5 : output is 2.75

    @RequestMapping("/percentage1/{number}/{percent}")
    public String percentage1(@PathVariable int number , @PathVariable int percent){

        double calculate_percentage = (double)(number*percent)/100; // here type casting is used

        return "  Calculated percentage is :" +calculate_percentage; // output----in decimal
                                                                     // Here concatenation is used
                                                                    // + operator is used for adding two things-----" any message"+output;

    }






}
