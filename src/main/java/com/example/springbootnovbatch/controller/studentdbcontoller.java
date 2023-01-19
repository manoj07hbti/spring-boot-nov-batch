package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Student;
import com.example.springbootnovbatch.service.serviceappflow;
import com.example.springbootnovbatch.service.studentdbservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentdbcontoller {
    @Autowired
    studentdbservice service;
    @RequestMapping("/add_student_db")
    public String add(@RequestBody Student student){
      return   service.add(student);
    }
    @RequestMapping("/get_student_db")
    public List<Student>getallstudent(){
        return service.getallstudent();
    }
}
