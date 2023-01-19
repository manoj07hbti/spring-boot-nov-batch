package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.service.serviceappflow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Demoappflow {
    @Autowired
    serviceappflow service ;
    @RequestMapping("/app_demo")
    public String demo(){
       // demoserviceflow obj =new demoserviceflow();
        return service.demo();
    }
}
