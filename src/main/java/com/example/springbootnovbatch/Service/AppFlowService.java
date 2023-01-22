package com.example.springbootnovbatch.Service;


import com.example.springbootnovbatch.Repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AppFlowService {
@Autowired
    AppFlowRepository repository;


  public  String demo() {

        return  repository.demo();

    }
}
