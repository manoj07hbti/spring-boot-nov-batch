package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VotingRequestParam {

    // Write a program to create an endpoint of the voting which takes two input parameters age and city
    // and gives the output on the browser with the given message that Person is eligible for voting in CITY

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
    // The annotation used for Request Param  is -----@RequestParam


    // Syntax for method: access_specifier return_type function or method_name (parameter){code}
    // Parameter--------an input parameter that is optional


    // Here we are using Request Param therefore endpoint is:
    // @RequestMapping("/endpoint_name")

    // Method is : method(@RequestParam  Datatype  variable_name)

    // URL : to hit the endpoint on the browser---- http://localhost:port/endpoint_name?Param1=value1&Param2=value2


    @RequestMapping("/voting_param")
    public String voting (int age ,String city){


        // Here used if-else statement, and .equals() method in Java
        // .equals() method : It is used to compare the actual content of the object.

        if(age>=18 & city.equals("Agra")){


          return " Person is eligible for voting  in city :"+ "  City is : " +city +"  ,  "+ "  Age is :" +age;
        }
         else {

            return " Person is not eligible for voting  in city :"+ "  City is : " +city +"  , "+"  Age is :" +age;

        }

    }



    @RequestMapping("/voting_param1")
    public String voting1 (int age ,String city){
           String output = " "; // here we have taken a String variable -----output and initialized it with blank value---" "

        // Here used if-else statement, and .equals() method in Java
        // .equals() method : It is used to compare the actual content of the object.

        if(age>=18 & city.equals("Agra")){


        // here reused variable and result will store in the output variable
           output = " Person is eligible for voting  in city :"+ "  City is : " +city +"  ,  "+ "  Age is :" +age; // result
        }
        else {

           output = " Person is not eligible for voting  in city :"+ "  City is : " +city +"  , "+"  Age is :" +age;

        }

       return output; //  here output variable will return---- to the stored result


    }











}
