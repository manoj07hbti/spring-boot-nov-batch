package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Employee;
import com.example.springbootnovbatch.service.employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Employeecontroller {
    @Autowired
    employeeservice service;
    @RequestMapping("/employee_db")
    public  String add(@RequestBody Employee employee){
        return service.add(employee);
    }
    @RequestMapping("/get_employ")
    public List <Employee>getallemployee(){
        return service.getallemployee();
    }
}
