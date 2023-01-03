package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class Demo1Controller {

       int i = 1; // here declared or initialized the variable----i----- in class


       // Step1: We have created a class ,name ending with Controller--------Demo1Controller
       // Step2 : We will use Annotation @RestController  for making the controller class
       // and this annotation will be used above the class due to which the springframework will understand that this is a controller class
       // Annotation automatically will import because it parts of the springframework


       // Step3 : We will create an endpoint, and it should be unique
       // for creating the endpoint we will use Annotation @RequestMapping("/ endpoint_name")
       // and this annotation will be used above the method due to which the springframework will understand that here an endpoint is created


       // Note : To run the program ------First, we will run the program in intelliJ and will get the port after this we will hit the endpoint on the browser
       // And we will get the output


       // Syntax for method : access_specifier return_type function or method_name(parameter){code}
       // Parameter--------an input parameter that is optional


        @RequestMapping("/display")  // end point
        public void display(){

        System.out.println(" This is the display method and also the display endpoint");

        }


        @RequestMapping("/helloWorld")
        public void helloWorld (){

        System.out.println("This is the helloWorld method and also the helloWorld endpoint");


        }

        // Note: If we want to print the output in consul then we will take return_type as void,
        // and we will use System.out.println(); ----to print the output
        // return_type means : Output of the function or method
        // The void keyword specifies that a method should not have a return value.




        @RequestMapping("/statement")
        public String statement (){

                //Syntax for variable : Datatype  variable_name = value;

          String message_for_statement = " This is a statement method "; // here used variable
                                                                         // We have taken return_type ------String
            return message_for_statement;                                // So we will return the value
                                                                         // Note : Now it will give the output on the browser(Google Chrome) after hitting the endpoint
        }


      @RequestMapping("/screen")
       public void screen (){

       System.out.println(" The screen of the television is very large "+i);  // now it will give the output increment form
                                                                              // Every time we hit the end point, it will increment the value of the output.
                                                                              // such as screen1,screen2-------
       i++;
       }




       @RequestMapping("/laptop")
       public String laptop (){

         String result = " Nice Laptop ";   //Syntax for variable : Datatype  variable_name = value;

           System.out.println("Printing the result :"+result+i); // It will give the output in consul
           i++;
                                                                 // Every time we hit the end point, it will increment the value of the output.
                                                                 // Such as ---Nice Laptop 1,Nice Laptop 2----


           return result ; // it will give the output on the browser  in normal form (not increasing form)-----nice laptop
                          // Every time we hit the end point on the browser, then it will give the output on the browser


       }


       @RequestMapping("/name")
       public ArrayList<String> cityName (){
        // here return_type-----ArrayList of String----- ArrayList<String>

        // Now we will create an ArrayList
        // Syntax for ArrayList : ArrayList <Datatype> object_name = new ArrayList<Datatype>();

        ArrayList <String> stringArrayList = new ArrayList<>();

        // Now we will add the data in object (stringArrayList) of the ArrayList of String (ArrayList <String>)
        // So we will use add method
        // Syntax for add method : object_name.add_method(); ---------object_name.add(value);

         stringArrayList.add("Agra");
         stringArrayList.add("Kanpur");
         stringArrayList.add("Lucknow");
         stringArrayList.add("Mumbai");


         return stringArrayList; // output----it will give the output on the browser after hitting the endpoint on the browser


       }







}
