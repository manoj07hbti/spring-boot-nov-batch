package com.example.springbootnovbatch.service;


import com.example.springbootnovbatch.model.Engineer1;
import com.example.springbootnovbatch.repository.Engineer1DBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class Engineer1DBService {


    @Autowired
    Engineer1DBRepository engineer1DBRepository;



    public String add ( Engineer1 engineer1){

        engineer1DBRepository.save(engineer1);

        return " Data is saved successfully in the database table";

    }


    public List<Engineer1> getAllEngineer1(){

        return  engineer1DBRepository.findAll();


    }



    public String update (Long id ,String name){

        // Step1: Find the record from the database table which we want to update

         Engineer1 engineer1 = engineer1DBRepository.getById(id);

       // Step2 : using setter method to set the name and save it again in the database table

       engineer1.setName(name);

        engineer1DBRepository.save(engineer1);

      return " Engineer data is update successfully at given id"+ " Id is :"+id + " Name is :"+name;

    }


    public String delete ( Long id){

      engineer1DBRepository.deleteById(id);


      return  " Engineer data is deleted successfully from the database table"+ " Id is :"+id;

    }





}
