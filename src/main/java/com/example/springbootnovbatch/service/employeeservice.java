package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.Repository.employeerepository;
import com.example.springbootnovbatch.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeservice {
    @Autowired
    employeerepository repository;
    public String add(Employee employee){

        repository.save(employee);
        return "employee successfully added ";
    }
    public List<Employee>getallemployee(){
        return repository.findAll();
    }
}
