package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorPathVariableController {

    // Calculator : addition,subtraction,multiplication ,division
    // Write a program to create an endpoint of the calculator which takes input parameters as int a,int b
    // and gives the output on the browser with the given message


    // Step1 : We have created a class---- name ending with controller
    // For creating the controller class ,we will use this annotation @RestController
    // and this annotation is used above the class due to which spring framework will understand that this is a controller class
    // this annotation automatically will import because it is a part of the spring framework


    // Step2: We will create an endpoint ,it should be unique
    // For creating the endpoint ,we will use this annotation @RequestMapping("/endpoint_name")
    // and this annotation is used above the method due to which spring framework will understand that here an endpoint is created
    // this annotation also automatically will import because it is a part of the spring framework


    // Step3: We want to pass values from the browser (user input---input from the keyboard)
    // There are two types to pass values from the browser
    // 1)PathVariable   2) RequestParam
    // Note: Path Variable type is safer than Request Param
    // The annotation used for Path Variable is -----@PathVariable
    //  The annotation used for Request Param  is -----@RequestParam

    // Here we are using PathVariable therefore endpoint is:
    // @RequestMapping("/endpoint_name/{path_variable_name1}/{path_variable_name2}")

    // Method is : method(@PathVariable Datatype  path_variable_name)
    // path_variable_name means : a and b

    // URL : to hit the endpoint on the browser---- http://localhost:port/endpoint_name/value/value
     // http://localhost:port/endpoint_name/10/5

    // Syntax for method: access_specifier return_type function or method_name (parameter){code}
    // Parameter--------an input parameter that is optional


    @RequestMapping("/addition/{a}/{b}")
     public String addition(@PathVariable int a ,@PathVariable int b){

         int addition_of_two_numbers = a+b;

         return " Addition is :" +addition_of_two_numbers; // output
                                                           // Here concatenation is used
                                                           // + operator is used for adding two things-----" any message"+output;



     }


    @RequestMapping("/subtraction/{a}/{b}")
    public String subtraction(@PathVariable int a ,@PathVariable int b){

        int subtraction_of_two_numbers = a-b;

        return " Subtraction is :" +subtraction_of_two_numbers;



    }


    @RequestMapping("/multiplication/{a}/{b}")
    public String multiplication(@PathVariable int a ,@PathVariable int b){

        int multiplication_of_two_numbers = a*b;

        return " Multiplication is :" +multiplication_of_two_numbers;



    }


    @RequestMapping("/division/{a}/{b}")
    public String division(@PathVariable int a ,@PathVariable int b){

        int division_of_two_numbers = a/b;

        return " Division is :" +division_of_two_numbers;



    }










}
