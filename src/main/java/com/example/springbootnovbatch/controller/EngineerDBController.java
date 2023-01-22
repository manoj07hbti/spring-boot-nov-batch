package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Engineer;
import com.example.springbootnovbatch.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EngineerDBController {

    @Autowired
    EngineerService service;

    // C
    @RequestMapping("/Add_Engineer")
    public String add(@RequestBody Engineer engineer) {
        // call service class
        return service.add(engineer);
    }

    // R
    @RequestMapping("/Get_Engineer")
    public List<Engineer> getAllEngineer() {

        return service.getAllEngineers();
    }

    // U
    @RequestMapping("/Update_Engineer/{id}/{name}")
    public String update(@PathVariable long id, @PathVariable String name) {

        return service.update(id, name);
    }

    // D
    @RequestMapping("Delete_Engineer")
    public String delete(@RequestParam long id) {

        return service.delete(id);
    }
}
