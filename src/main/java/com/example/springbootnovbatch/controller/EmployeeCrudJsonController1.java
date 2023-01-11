package com.example.springbootnovbatch.controller;


import com.example.springbootnovbatch.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCrudJsonController1 {


    ArrayList<Employee> employeeArrayList  = new ArrayList<>();

    // C ---create or add ----endpoint ---- Post HTTP Method
    // URL : localhost:8081/add_employee_json1

    @RequestMapping("/add_employee_json1") // endpoint
    public String addEmployee (@RequestBody Employee employee){
        employeeArrayList.add(employee);
        return  "  Employee added successfully  :";

    }

    // R----Read or Get-----endpoint---GET HTTP Method
    // URL :localhost:8081/get_all_employee_json1
    

    @RequestMapping("/get_all_employee_json1") // endpoint
    public ArrayList<Employee> getEmployeeArrayList(){

        return employeeArrayList;
    }


    // U----Update----endpoint----PUT HTTP Method
    // URL : localhost:8081/update_employee_json1/Ajay kumar/0

    @RequestMapping("/update_employee_json1/{name}/{index}")
    public String updateEmployee(@PathVariable String name, @PathVariable int index){

        Employee employee = employeeArrayList.get(index);
        employee.setName(name);
        return "Employee Updated Successfully :" + "  Name is :" +name + "  At index : " +index;

    }

    // D----Delete----endpoint------DELETE HTTP Method
    // URL : localhost:8081/delete_employee_json1?index=1

    @RequestMapping("/delete_employee_json1") // endpoint
    public String deleteEmployee(@RequestParam int index){

        employeeArrayList.remove(index);  // object_name.remove_method();

        return " Employee Deleted Successfully :"+ " At index :" +index;
    }


}
