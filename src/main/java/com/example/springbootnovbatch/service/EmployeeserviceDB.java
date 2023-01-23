package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Employee_Database;
import com.example.springbootnovbatch.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class EmployeeserviceDB {

    @Autowired
    EmployeeRepository repository;

    // Create - add
    public String add(Employee_Database employee_database){

        // call repository class

        repository.save(employee_database); // insert in to the table
        return "Successfully saved to the data base ";

    }

    // Read - get

    public List<Employee_Database> getallemployee (){
        // call repository

        return repository.findAll(); //  Select * from table

    }

    // update - set

    public String update (long id ,String name ){

        // call repository

        //step 1:
       Employee_Database database =  repository.getById(id); // select * from table where id =id

        // step 2:
        database.setName(name);
        repository.save(database); // again saved to the database

        return "Successfully Updated ";// (we can write name , age , dept for output)
    }

    // delete

    public String delete ( long id ){
        // call repository

        repository.deleteById(id);// delete data from the table
        return " Successfully Deleted data from table ";

    }


}
