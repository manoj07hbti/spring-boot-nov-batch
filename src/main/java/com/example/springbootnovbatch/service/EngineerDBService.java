package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Engineer;
import com.example.springbootnovbatch.repository.EngineerDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineerDBService {
    @Autowired
    EngineerDBRepository repository;
    // Create section
    public String  addenggdata(Engineer engineer){
        repository.save(engineer);
        return "Engineer data added successfully";
    }
    // Read section
    public List<Engineer> getengdata(){
        return repository.findAll();
    }
    // Update name section
    public String updateengname(long engineerid, String name){
        Engineer engineer = repository.getById(engineerid);
        engineer.setName(name);
        repository.save(engineer);
        return "Engineer name updated successfully";
    }
    // Update Age section
    public String updateengage(long engineerid, int age){
        Engineer engineer = repository.getById(engineerid);
        engineer.setAge(age);
        repository.save(engineer);
        return "Engineer Age Updated Successfully";
    }
    // Delete Section
    public String deletengdata(long engineerid){
         repository.deleteById(engineerid);
         return "Engineer data deleted successfully";
    }

    // find by name
    public Engineer findbyname(String name){
        return repository.findByName(name);
    }

    // find by id and name
    public Engineer findbyidandname (long engineerid, String name){
        return repository.findByEngineeridAndName(engineerid, name);
    }

    // find by sql
    public Engineer findbySQL(long engineerid, String name){
        return repository.nativeSQLQuery(engineerid, name);
    }
}
