package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Employee4;
import com.example.springbootnovbatch.service.Employee4DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employee4DBController {

    // We will make CRUD API
    // Syntax for method : access_specifier return_type function or method_name (parameter){code}


    // Note: Controller layer will call the Service layer

     @Autowired // it is used to call method
    Employee4DBService employee4DBService; // class_name variable_name or object_name;






    // C-----Create or add the resources in the database table-----POST HTTP METHOD
    @RequestMapping("/add_emp4_db") // endpoint
    public String add (@RequestBody Employee4 employee4){


       return employee4DBService.add(employee4);

    }


    // R-----Read or get the all data from the database table

    @RequestMapping("/get_all_emp4_db")
    public List<Employee4> getAllEmployee4 (){

      return   employee4DBService.getAllEmployee4();


    }




    // U------Update the data in the database table at the given id
    @RequestMapping("/update_emp4_db/{id}/{name}")
    public String update (@PathVariable Long id, @PathVariable String name){


        return employee4DBService.update(id, name);

    }



   // D-----Delete the data from the database table at the given id


    @RequestMapping("/delete_emp4_db")
    public String delete (@RequestParam Long id){

        return employee4DBService.delete(id);


    }


    // Find the Employee by name

    @RequestMapping("/find_by_name_emp4_db/{name}")
    public Employee4 findByName(@PathVariable String name){

           return employee4DBService.findByName(name);


    }


    // Find the Employee by id and name

    @RequestMapping("/find_by_id_name_emp4_db/{id}/{name}")
    public Employee4 findByIdAndName(@PathVariable Long id,@PathVariable String name){


       return   employee4DBService.findByIdAndName(id, name);


    }


    // Find the Employee by city

    @RequestMapping("/find_by_city_emp4_db/{city}")
    public Employee4 findByCity( @PathVariable String city){

        return employee4DBService.findByCity(city);



    }

    // Find the Employee by department

    @RequestMapping("/find_by_department_emp4_db/{department}")
    public Employee4 findByDepartment( @PathVariable String department){

        return employee4DBService.findByDepartment(department);



    }


    // Find the Employee by id,name and city

    @RequestMapping("/find_by_emp4_db")
    public Employee4 findByIdNameCity (@RequestParam Long id, @RequestParam String name ,@RequestParam String city){


        return employee4DBService.findByIdAndNameAndCity(id, name, city);

    }


    // Find the Employee by SQL query---id,name

    @RequestMapping("/find_by_sql_emp4_db/{id}/{name}")
    public Employee4 findBySQL (@PathVariable long id ,@PathVariable String name){

      return employee4DBService.findBySQL(id, name);

    }


    // Find the Employee by SQL query---city,department

    @RequestMapping("/find_by_sql1_emp4_db/{city}/{age}")
    public Employee4 findBySQL1 (@PathVariable String city,@PathVariable int age){

        return employee4DBService.findBySQL1(city, age);

    }






}
