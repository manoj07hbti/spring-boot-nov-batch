package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Person;
import com.example.springbootnovbatch.repository.PersonDBRepository;
import com.example.springbootnovbatch.service.PersonDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonDBController {
    @Autowired
    PersonDBService service;
    @Autowired
    private PersonDBRepository personDBRepository;

    // Create Section
    @RequestMapping("/addpersondata")
    public String addperson(@RequestBody Person person){
        return service.addperson(person);
    }

    // Read Section
    @RequestMapping("/getpersondata")
    public List<Person> getperson(){
        return service.getperson();
    }

    // Update name section
    @RequestMapping("/updatepersonname/{personid}/{name}")
    public String updatepername(@PathVariable long personid, @PathVariable String name){
        return service.updatepername(personid, name);
    }

    // Update Age section
    @RequestMapping("/updatepersonage/{personid}/{age}")
    public String updateperage(@PathVariable long personid,@PathVariable  int age){

        return service.updateperage(personid, age);
    }

    // Update city section
    @RequestMapping("/updatepersoncity/{personid}/{city}")
    public String updatepercity(@PathVariable long personid,@PathVariable  String city){

        return service.updatepercity(personid, city);
    }

    // Delete Section
    @RequestMapping("/deleteperson/{personid}")
    public String deteleperson(@PathVariable long personid){

        return service.deteleperson(personid);
    }
}
