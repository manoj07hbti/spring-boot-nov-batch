package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @RequestMapping("/welcome_path/{name}")

    public String welcome(@PathVariable String name){
        String welcome = "Welcome to Spring boot "+name;
        return welcome;
    }


    @RequestMapping("/check_even_odd/{number}")
    public String check_number(@PathVariable int number) {
        String output = "";
        if(number%2==0) {
            output = "Number is Even : "+number;
        }
        else{
            output = "Number is Odd : "+number;
        }
        return output;
    }


    @RequestMapping("/check_name_age/{name}/{age}")
    public String check_Age(@PathVariable String name, @PathVariable int age) {
        String output = "";
        if(age<18) {
            output = "You are Child "+name+" your age is "+age;
        }
        else if(age>18 & age<45) {
            output = "You are young "+name+" your age is greater than "+age;
        }
        else {
            output = "You are old man "+name+" your age is greater than  48 and you age is : "+age;
        }

        return output;
    }

}
