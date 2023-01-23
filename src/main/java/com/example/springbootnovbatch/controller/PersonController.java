package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Person;
import com.example.springbootnovbatch.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService service;
    // C= Create

    @RequestMapping("/ADD_PERSON")
    public  String add(@RequestBody Person person){

        return service.add(person);

    }
    // R= read & get

    @RequestMapping("/GET_ALL_PERSON")  // 1

    public List<Person> getalldata(){
        return service.getalldata();  // 4
    }


    // U = update name

    @RequestMapping("/UPDATE_PERSON/{ID}/{name}")

    public String update(@PathVariable long ID, @PathVariable String name){
        return service.update(ID,name);

    }

    // D= delete

    @RequestMapping("/DELETE_PERSON")

    public  String delete(@RequestBody long ID){

        return service.delete(ID);
    }

}


