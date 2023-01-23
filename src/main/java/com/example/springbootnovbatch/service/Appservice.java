package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.repository.Apprepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Appservice {

    @Autowired
    Apprepository apprepository;

    public String appdemo(){


        //        apprepository obj = new apprepository();

        return apprepository.appdemo();
    }
}
