package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Teacher;
import com.example.springbootnovbatch.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    //  // Crud Operation for insert data in database --

    // Create- add
    @Autowired
    TeacherRepository repository;

    public String add (Teacher teacher){

        // call repository class
        repository.save(teacher); // insert in to table
        return "Successfully saved to the data base ";

    }

    // read -- get

    public List<Teacher> getallteacher (){
        // call repository

        return repository.findAll(); // Select * from table

    }

    // update- set

    public String update (long id , String name , String subject, String school){

        // call repository  class

        // step 1:
        Teacher teacher = repository.getById(id);// select * from database where id = id

        // step 2:
        teacher.setName(name);
        teacher.setSubject(subject);
        teacher.setSchool(school);
        repository.save(teacher);

        return " Successfully updated "+ name+" , "+ subject+" , "+ school;
    }



}
