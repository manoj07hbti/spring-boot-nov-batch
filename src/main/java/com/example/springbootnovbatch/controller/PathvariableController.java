package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathvariableController {
    @RequestMapping("/Welcome/{name}")
    public String Welcome(@PathVariable String name) {

        String Welcome = "welcome to springboot path variable " + name;
        return Welcome;

    }
    @RequestMapping("/checkvalue/{number}")
    public String checknumber(@PathVariable int number) {
        String output = "";
        if (number % 2 == 0) {
            output = "number is even number " + number;
        }
        else {
            output = "number is not even number " + number;
        }

            return output;
        }
        @RequestMapping("/age/{name}/{age}")
        public String checkage(@PathVariable String name,@PathVariable int age){
        String output;
        if(age<18){
            output="person is child "+name +"and age "+ age;
        }
            else if(age>18 & age<45){
                output="person is young "+name +"and age "+age;
            }
            else{
                output="person is old "+name +"and age "+age;

        }
            return output;




        }

}
