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

    public String add( Engineer engineer){
        repository.save(engineer);

        return "Successfully added to the engineer list";
    }

    //R= read & get

    public List<Engineer> getalldata(){

        return repository.findAll();
    }

    // U- update  name

    public String update( long ID,  String name){

        Engineer engineer=repository.getById(ID)
                ;
        engineer.setName(name);
        repository.save(engineer);
        return "Name successfully updated";
    }

    // D- delete

    public  String delete( long ID){

        repository.deleteById(ID)
        ;

        return "DATA SUCCESSFULLY DELETE";
    }


}

