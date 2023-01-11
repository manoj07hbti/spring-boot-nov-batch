package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Employee;
import com.example.springbootnovbatch.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCrudController {

    ArrayList<Employee> employeeArrayList = new ArrayList<>();


    @RequestMapping("/add_emp")
    public String addEmployee(@RequestBody Employee employee){

        employeeArrayList.add(employee);

        return "Employee Added Successfully ";
    }


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
