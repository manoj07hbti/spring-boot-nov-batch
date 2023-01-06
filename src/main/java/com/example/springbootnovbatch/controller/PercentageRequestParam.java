package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentageRequestParam {


    //  Write a program to create an endpoint of the percentage which takes two input parameters
    // and gives the output on the browser with the given message


    // Step1 : We have created a class---- name ending with controller
    // For creating the controller class ,we will use this annotation @RestController
    // and this annotation is used above the class due to which spring framework will understand that this is a controller class

    // Step2: We will create an endpoint ,it should be unique
    // For creating the endpoint ,we will use this annotation @RequestMapping("/endpoint_name")
    // and this annotation is used above the method due to which spring framework will understand that here an endpoint is created


    // Step3: We want to pass values from the browser (user input---input from the keyboard)
    // There are two types to pass values from the browser
    // 1)PathVariable   2) RequestParam
    // Note: Path Variable type is safer than Request Param
    // The annotation used for Path Variable is -----@PathVariable
    //  The annotation used for Request Param  is -----@RequestParam


    // Syntax for method: access_specifier return_type function or method_name (parameter){code}
    // Parameter--------an input parameter that is optional

    // Here we are using Request Param therefore endpoint is:
    // @RequestMapping("/endpoint_name")

    // Method is : method(@RequestParam  Datatype  variable_name)

    // URL : to hit the endpoint on the browser---- http://localhost:port/endpoint_name?Param1=value1&Param2=value2
    // http://localhost:8081/percentage_param?number=100&percent=2


    @RequestMapping("/percentage_param")
   public String percentage (int number,int percent){

       int percentage_of_number = (number*percent)/100;

       return "   Percentage is :"+percentage_of_number +"  Number is :  " +number + "   Percent is : "+ percent;



   }






}
