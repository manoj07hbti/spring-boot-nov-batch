package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.Repository.Repositoryappflow;
import com.example.springbootnovbatch.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceappflow {
    @Autowired
    Repositoryappflow repository;
    public String demo(){
        return repository.demo();
    }

    public String add(Student student) {
        repository.save(student);
        return "successfully added to database";
    }
}
