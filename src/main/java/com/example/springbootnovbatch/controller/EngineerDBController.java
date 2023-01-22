package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.Model.Engineer;
import com.example.springbootnovbatch.Service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EngineerDBController {
    @Autowired
    EngineerService service;

   // create
    @RequestMapping("/add_engineer_db")
    public String add(@RequestBody Engineer engineer){
        return service. add(engineer) ;
    }

    // read
    @RequestMapping("/read_db")
    public List<Engineer> getAllEngineer(){
        return service.getAllEngineer ();
    }
    // update

    @RequestMapping("/updated_engineer_db/{id}/{name}")
    public String update(@PathVariable long id ,@PathVariable String name ){
        return service.update(id ,name);
    }
    // delete
    @RequestMapping("/deleted_db/{id}")
    public String delete(@PathVariable long id){
        return service.delete(id) ;
    }
}
