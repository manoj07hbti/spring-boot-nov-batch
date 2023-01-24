package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Engineer;
import com.example.springbootnovbatch.service.engineerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;

@RestController
public class engineercontroller {
    @Autowired
    engineerservice service;

    @RequestMapping("/engineer_db")
    public String add(@RequestBody Engineer engineer) {
        return service.add(engineer);
    }

    @RequestMapping("/getengineer_db")
    public List<Engineer> getalllist() {
        return service.getalllist();

    }

    @RequestMapping("/updateemployee_db")
    public String update(@PathVariable long id, @PathVariable String name) {
        String update = service.update(id, name);
        return update;


    }
    @RequestMapping("deleteengineer_db")
    public  String delete(@RequestParam long id){
        return service.delete(id);
    }
    @RequestMapping("/findby_db/{name}")
    public Engineer FindByName(@PathVariable String name){
        return service.FindByName(name);
    }
    @RequestMapping("/findbyidname_db/{id}/{name}")
    public Engineer FindByidName(@PathVariable long id,@PathVariable String name){
        return service.FindByidName(id,name);
    }
    @RequestMapping("/findby_db/{id}/{name}")
    public Engineer findBySql(@PathVariable long id,@PathVariable String name){
        return service.findBySql(id,name);
    }
}