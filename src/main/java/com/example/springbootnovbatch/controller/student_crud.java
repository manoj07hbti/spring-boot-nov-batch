package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class student_crud {
    ArrayList<Student> studentArrayList = new ArrayList<>();
    @RequestMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        studentArrayList.add(student);
        return"student added successfully ";
    }

    @RequestMapping("/add_crud/{name}/{age}/{section}")
    public String add(@PathVariable String name, @PathVariable int age, @PathVariable String section) {
        Student student = new Student(name, age, section);
        studentArrayList.add(student);
        return "adding succesfully :";
    }

    @RequestMapping("/get_crud")
    public ArrayList<Student> studentArrayList() {
        return studentArrayList;
    }
    @RequestMapping("/update_crud/{name}/{index}")
    public String update(@PathVariable String name,@PathVariable int index) {
        Student student = studentArrayList.get(index);
        student.setName(name);
        return "update successfully ";

    }
    @RequestMapping("/delete_crud/{index}")
    public String delete(@PathVariable int index){
        studentArrayList.remove(index);
        return "successfully deleted";
    }




}