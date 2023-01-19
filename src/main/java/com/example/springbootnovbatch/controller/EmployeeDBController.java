package com.example.springbootnovbatch.controller;



import com.example.springbootnovbatch.model.Employee3;
import com.example.springbootnovbatch.service.EmployeeDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeDBController {


      // Note: When we are using Spring Framework then we will call the method through Auto wiring
      // Auto_wiring : it's a way by which we can inject dependency(creation of object) programmatically anywhere
      // So we will use @ Autowired annotation for this
      // Syntax to call the method: @Autowired
                                    // class_name  variable_name;

      // Note: The controller layer will call the Service layer


      @Autowired
      EmployeeDBService employeeDBService;  // class_name  variable_name or object_name;



      // Syntax for method : access_specifier return_type function or method_name(parameter){code}
      // We will use CRUD Operation to make the CRUD API
      // The endpoint will make only in the controller class
      // We will make the endpoint through @RequestMapping("/endpoint_name") annotation
      // Non-Primitive Data Types: These data types are not actually defined by the programming language
      // but are created by the programmer. They are also called “reference variables” or “object references”
      // Data Type----- Employee2 ,variable_name -----employee2



    // C---Create or add the resources in the database table

     @RequestMapping("/add_employee_db1") // endpoint
       public String add (@RequestBody Employee3 employee3){

        return employeeDBService.add(employee3); // object_name.add_method(); -------object_name.add(value);

    }


    // R----Read or get the all data from the database table
    @RequestMapping("/get_all_employee_db1") // endpoint
    public List<Employee3> getAllEmployee (){

         return employeeDBService.getAllEmployee();


    }






}
