package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentCrudController {

    ArrayList<Student> studentArrayList  = new ArrayList<>();


    // C - CREATE
    @RequestMapping("/Add_Student/{name}/{age}/{section]")
    public String add(@PathVariable String name, @PathVariable int age, @PathVariable String section) {

        Student student = new Student(name,age,section);
        studentArrayList.add(student);

        return "Successfully added Student Data";
    }
}
