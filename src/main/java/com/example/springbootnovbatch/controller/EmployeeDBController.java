package com.example.springbootnovbatch.controller;


import com.example.springbootnovbatch.model.Employee;
import com.example.springbootnovbatch.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class EmployeeDBController {


    @Autowired
    EmployeeService Service;


    // C- create


    @RequestMapping("/ADD_EMPLOYEE_DB")
     public String add(@RequestBody Employee employee){

        // call service class

        return Service.add(employee);
    }

    //R- READ & GET

   @RequestMapping("/GET_ALL_EMPLOYEE_DB")

    public List<Employee>getallemployee(){      // 1

        return Service.getAllEmployee();   //  4 only if service class has its operataion first
    }

    // U =update

    @RequestMapping("/UPDATE_EMPLOYEE_DB/{ID}/{name}")   ////http://localhost:8081/UPDATE_EMPLOYEE_DB/1/VISHAL SINGH

    public String update(@PathVariable long ID,@PathVariable String name){

        return Service.update(ID,name);
    }

    // D= delete

    @RequestMapping("/DELETE_EMPLOYEE_DB")   //http://localhost:8081/DELETE_EMPLOYEE_DB?ID=3
    public String delete(@RequestParam long ID) {   //  1

        return Service.delete(ID);
    }

    // find by name

    @RequestMapping("/FIND_BY_NAME/{name}")

     public Employee find(@PathVariable String name){
        return Service.findByName(name);
    }
    @RequestMapping("/FIND_BY_ID_NAME/{ID}/{name}")

    public Employee find(@PathVariable long ID,@PathVariable String name) {
        return Service.findByIDAndName(ID,name);
    }

    @RequestMapping("/FIND_BY_SQL/{ID}/{name}")
     public Employee findBySQL(@PathVariable long ID,@PathVariable String name){
        return Service.findBySQL(ID,name);
     }
    }





















