package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VotingPathVariableController {

    // Write a program to create an endpoint of the voting which takes two input parameters age and city
    // and gives the output on the browser with the given message that Person is eligible for voting in CITY

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
    // The annotation used for Request Param  is -----@RequestParam


    // Here we are using PathVariable therefore endpoint is:
    // @RequestMapping("/endpoint_name/{path_variable_name1}/{path_variable_name2}")

    // Method is : method(@PathVariable Datatype  path_variable_name)



   @RequestMapping("/voting/{city}/{age}")
    public String voting (@PathVariable String city ,@PathVariable int age) {



       // if-else statement
       // Syntax for if-else statement : if(condition expression){code}else{code}
       if (city.equals("Agra") & age>=18) {

            return "Person is eligible for voting :"+ "  City is : " +city + "   Age is :" +age;
       }
       else {

           return "Person is not eligible for voting :"+ " City is : " +city + "   Age is :" +age;

       }


       }



}
