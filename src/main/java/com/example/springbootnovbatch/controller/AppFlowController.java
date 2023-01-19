package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {

    @Autowired
    AppFlowService service;
    @RequestMapping("/app_flow")
    public String appflow(){

        return service.appflow();
    }
}
