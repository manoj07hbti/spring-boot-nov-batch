package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CrudController {

    ArrayList<String> course= new ArrayList<>();


    //C- CREATE
    @RequestMapping("/add_course/{input}")
    public String add(@PathVariable String input){

        course.add(input);

        return "Added Successfully : "+input;
    }

    //R- READ or GET
    @RequestMapping("/get_all_course")
    public  ArrayList<String> getCourse(){

        return course;
    }

    //U- update

    @RequestMapping("/update")
    public String update(@RequestParam String name, @RequestParam int index){

        course.set(index,name);

        return "Successfully Updated : "+name;
    }

    //D- delete

    @RequestMapping("/delete/{index}")
    public String delete(@PathVariable int index){

        course.remove(index);

        return "Deleted Successfully at index : "+index;
    }

    //R- READ particular course

    @RequestMapping("/get_course/{index}")
    public String getCourse(@PathVariable int index){

        return course.get(index);
    }

}
