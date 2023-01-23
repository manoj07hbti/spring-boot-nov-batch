package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.service.AppFlowServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;

@RestController
public class AppFlowController {

    @Autowired
    AppFlowServive service;

    @RequestMapping("/DEMO_appflow")    //http://localhost:8081/DEMO_appflow
    public String demo_varun() {

      //  AppFlowController obj = new AppFlowController();   OBJ MAKING IN JAVA



        return service.demo_varun();
    }
}
