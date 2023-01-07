package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CrudController {

    ArrayList<String> course = new ArrayList<>();

    // C - CREATE

    @RequestMapping("/add_course/{input}")
    public String add(@PathVariable String input) {
        course.add(input);
        return "ADD successfully : "+input;
    }

    // R - READING AND GET

    @RequestMapping("/get_all_course")
    public ArrayList <String> getCourse() {
        return course;
    }

    // U - UPDATE

    @RequestMapping("/update")
    public String update(@RequestParam String name , @RequestParam int index) {
        course.set(index , name);
        return "Successfully update : "+name;
    }

    // D - DELETE

    @RequestMapping("/delete/{index}")
    public String delete(@PathVariable int index) {
        course.remove(index);
        return "Delete successfully at index : "+index;
    }

    // R - READ PARTICULAR COURSE

    @RequestMapping("/get_course/{index}")
    public String getCourse(@PathVariable int index) {
        return course.get(index);
    }

}
