package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.Repository.StudentRepository;
import com.example.springbootnovbatch.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentdbservice  {
    @Autowired
    StudentRepository repository;
    public String add(Student student) {
        repository.save(student);
        return "successfully saved to database ";
    }
    public List<Student>getallstudent(){
        return repository.findAll();
    }
}
