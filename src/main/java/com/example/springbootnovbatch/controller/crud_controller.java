package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class crud_controller {

    ArrayList <String> course = new ArrayList<>();
    //c for create or add
    @RequestMapping("/add_crud/{name}")
    public String add(@PathVariable String name){
        course .add(name);
        return "added successfully :" + name;
    }
    // r for read or get
    @RequestMapping("/read")
    public ArrayList<String> getCourse(){
        return course;
    }
    // u for update
    @RequestMapping("/update")
    public String update(@RequestParam String name,@RequestParam int index){
        course.set(index,name);
        return  "successfully update "+name;
    }
    @RequestMapping("/delete/{index}")
    public String delete (@PathVariable int index){
        course.remove(index);
        return  "deleted successfully at index "+index;
    }
}


