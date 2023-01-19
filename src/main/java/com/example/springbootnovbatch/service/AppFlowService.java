package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFlowService {

    @Autowired
    AppFlowRepository repsitory;
    public String appflow(){

        return repsitory.appflow();
    }
}
