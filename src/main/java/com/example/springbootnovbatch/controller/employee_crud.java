package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.AbstractList;
import java.util.ArrayList;

@RestController
public class employee_crud {
    ArrayList<Employee> employeeArraylist = new ArrayList<>();
    @RequestMapping("/add_employ/{name}/{id}/{salary}")
    public String add(@PathVariable String name,@PathVariable int id,@PathVariable double salary){
        Employee employee =new Employee(name,id,salary);
        employeeArraylist.add(employee);
        return "adding successfully ";

    }
    @RequestMapping("/read_employ")
    public ArrayList<Employee> employeeArrayList(){
        return employeeArraylist;
    }
    @RequestMapping("/update_employ/{name}/{index}")
    public String update(@PathVariable String name,@PathVariable int index){
      Employee employee=  employeeArraylist.get(index);
        employee.setName(name);
        return "successfully update ";
    }
    @RequestMapping("/delete_employ/{index}")
            public String delete(@PathVariable int index){
        employeeArraylist.remove(index);
        return "successfully deleted";
    }
;}
