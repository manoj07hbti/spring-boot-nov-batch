package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFlowServive {

    @Autowired
    AppFlowRepository repository;
    public String demo_varun() {

       // return "This is from service class";

        return repository.demo_varun();
    }
}
