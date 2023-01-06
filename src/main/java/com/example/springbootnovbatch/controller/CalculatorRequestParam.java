package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorRequestParam {

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

    // Here we are using Request Param therefore endpoint is:
    // @RequestMapping("/endpoint_name")

    // Method is : method(@RequestParam  Datatype  variable_name)

    // URL : to hit the endpoint on the browser---- http://localhost:port/endpoint_name?Param1=value1&Param2=value2
    // http://localhost:8081/add_param?a=2&b=3

    @RequestMapping("/add_param")
    public String addition (@RequestParam int a, @RequestParam int b){

        int sum = a+b;

        return " Addition is :  " +sum + "  Value of a : "+ a +" , "+ "  Value of b :  " +b;

    }


    @RequestMapping("/sub_param")
    public String subtraction (@RequestParam int a, @RequestParam int b){

        int sub = a-b;

        return " Subtraction is :  " +sub+ "  Value of a : "+ a +" , "+ "  Value of b :  " +b;

    }


    @RequestMapping("/multi_param")
    public String multiplication(@RequestParam int a, @RequestParam int b){

        int multi = a*b;

        return " Multiplication is :  " +multi+ "  Value of a : "+ a +" , "+ "  Value of b :  " +b;

    }


    @RequestMapping("/divide_param")
    public String division(@RequestParam int a, @RequestParam int b){

        int divide = a/b;

        return " Division is :  " +divide+ "  Value of a : "+ a +" , "+ "  Value of b :  " +b;

    }





}
