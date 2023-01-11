package com.example.springbootnovbatch.controller;


import com.example.springbootnovbatch.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Employeecontroller {
    ArrayList<Employee>employeearraylist=new ArrayList<>();
@RequestMapping("/add_employee")
    public String addemployee(@RequestBody Employee employee){

        employeearraylist.add(employee);

        return "employee added successfully";
    }
    @RequestMapping("/get_all_employee")
    public ArrayList<Employee>getEmployeeArrayList(){

    return employeearraylist;
    }
    @RequestMapping("/update_employee/{name}/{index}")
    public String update(@PathVariable String name,@PathVariable int index){

    Employee employee=employeearraylist.get(index);

    employee.setName(name);

    return "employee update successfully";
    }
    @RequestMapping("/delete student")
    public String delete(@PathVariable int index){

    employeearraylist.remove(index);

    return "employee delete successfull";

    }


}
