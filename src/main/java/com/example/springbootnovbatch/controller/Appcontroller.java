package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.service.Appservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Appcontroller {

    // we use @autowired annotation in springboot-- to make an object

    @Autowired
    Appservice appservice;

    @RequestMapping("/app")
    public String appdemo(){

        // TODO we do not use this type of java code in spring boot ----
              //        Appservice obj = new Appservice();

        // then we return with the appservice.appdemo();

        return appservice.appdemo();
    }
}
