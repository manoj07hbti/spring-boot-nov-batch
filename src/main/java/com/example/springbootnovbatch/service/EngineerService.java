package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Engineer;
import com.example.springbootnovbatch.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class EngineerService {

    // Create a table by  CRUD operations --

    // Create - add
    @Autowired
    EngineerRepository repository;

    public String add (Engineer engineer ){
        // call repository class

        repository.save(engineer);
        return " Successfully added to the database ";
    }

    // Read - get

    public List<Engineer> getallengineer (){
        // call repository class

        return repository.findAll(); // Select * from table
    }

    // Update - set

    public String update (long id , String name , BigDecimal salary ){
        // call repository class

        // Step 1:
        Engineer engineer = repository.getById(id);

        // Step 2:
        engineer.setName(name);
        engineer.setSalary(salary);
        repository.save(engineer); // again saved to the database

        return " update Successfully "+ name + " , "+ salary;
    }

    // delete

    public String delete (long id){
        // call repository class

        repository.deleteById(id); // delete from the table id = id
        return " Deleted Successfully ";

    }
}
