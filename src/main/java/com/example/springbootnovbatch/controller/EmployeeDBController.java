package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Employee;
import com.example.springbootnovbatch.service.EmployeeDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    // update name section
    @RequestMapping("/updateempname/{id}/{name}")
    public String updateempname ( @PathVariable long id, @PathVariable  String name ){
        return service.updateempname(id,name);
    }
    // update age section
    @RequestMapping("/updateempage/{id}/{age}")
    public String updateempage ( @PathVariable long id,  @PathVariable int age ){
        return service.updateempage(id,age);
    }
    // update department section
    @RequestMapping("/updateempdep/{id}/{department}")
    public String updateempdep ( @PathVariable long id,  @PathVariable String department ){
        return service.updateempdep(id,department);
    }
    //delete section
    @RequestMapping("/deleteemp/{id}")
    public String deleteempdata( @PathVariable long id){
        return service.deleteempdata(id);
    }


}
