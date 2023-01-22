package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Engineer;
import com.example.springbootnovbatch.service.EngineerDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EngineerDBController {
    @Autowired
    EngineerDBService service;

    // Create section
    @RequestMapping("/addengdata")
    public String  addenggdata(@RequestBody Engineer engineer){
        return service.addenggdata(engineer);
    }

    // Read Section
    @RequestMapping("/getengdata")
    public List<Engineer> getengdata(){
        return service.getengdata();
    }

    // Update name section
    @RequestMapping("/updateengname/{engineerid}/{name}")
    public String updateengname(@PathVariable long engineerid, @PathVariable String name){
        return service.updateengname(engineerid, name);
    }
    // Update age section
    @RequestMapping("/updateengage/{engineerid}/{age}")
    public String updateengage(@PathVariable long endineerid,@PathVariable int age){
        return service.updateengage(endineerid, age);
    }

    // Delete Section
    @RequestMapping("/deleteengdata/{engineerid}")
    public String deleteengdata(@PathVariable long engineerid){
        return service.deletengdata(engineerid);
    }
}
