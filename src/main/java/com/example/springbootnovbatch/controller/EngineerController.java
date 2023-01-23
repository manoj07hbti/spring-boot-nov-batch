package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Engineer;
import com.example.springbootnovbatch.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class EngineerController {


    // Create a table by CRUD operation

    // Create - add
    @Autowired
    EngineerService service;
    @RequestMapping("/addengineer")
    public String add (@RequestBody Engineer engineer ){
        // call service class

        return service.add(engineer);

        // http://localhost:8082/addengineer
    }

    // read - get
    @RequestMapping("/getallengineer")
    public List<Engineer> getallengineer (){

        return service.getallengineer();
        // http://localhost:8082/getallengineer
    }
    // Update - set
    @RequestMapping("/updateengineer/{id}/{name}/{salary}")
    public String update (@PathVariable long id ,@PathVariable String name
            ,@PathVariable BigDecimal salary ){

        return service.update(id, name, salary);
        // http://localhost:8082/updateallengineer/42/Sandeep/222.345
    }

    // Delete -
    @RequestMapping("/deleteengineer/{id}")
    public String delete (@PathVariable long id){
        // call service
        return service.delete(id);
        // http://localhost:8082/deleteengineer/1
    }
}
