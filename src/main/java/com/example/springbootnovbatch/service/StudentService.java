package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Student;
import com.example.springbootnovbatch.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public String add(Student student){
        //call service class

        repository.save(student); // insert into table()
        return "Successfully saved to Database";
    }

    public List<Student> getAllStudents(){

        return repository.findAll();// select * from table
    }
}
