package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Cycle;
import com.example.springbootnovbatch.model.Employee;
import com.example.springbootnovbatch.repository.CycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CycleService {


    @Autowired
    CycleRepository repository;

    public String bicycle(@RequestBody Cycle cycle) {

        repository.save(cycle);

        return "Successfully added name of cycle to data base";
    }

    public List<Cycle> getAllcycle() {   //  2

        return repository.findAll();     //  3  made after the method made in controller class

    }

    // U= update

    public String update( long ID, String name ){

        Cycle cycle=repository.getById(ID);
        cycle.setName(name);
        repository.save(cycle);
        return "successfully updated cycle name";
    }

    // D= DELETE

     public String delete(long ID){

        repository.deleteById(ID);
        return "DATA OF THE CYCLE SUCCESSFULLY DELETED";
     }


}
