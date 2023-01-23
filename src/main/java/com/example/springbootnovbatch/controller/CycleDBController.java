package com.example.springbootnovbatch.controller;


import com.example.springbootnovbatch.model.Cycle;
import com.example.springbootnovbatch.model.Employee;
import com.example.springbootnovbatch.service.CycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CycleDBController {



    @Autowired
    CycleService service;

    // C= create


    @RequestMapping("/ADD_CYCLE_DB")
    public String bicycle(@RequestBody Cycle cycle){

        return service.bicycle(cycle);
    }
    //R- READ & GET

    @RequestMapping("/GET_ALL_CYCLE_DB")

    public List<Cycle>getallcycle(){      // 1

        return service.getAllcycle();   //  4 only if service class has its operataion first
    }

    // U - UPDATE

    @RequestMapping("/UPDATE_CYCLE_DB/{ID}/{name}")  //http://localhost:8081/UPDATE_CYCLE_DB/1/AVON

    public String update(@PathVariable long ID,@PathVariable String name){

        return service.update(ID,name);
    }

    //D= DELETE

    @RequestMapping("/DELETE_CYCLE_DB")  //http://localhost:8081/DELETE_CYCLE_DB?ID=3

    public String delete(@RequestBody long ID){

        return service.delete(ID);
    }
}
