package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Student;
import com.example.springbootnovbatch.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class StudentService {

    // Create A table by the hel od CRUD operations

    // Create - add

    @Autowired
    StudentRepository repository;

    public String addstudent (Student student){
        // Call repository Class

        repository.save(student);
        return "Added Successfully ";
    }

    // read - get

    public List<Student> getallstudent(){
        // Call repository class

        return repository.findAll();
    }

    // update - set

    public String updatestudent(long id , String name ,int age ){
        // Call repository class
        //Step 1:
        Student student = repository.getById(id);
        // Step 2:
        student.setName(name);
        student.setAge(age);

        return "Update Successfully "+ name +" , "+ age;

    }

    // delete

    public String deletestudent (long id ){
        // Call repository Class
        repository.deleteById(id);
        return " Deleted Successfully ";

    }

    // Find By name

    public Student findbyname(String name ){
        // Call repository Class
        return  repository.findByName(name);


    }

    // Find BY name and Id

    public Student findbynameandid(String name , long id){
        // Call repository Class
        return repository.findByNameAndId(name, id);
    }
}

