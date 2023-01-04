package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateOddNumberController {

    // Write a code to calculate the odd number between 1 and 100

    // Syntax for method : access_specifier return_type function or method_name(parameter){code}
    // Parameter--------an input parameter that is optional

    @RequestMapping("/odd") // endpoint
    public String calculateOddNumber(){

        // Here we have taken return_type as String therefore,we will return the value
        // and after hitting the endpoint on the browser will get the output on the browser

        // Here used for loop
        // Syntax for for_loop : for (Initialization; condition; increment or decrement){code}


        String output = " "; // Here declared a variable(output) of String datatype
        // Syntax for variable : Datatype variable_name = value;

        for(int i =1 ; i<=100; i++){


            // Here used if statement , modulus operator and != operator (not_equal operator)
            // Syntax for if-statement : if(condition expression){code}
            // Modulus operator : It will give the remainder  ,Symbol of  Modulus operator ----- %

            if(i%2!=0){

                // Here reuses variable ---output
                output+=i; // output = output+i
                           // += is compound addition assignment operator which adds value of right operand to variable and assign the result to variable.

                output+= " , ";


            }

        }

        return output;


    }







}
