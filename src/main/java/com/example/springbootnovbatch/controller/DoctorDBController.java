package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Doctor;
import com.example.springbootnovbatch.service.DoctorDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import java.util.List;

@RestController
public class DoctorDBController {
    @Autowired
    DoctorDBService service;
    @RequestMapping("/adddocdata")
    public String adddocdata(@RequestBody Doctor doctor){
        return service.adddocdata(doctor);
    }

    @RequestMapping("/getdocdata")
    public List<Doctor> getdocdata(){
        return service.getdocdata();
    }
    //Update name section
    @RequestMapping("/updatedocname/{id}/{name}")
    public String updatedocname(@PathVariable long id, @PathVariable  String name){
        return service.updatedocname(id, name);
    }
    //Update age section
    @RequestMapping("/updatedocage/{id}/{age}")
    public String updatedocage( @PathVariable long id, @PathVariable  int age){
        return service.updatedocage(id, age);
    }
    //Update salary section
    @RequestMapping("/updatedocsalary/{id}/{salary}")
    public String updatedocsalary( @PathVariable long id, @PathVariable  double salary){
        return service.updatedocsalary(id, salary);
    }
    @RequestMapping("/deletedocdata/{id}")
    public String deletedocdata(long id){
        return service.deletedocdata(id);
    }
}
