package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PathVariableController {


    @RequestMapping("/welcome-path/{name}")
    public String welcome(@PathVariable String name) {

        String welcome = " we come to spring boot project using path variable\t" + name;

        return welcome;
    }

    @RequestMapping("/check-even-odd/{number}")
    public String checknumber(@PathVariable int number) {
        String output = " ";
        if (number % 2 == 0) {
            output = "The number is even number" + number;
        } else {
            output = " The number is odd number" + number;
        }
        return output;


    }
@RequestMapping("/check-age/{name}/{age}")
    public String checkAge(@PathVariable String name,@PathVariable int age) {

        String output = "";

        if (age < 18) {

            output = "the child name :\t" + name + "\tand his age is" + age;

        } else if (age > 18 & age < 45) {

            output = "The young person age :" + name + "and his age is" + age;
        } else {
            output = "The old person age :" + name + "and his age is" + age;

        }
        return output;

    }

}
