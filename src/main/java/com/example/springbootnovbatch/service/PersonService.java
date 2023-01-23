package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Person;
import com.example.springbootnovbatch.repository.EngineerRepository;
import com.example.springbootnovbatch.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    public String add( Person person){
        repository.save(person);

        return "Successfully added to the engineer list";
    }

    //R= read & get

    public List<Person> getalldata(){

        return repository.findAll();
    }

    // U- update  name

    public String update( long ID,  String name){

        Person person=repository.getById(ID)
                ;
        person.setName(name);
        repository.save(person);
        return "Name successfully updated";
    }

    // D- delete

    public  String delete( long ID){

        repository.deleteById(ID)
        ;

        return "DATA SUCCESSFULLY DELETE";
    }


}

