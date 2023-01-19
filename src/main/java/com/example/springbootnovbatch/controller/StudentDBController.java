package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Student;
import com.example.springbootnovbatch.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentDBController {

    @Autowired
    StudentService service;

    //C
    @RequestMapping("/add_student_db")
    public String add(@RequestBody Student student){
     //call service class
     return   service.add(student);
    }

    //R
    @RequestMapping("/get_students_db")
    public List<Student> getAllStudent(){

        return  service.getAllStudents();
    }
}
