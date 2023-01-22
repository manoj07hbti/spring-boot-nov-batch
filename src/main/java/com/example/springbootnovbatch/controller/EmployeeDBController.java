package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.Model.Employee;
import com.example.springbootnovbatch.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class EmployeeDBController {
    @Autowired
    EmployeeService service;

    // c-create
    @RequestMapping("/employee_db")
    public  String add ( @RequestBody Employee employee) {
      return  service.add(employee);
    }

    // r- read or get
    @RequestMapping("/get_employee_db")
    public List<Employee> getAllEmployee(){

        return  service.getAllEmployee();
    }

    // u- update
@RequestMapping("/update_db/{id}/{name}")
    public String update(@PathVariable long id,@PathVariable String name){

       return service.update(id,name);
    }

    // D- Delete

    @RequestMapping("/delete_db/{id}")
    public String delete(@PathVariable long id){

        return service.delete(id );

    }
}
