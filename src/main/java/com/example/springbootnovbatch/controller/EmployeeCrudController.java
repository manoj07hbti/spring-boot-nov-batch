package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCrudController {

    ArrayList<Employee> employeeData = new ArrayList<>();

    // postman JSON file
    @RequestMapping("/add_emp")
    public String addEmployeedata(@RequestBody Employee employee){

        employeeData.add(employee);

        return "Employee data added successfully";

    }

    //Create section
    @RequestMapping("/addemployee/{name}/{age}/{department}")
    public String addemployee(@PathVariable String name,@PathVariable int age,@PathVariable String department){
        Employee employee = new Employee(name,age,department);
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
    //Update department Section
    @RequestMapping("/updateemployee_department/{department}/{index}")
    public String updateemployeedepartment(@PathVariable String department,@PathVariable int index){
        Employee employee = employeeData.get(index);
        employee.setDepartment(department);
        return "Employee department updated successfully";
    }

    // delete section
    @RequestMapping("/removeemployee")
    public String removeemployee(@RequestParam int index){
        employeeData.remove(index);
        return "Employee data removed successfully";
    }
}
