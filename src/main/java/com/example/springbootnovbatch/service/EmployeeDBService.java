package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Employee;
import com.example.springbootnovbatch.repository.EmployeeDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class EmployeeDBService {

    // Method to add data
    @Autowired
    EmployeeDBRepository repository;
    public String addempdata(Employee employee){
        repository.save(employee);
        return "Data added Successfully in Database ";
    }

    // Access all data

    public List<Employee> getalldata(){
        return repository.findAll();
    }
}
