package com.example.springbootnovbatch.controller;


import com.example.springbootnovbatch.model.Engineer1;
import com.example.springbootnovbatch.service.Engineer1DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Engineer1DBController {

    @Autowired
    Engineer1DBService engineer1DBService; // class_name variable_name;

    // C---create or add the data
    @RequestMapping("/add_eng1_db")
    public String add (@RequestBody Engineer1 engineer1){

        return engineer1DBService.add(engineer1);


    }


    // R----Read or get the all data


    @RequestMapping("/get_all_eng1_db")
    public List<Engineer1> getAllEngineer1(){

      return   engineer1DBService.getAllEngineer1();

    }



     // U---update the data in the database table at the given id


    @RequestMapping("/update_eng1_db/{id}/{name}")
    public String update (@PathVariable Long id , @PathVariable String name){

      return engineer1DBService.update(id, name);

    }



    // D----delete the data from the database table at the given id

    @RequestMapping("/delete_eng1_db")
    public String delete (@RequestParam Long id){

       return engineer1DBService.delete(id);


    }



}
