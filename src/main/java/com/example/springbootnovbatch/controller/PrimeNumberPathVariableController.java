package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumberPathVariableController {

    // Write a program to create an endpoint of the PrimeNumber which takes input parameter to check a number is prime or not
    // and gives the output on the browser with the given message

    // Prime number----A number is divided by 1 and itself------example--- 7 is divided by 1 and itself(7)
    // example---- 6 is divided by 1 ,2,3 and itself(6)--------6 is not prime number


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
    // @RequestMapping("/endpoint_name/{path_variable_name}")

    // Method is : method(@PathVariable Datatype  path_variable_name)




       @RequestMapping("/check/{number}")
       public String checkPrimeNumber (@PathVariable int number){

              int temp = 0; // Here declared a variable---temp --- of int type
                            // Syntax for variable : Datatype  variable_name = value;

           // Here used for-loop ,if-statement ,modulus operator, if-else statement and equal-equal operator (==)
           // Syntax for for_loop : for(initialization; condition; increment or decrement){code}
           // Syntax for if-statement: if(condition expression){code}
           // Syntax for if-else statement :if(condition){coded} else{code}
           // Modulus operator : it will give remainder ,symbol of modulus operator is ---%

               for(int i = 2; i<=number-1; i++){


                 // if-statement: if(condition expression){code}
                  if(number%i==0){

                      temp = temp+1; // temp+=1; -------
                  }



               }

              // if-else statement :if(condition){coded} else{code}
               if(temp==0){

                  return "This is  prime number" +number;

               }
                else {

                   return "This is not  prime number" +number;

               }




       }




}
