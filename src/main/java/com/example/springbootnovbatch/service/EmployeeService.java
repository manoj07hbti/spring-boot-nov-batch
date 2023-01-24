package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Employee;
import com.example.springbootnovbatch.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.w3c.dom.stylesheets.LinkStyle;
import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;
    public String add(Employee employee){

        // call repository  class

         repository.save(employee); // insert into table

         return "Successfully added the Employee to DB";
    }

    public List<Employee> getAllEmployee(){   //  2

        return repository.findAll();      //  3  made after the method made in controller class

    }

    // U= update

    public String update( long ID,  String name){

        Employee employee=repository.getById(ID);
        employee.setName(name);
        repository.save(employee);
        return "Name updated successfully";
    }

    // D =delete

    public String delete( long ID){  // 2

        repository.deleteById(ID);// delete from table where id=id   // 3

        return "Successfully deleted data";
    }


    // find by name

    public Employee findByName(String name){
        return repository.findByName(name);
    }

    public Employee findByIDAndName(long ID,String name){
        return repository.findByIDAndName(ID,name);
    }


    // find by sql query

    public Employee findBySQL(long ID, String name ){
        return repository.nativesqlquery(ID,name);
    }
}
