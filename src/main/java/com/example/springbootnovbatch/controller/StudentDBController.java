package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Student;
import com.example.springbootnovbatch.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //U
    @RequestMapping("/update_std_db/{id}/{name}")
    public String update(@PathVariable long id,@PathVariable String name){

        return service.update(id,name);
    }

    //D

    @RequestMapping("/delete_std_db")
    public String delete(@RequestParam long id){

        return service.delete(id);
    }

}
