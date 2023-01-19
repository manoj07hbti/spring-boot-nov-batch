package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Employee2;
import com.example.springbootnovbatch.model.Employee3;
import com.example.springbootnovbatch.repository.EmployeeDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeDBService {

    // We will use @Service annotation above the class due to which this class is known as the Service class
    // @Service annotation is used with classes that provide some business functionalities

    // Note: The service layer will call the Repository layer

    @Autowired
    EmployeeDBRepository employeeDBRepository; // class_name  variable_name or object_name;


    // Syntax for method : access_specifier return_type function or method_name(parameter){code}


     public String add ( Employee3 employee3){

         employeeDBRepository.save(employee3); // object_name.save_method();
                                               // it will insert the data into the database table
        return  " Employee data successfully saved in the database"; // here we will provide the message

    }


    public List<Employee3> getAllEmployee (){


        return employeeDBRepository.findAll(); // select * from table------it will give the data of the entire table


    }




}
