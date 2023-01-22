package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Engineer;
import com.example.springbootnovbatch.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineerService {

    @Autowired
    EngineerRepository repository;
    public String add(Engineer engineer) {
        // call service class

        repository.save(engineer);  //  insert into table()
        return "Successfully saved to database";
    }

    public List<Engineer> getAllEngineers() {
        return repository.findAll();
    }

    // for update
    public String update(long id , String name) {
        // id
       Engineer engineer =  repository.getById(id);
       // name
        engineer.setName(name);
        repository.save(engineer);

        return "Successfully update";
    }

    // For Delete
    public String delete (long id) {
        repository.deleteById(id);
        return "Delete DATA Successfully";
    }
}
