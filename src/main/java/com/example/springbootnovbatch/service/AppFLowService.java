package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.repository.AppFloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFLowService {

    @Autowired
    AppFloRepository repository;

    public String demo(){

        return repository.demo();

    }
}
