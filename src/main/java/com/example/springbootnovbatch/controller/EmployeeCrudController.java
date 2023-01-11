package com.example.springbootnovbatch.controller;


import com.example.springbootnovbatch.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCrudController {

    @RequestMapping("/add_employee")                        // {
                                                           // "name":"varun",
                                                          //  "age":26,
                                                         //  "salary":320299.282,
                                                        //       "dep":"mechanical"
                                                        //        }
    public String addemployee(@RequestBody Employee employee){
        getEmployeeData().add(employee);
        return "Employee added successfully";
    }

    ArrayList<Employee> employeeData = new ArrayList<>();

    //Create section
    @RequestMapping("/addemployee/{name}/{age}/{salary}/{department}")
    public String addemployee(@PathVariable String name, @PathVariable int age,@PathVariable double salary, @PathVariable String department){
        Employee employee = new Employee(name,age,salary,department);
        employeeData.add(employee);

        return "Employee data added successfully";

    }
    //Read Section

    @RequestMapping("/getemployee")
    public ArrayList<Employee> getEmployeeData() {
        return employeeData;
    }

    //Update name Section
    @RequestMapping("/updateemployee_name/{name}/{index}")
    public String updateemployeename(@PathVariable String name,@PathVariable int index){
        Employee employee = employeeData.get(index);
        employee.setName(name);
        return "Employee name updated successfully";
    }
    //Update Age Section
    @RequestMapping("/updateemployee_age/{age}/{index}")
    public String updateemployeeage(@PathVariable int age,@PathVariable int index){
        Employee employee = employeeData.get(index);
        employee.setAge(age);
        return "Employee age updated successfully";
    }


    // delete section
    @RequestMapping("/removeemployee")
    public String removeemployee(@RequestParam int index){
        employeeData.remove(index);
        return "Employee data removed successfully";
    }
}
