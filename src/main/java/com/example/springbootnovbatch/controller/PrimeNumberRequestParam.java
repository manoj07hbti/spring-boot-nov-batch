package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumberRequestParam {


    // Write a program to create an endpoint of the PrimeNumber which takes input parameter to check a number is prime or not
    // and gives the output on the browser with the given message


    // Prime number----A number is divided by 1 and itself------example--- 7 is divided by 1 and itself(7)
    // example---- 6 is divided by 1 ,2,3 and itself(6)--------6 is not prime number


    // Syntax for method: access_specifier return_type function or method_name (parameter){code}
    // Parameter--------an input parameter that is optional


    // Here we are using Request Param therefore endpoint is:
    // @RequestMapping("/endpoint_name")

    // Method is : method(@RequestParam  Datatype  variable_name)

    // URL : to hit the endpoint on the browser---- http://localhost:port/endpoint_name?Param1=value1&Param2=value2
    // http://localhost:8081/check_param?number=12




    @RequestMapping("/check_param")
    public String checkPrimeNumber(int number) {

        int temp = 0; // here we have taken a variable---temp and initialized it with 0


        // Here used for_loop
        // Syntax for for_loop: for(initialization; condition; increment or decrement){code}

        for (int i = 2; i <= number - 1; i++) {


            // Here used if-statement, modulus operator and equal-equal operator (==)
            // Syntax for if-statement : if(condition expression){code}
            // Modulus operator: it will give remainder and symbol of Modulus operator----%
            if (number % i == 0) {


                temp = temp + 1; // temp+=1; --------temp =temp+1;
                                 // += -------it is a compound addition assignment operator which adds the value of right operand to variable and assign the result to variable
            }

           }

        // if-else statement
        // Syntax for if-else statement : if(condition){code}else{code}
            if (temp == 0) {


                return " This is a  prime number :" + "  Number is  : " +number;
            } else {


                return " This is a not prime number :" + " Number is :  " +number;


            }





    }

}