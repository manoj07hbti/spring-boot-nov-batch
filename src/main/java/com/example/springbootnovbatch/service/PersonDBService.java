package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Person;
import com.example.springbootnovbatch.repository.PersonDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonDBService {
    @Autowired
    PersonDBRepository repository;

    // Create Section
    public String addperson(Person person){
        repository.save(person);
        return "Person data added successfully";
    }

    // Read section
    public List<Person> getperson(){
        return  repository.findAll();
    }

    // Update name section
    public String updatepername(long personid, String name){
        Person person = repository.getById(personid);
        person.setName(name);
        repository.save(person);
        return "Person name updated successfully";
    }

    // Update Age section
    public String updateperage(long personid, int age){
        Person person = repository.getById(personid);
        person.setAge(age);
        repository.save(person);
        return "Updated age successfully";
    }

    // Update city section
    public String updatepercity(long personid, String city){
        Person person = repository.getById(personid);
        person.setCity(city);
        repository.save(person);
        return "Person City Updated Successfully";
    }

    // Delete Section
    public String deteleperson(long personid){
        repository.deleteById(personid);
        return "Person data deleted successfully";
    }
}
