package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Postman;
import com.example.springbootnovbatch.service.PostmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class PostmanController {

    // Create a Table with the help of CRUD Operations ---

    // Create

    @Autowired
    PostmanService service;
    @RequestMapping("/addpostman")
    public String add(@RequestBody Postman postman){
        // call service class
        return service.add(postman);

        // http://localhost:8082/addpostman
    }

    // read - get
    @RequestMapping("/getallpostman")
    public List<Postman> getallpostman(){
        // call service class
        return service.getallpostman();
        //  http://localhost:8082/getallpostman
    }

    // Update - set
    @RequestMapping("/updatepostman/{id}/{name}/{salary}/{age}")
    public String updatepostman (@PathVariable long id ,@PathVariable String name
            ,@PathVariable BigDecimal salary,@PathVariable int age ){
        // call Service Class

        return service.updatepostman(id, name, salary, age);
        // http://localhost:8082/updatepostman/1/Sandeep/333.44/24
    }

    // Delete
    @RequestMapping("/deletepostman/{id}")
    public String deletepostman(@PathVariable long id){
        //call service class
        return service.deletepostman(id);

        // http://localhost:8082/deletepostman/2
    }
}
