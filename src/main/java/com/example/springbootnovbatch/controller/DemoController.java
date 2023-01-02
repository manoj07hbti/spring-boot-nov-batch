package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoController {

    int i=1;

    @RequestMapping("/hello") // END POINT
    public void hello(){

        System.out.println("Hello, Spring boot");
    }


    @RequestMapping("/welcome")
    public String message(){


        String welcome="Welcome to Spring Boot "+i;
        i++;
        return welcome;
    }

    @RequestMapping("/course")
    public ArrayList<String> course(){

        ArrayList<String> course= new ArrayList<>();
        course.add("java");
        course.add("Spring Boot");
        course.add("Microservices");

        return course;
    }

}
