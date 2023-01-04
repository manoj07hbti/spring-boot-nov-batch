package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {


    @RequestMapping("/welcome_path/{name}")
    public String welcome(@PathVariable String name){

        String welcome="Welcome to Spring boot PathVariable concept "+name;

        return welcome;
    }


    @RequestMapping("/check_even_odd/{number}")
    public String checkNumber(@PathVariable int number){

        String output="";
        if(number%2==0){
        output="NUMBER IS EVEN NUMBER "+number;
        }
        else {
         output="NUMBER IS ODD NUMBER "+number;
        }

        return output;
    }

    @RequestMapping("/check_age/{name}/{age}")
    public String checkAge(@PathVariable String name,@PathVariable int age){

        String output="";
        if(age<18){

            output="Person is Child "+name +" And Age :"+age;
        }
        else if(age>18 & age <45){

            output="Person is YOUNG "+name +" And Age :"+age;
        }
        else {

            output="Person is OLD  "+name +" And Age :"+age;
        }

        return output;
    }

}
