package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Teacher;
import com.example.springbootnovbatch.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    // Crud Operation for insert data in database --

    // Create- add
    @Autowired
    TeacherService service;

    @RequestMapping("/addteacher")
    public String addteacherdb (@RequestBody Teacher teacher){

        // call service class
        return service.add(teacher);
        // http://localhost:8082/addteacher
    }

    // read - get
    @RequestMapping("/getallteacher")
    public List<Teacher> getallteacher(){
        // call service class

        return service.getallteacher();
        // http://localhost:8082/getallteacher
    }

    // update- set
    @RequestMapping("/updateteacher/{id}/{name}/{subject}/{school}")
    public String update (@PathVariable long id ,@PathVariable String name ,@PathVariable String subject,@PathVariable String school){

        // call service class

        return service.update(id,name,subject,school);
        // http://localhost:8082/updateteacher/1/Siddharth/Economics/Govt
    }





}
