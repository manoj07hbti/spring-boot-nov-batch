package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.service.AppFLowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {

    @Autowired
    AppFLowService service;


    @RequestMapping("/app_flow")
    public String demo(){

       // AppFLowService obj= new AppFLowService();

       return service.demo();


    }

}
