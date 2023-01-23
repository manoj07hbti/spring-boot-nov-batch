package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Employee4;
import com.example.springbootnovbatch.repository.Employee4DBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Service
public class Employee4DBService {


    // Note : Service layer will call the Repository layer


    @Autowired
    Employee4DBRepository employee4DBRepository;




    public String add ( Employee4 employee4){

     employee4DBRepository.save(employee4);

    return  "Employee data is saved successfully in the database table";


    }


    public List <Employee4> getAllEmployee4 (){

      return employee4DBRepository.findAll();


    }



    public String update ( Long id, String name){

    // Step1 : Find the record from the database table which we want to update-----for it will use getById() method
       Employee4 employee4 = employee4DBRepository.getById(id);

    // Step2 : Using Setter method to set or change the name and save it again in the repository

       employee4.setName(name);

       employee4DBRepository.save(employee4);

     return  " Employee data is update successfully in the database table"+ " Id is :" +id +"  Name is :"+name;

    }


    public String delete (Long id){

        employee4DBRepository.deleteById(id);


    return  " Employee data is deleted successfully from the database table at the given id "+ " Id is : "+id;

    }



    public Employee4 findByName( String name){

         return   employee4DBRepository.findByName(name);


    }



    public Employee4 findByIdAndName( Long id, String name){


       return   employee4DBRepository.findByIdAndName(id, name);


    }



    public Employee4 findByCity(  String city){

         return employee4DBRepository.findByCity(city);




    }




    public Employee4 findByDepartment(  String department){

        return employee4DBRepository.findByDepartment(department);



    }


    public Employee4 findByIdAndNameAndCity (Long id,String name,String city){

         return employee4DBRepository.findByIdAndNameAndCity(id, name, city);


    }



    public Employee4 findBySQL ( long id , String name){


        return employee4DBRepository.nativeSQLQuery(id, name);


    }



    public Employee4 findBySQL1 (String city, int age){

     return employee4DBRepository.nativeSQLQuery1(city, age);

    }








}
