package com.example.springbootnovbatch.controller;


import com.example.springbootnovbatch.Model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
    public class CrudEmployee {

        ArrayList<Employee> EmployeeArrayList= new ArrayList<>();

        // create

        @RequestMapping("/employ/{name}/{company}/{salary}")
        public  String employee (@PathVariable String name, @PathVariable String company , @PathVariable int salary){
            Employee employee = new Employee(name ,company,salary);
            EmployeeArrayList.add (employee);
            return " it created successfully "  ;
        }
        // read or get
        @RequestMapping("/get_all_Employdata")
        public ArrayList <Employee>getEmployeeArrayList(){
            return EmployeeArrayList;

        }

        // update
        @RequestMapping("/updates/{name}/{index}")
        public  String update( @PathVariable String name, @PathVariable int index ){

             //Step 1
        Employee employee= EmployeeArrayList.get(index);

            //step 2
            employee.setName(name);

            return "it update successfully";



        }
        // delete
        @RequestMapping("/deletedemploy")
        public String deleted(@PathVariable int index){
            EmployeeArrayList.remove (index);
            return " it deleted successfully";

        }
    }


