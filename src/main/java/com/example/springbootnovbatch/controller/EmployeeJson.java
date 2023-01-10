package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.Model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeJson {

    ArrayList<Employee> EmployeeArrayList = new ArrayList<>();

    @RequestMapping("/empl")
    public String addEmployee(@RequestBody Employee employee) {

        EmployeeArrayList.add(employee);

        return "employee added successfully ";      // localhost:8085/empl


        // create
    }
        @RequestMapping("/employee/{name}/{company}/{salary}")
        public String employee (@PathVariable String name, @PathVariable String company ,@PathVariable int salary){
            Employee employee = new Employee(name, company, salary);
            EmployeeArrayList.add(employee);
            return " it created successfully ";         // localhost:8085/employee/raj/dell/55000

        }
        // read or get
        @RequestMapping("/get_all_Employeedata")
        public ArrayList<Employee> getEmployeeArrayList () {
            return EmployeeArrayList;
                                                        // localhost:8085/get_all_Employeedata
        }

        // update
        @RequestMapping("/updated/{name}/{index}")
        public String update (@PathVariable String name,@PathVariable int index ){

            //Step 1
            Employee employee = EmployeeArrayList.get(index);

            //step 2
            employee.setName(name);

            return "it update successfully";
                                                           // localhost:8085/updated/name/index


        }
        // delete
        @RequestMapping("/deleted")
        public String deleted ( @PathVariable int index){
            EmployeeArrayList.remove(index);
            return " it deleted successfully";
                                                       // localhost:8085/deleted/0
       }
    }
