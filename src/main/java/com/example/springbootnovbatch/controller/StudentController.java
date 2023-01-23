package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Student;
import com.example.springbootnovbatch.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    // Create A table by the hel od CRUD operations

    // Create - add

    @Autowired
    StudentService service;
    @RequestMapping("/addstudent")
    public String addstudent (@RequestBody Student student){
        // Call Service Class
        return service.addstudent(student);

        // http://localhost:8082/addstudent
    }

    // read - get
    @RequestMapping("/getallstudent")
    public List<Student> getallstudent(){
        // Call service class

        return service.getallstudent();

        // http://localhost:8082/getallstudent

    }

    // update - set
    @RequestMapping("/updatestudent/{id}/{name}/{age}")
    public String updatestudent(@PathVariable long id ,@PathVariable String name ,@PathVariable int age ){
        // Call Service class

        return service.updatestudent(id, name, age);
        // http://localhost:8082/updatestudent/1/Sandeep/23
    }

    // delete
    @RequestMapping("/deletestudent/{id}")
    public String deletestudent (@PathVariable long id ){
        // Call Service Class

        return service.deletestudent(id);
        // http://localhost:8082/deletestudent/1
    }

    // Find By name
    @RequestMapping("/findbyname/{name}")
    public Student findbyname(@PathVariable String name ){
        // Call Srvice Class
        return service.findbyname(name);
        // http://localhost:8082/findbyname/Sandeep
    }

    // Find BY name and Id
    @RequestMapping("/findbynameandid/{name}/{id}")
    public Student findbyidandname(@PathVariable String name ,@PathVariable long id){
        // Call Service Class
        return service.findbynameandid(name, id);

                // http://localhost:8082/findbyname/Sandeep/1
    }

}
