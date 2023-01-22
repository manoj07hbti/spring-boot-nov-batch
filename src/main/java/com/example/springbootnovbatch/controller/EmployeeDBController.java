package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Employee;
import com.example.springbootnovbatch.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDBController {

    @Autowired
    EmployeeService service;
    //C
    @RequestMapping("/Add_Employee")
    public String add(@RequestBody Employee employee) {
        // call service class
        service.add(employee);
        return service.add(employee);
    }

    // R
    @RequestMapping("/get_All_Employee")
    public List<Employee> getAllEmployee() {

        return service.getAllEmployee();
    }

    // U
    @RequestMapping("/update_Employee/{id}/{name}")
    public String update(@PathVariable long id, @PathVariable String name) {

        return service.update(id,name);
    }

    // D
    @RequestMapping("/delete_Employee")
    public String delete(@RequestParam long id) {

        return service.delete(id);
    }
}
