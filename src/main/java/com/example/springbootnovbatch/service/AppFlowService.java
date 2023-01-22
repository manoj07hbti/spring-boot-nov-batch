package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class AppFlowService {

    @Autowired
    AppFlowRepository repository;
    public String demo() {
        return repository.demo();
    }
}
