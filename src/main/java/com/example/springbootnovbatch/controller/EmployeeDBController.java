package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Employee;
import com.example.springbootnovbatch.service.EmployeeDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class EmployeeDBController {
    // method to add data
    @Autowired
    EmployeeDBService service;
    @RequestMapping("/addempdata")
    public String addempdata(@RequestBody Employee employee){
        return service.addempdata(employee);

    }

    @RequestMapping("/gettallempdata")
    public List<Employee> getalldata(){
        return service.getalldata();
    }


}
