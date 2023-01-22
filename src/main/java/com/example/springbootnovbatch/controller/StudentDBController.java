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
    @RequestMapping("/Add_Student_db")
    public String add(@RequestBody Student student) {
    // call service class
        service.add(student);
        return service.add(student);
    }

    // R
    @RequestMapping("/get_All_Student")
    public List<Student> getAllStudent() {

        return service.getAllStudent();
    }

    // U
    @RequestMapping("/update_Student/{id}/{name}")
    public String update(@PathVariable long id, @PathVariable String name) {

        return service.update(id,name);
    }

    // D
    @RequestMapping("/delete_Student")
    public String delete(@RequestParam long id) {

        return service.delete(id);
    }
}
