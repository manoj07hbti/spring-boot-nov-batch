package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Employee_Database;
import com.example.springbootnovbatch.service.EmployeeserviceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeControllerDB {

    // Crud Operation for insert data in database --


    @Autowired
    EmployeeserviceDB service;

    //Create-- add
    @RequestMapping("/addemployeedb")
    public String add(@RequestBody Employee_Database database){

        // call service class
      return service.add(database);

      //  http://localhost:8082/addemployeedb
    }
    //Read- get
     @RequestMapping("/getallemployeedb")
    public List<Employee_Database> getallemployee(){
        // call service class

        return service.getallemployee();
       // http://localhost:8082/getallemployeedb
    }

    // update - set
    @RequestMapping("/updateemployee/{id}/{name}")
    public String update (@PathVariable long id ,@PathVariable String name  ){

        return service.update(id,name);

        // http://localhost:8082?updateemployee/1/sanjeev/CS/25
    }

    // Delete
    @RequestMapping("/deleteemployeedb")
    public String delete (@RequestParam long id ){
        // call service
        return service.delete(id);

        // http://localhost8082/delteemployeedb?id=1

    }
}
