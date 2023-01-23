package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Postman;
import com.example.springbootnovbatch.repository.PostmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PostmanService {

    // Create a Table with the help of CRUD Operations ---

    // Create

    @Autowired
    PostmanRepository repository;

    public String add(Postman postman){
        // call repository
        repository.save(postman);
        return " Data Successfully Added ";

    }

    // read - get

    public List<Postman> getallpostman(){
        // call repository class
        return  repository.findAll();  // Select * from table

    }

    // update - set

    public String updatepostman (long id , String name, BigDecimal salary, int age ){
        // Call repository  class
        // Step 1:
        Postman postman = repository.getById(id);
        //Step 2:
        postman.setName(name);
        postman.setSalary(salary);
        postman.setAge(age);
        return " Update Successfully "+ name +" , "+ salary+" , "+age;

    }

    // delete

    public String deletepostman(long id){
        // Call repository  class

        repository.deleteById(id);  // delete from the table id = id
        return " Deleted Successfully ";

    }
}
