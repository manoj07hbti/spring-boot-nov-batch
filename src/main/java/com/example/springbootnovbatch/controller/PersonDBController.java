package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Person;
import com.example.springbootnovbatch.service.PersonDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonDBController {




   @Autowired
   PersonDBService personDBService; // class_name variable_name or object_name;



    // C ---- Create or add the data

   @RequestMapping("/add_person_db") // endpoint
   public String add(@RequestBody Person person){

     return   personDBService.add(person);



   }


   // R----- Read or get the all data
   @RequestMapping("/get_all_person_db") // endpoint
    public List<Person> getAllPerson(){


     return personDBService.getAllPerson();


    }



    // U -----Update the data in the database table at the given id

   @RequestMapping("/update_person_db/{id}/{name}") // endpoint
   public String update(@PathVariable Long id, @PathVariable String name){

      return  personDBService.update(id, name);


   }


    // D-----Delete the data from the database table at the given id

   @RequestMapping("/delete_person_db") //endpoint
    public String delete (@RequestParam Long id){


       return personDBService.delete(id);



   }



}
