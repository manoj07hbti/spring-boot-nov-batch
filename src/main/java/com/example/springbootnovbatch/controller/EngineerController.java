package com.example.springbootnovbatch.controller;


import com.example.springbootnovbatch.model.Engineer;
import com.example.springbootnovbatch.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EngineerController {

    @Autowired
    EngineerService engineerservice;
    // C= Create

    @RequestMapping("/ADD_ENGINEER")
    public  String add(@RequestBody Engineer engineer){

        return engineerservice.add(engineer);

    }
    // R= read & get

    @RequestMapping("/GET_ALL_ENGINEER")  // 1

    public List<Engineer> getalldata(){
        return engineerservice.getalldata();  // 4
    }


    // U = update name

    @RequestMapping("/UPDATE_ENGINEER/{ID}/{name}")

    public String update(@PathVariable long ID,@PathVariable String name){
        return engineerservice.update(ID,name);

    }

    // D= delete

    @RequestMapping("/DELETE_ENGINEER")

    public  String delete(@RequestBody long ID){

        return engineerservice.delete(ID);
    }

}

