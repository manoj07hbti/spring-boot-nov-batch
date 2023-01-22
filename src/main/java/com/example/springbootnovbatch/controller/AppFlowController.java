package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.Service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

   @RestController
   public class AppFlowController {

      @Autowired
     AppFlowService Service;

    @RequestMapping("/app_flow")            // localhost:8085/app_flow

    public String  demo(){

        return Service.demo();
    }

}
