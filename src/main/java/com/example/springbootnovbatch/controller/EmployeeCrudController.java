package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeCrudController {

    ArrayList<Employee> employeeArrayList = new ArrayList<>();


    // C - CREATE
    @RequestMapping("/Employee_Data/{name}/{id}/{salary}")
    public String add(@PathVariable String name, @PathVariable int id, @PathVariable double salary) {
        Employee employee = new Employee(name, id , salary);
        return "Added Employee details Successfully";
    }


    // R - READ AND GET
    @RequestMapping("/Get_Employee_Details/")
    public ArrayList <Employee> getEmployeeArrayList(){
        return employeeArrayList;
    }


    // U - UPDATE
    @RequestMapping("/Update_DataOf_Employee/{name}/{id}")
    public String update(@PathVariable String name, @PathVariable int id){
        Employee employee =  employeeArrayList.get(id);
        employee.setName(name);
        return "Update Data SuccessFully";
    }


    // D - DELETE
    @RequestMapping("/Delete_Employee_Data")
    public String delete(@RequestParam String name) {
        employeeArrayList.remove(name);
        return "Data Deleted Successfully";
    }
}
