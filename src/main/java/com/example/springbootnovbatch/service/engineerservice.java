package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.Repository.engineerrepository;
import com.example.springbootnovbatch.model.Engineer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class engineerservice {
    @Autowired
    engineerrepository repository;
    public String add(Engineer engineer){
        repository.save(engineer);
        return "successfully added ";
    }
    public List<Engineer>getalllist(){
    return     repository.findAll();
    }
    public String update(long id,String name){
        Engineer engineer=repository.getById(id);
        engineer.setName(name);
        repository.save(engineer);
        return "successfuly updated ";
    }
    public String delete(long id){
        repository.deleteById(id);
        return "successfully deleted ";
    }

}
