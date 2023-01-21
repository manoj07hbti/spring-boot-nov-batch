package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Person;
import com.example.springbootnovbatch.repository.PersonDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class PersonDBService {


    @Autowired
    PersonDBRepository personDBRepository;



    public String add( Person person){

        personDBRepository.save(person);


        return " Person data is saved successfully in the database table";

    }



    public List<Person> getAllPerson(){

     return   personDBRepository.findAll();



    }


    public String update( Long id, String name){

        // Step1: Find the record from the database table which we want to update

            Person person = personDBRepository.getById(id);

        // Step2 : using setter method to set the name and save it again in the database table

        person.setName(name);

        personDBRepository.save(person);


       return  " Person data is updated successfully in the database table"+" Id is :"+id +" Name is :"+name;


    }



      public String delete ( Long id){


       personDBRepository.deleteById(id);

      return " Person data is deleted successfully from the database table at the given id "+" Id is :" +id;


    }




}
