package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Employee;
import com.example.springbootnovbatch.repository.EmployeeDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class EmployeeDBService {

    // Method to add data
    @Autowired
    EmployeeDBRepository repository;
    public String addempdata(Employee employee){
        repository.save(employee);
        return "Data added Successfully in Database ";
    }

    // Access all data

    public List<Employee> getalldata(){
        return repository.findAll();
    }

    //update name section
    public String updateempname (long id, String name ){
        //  step - 1 get the id using getById
        Employee employee = repository.getById(id);
        // step - 2 update name using setter
        employee.setName(name);
        repository.save(employee);
        return "update name successfully : "+name;
    }

    //update Age section
    public String updateempage(long id , int age){
        Employee employee = repository.getById(id);
        employee.setAge(age);
        repository.save(employee);
        return "Age updated successfully";
    }
    //update name section
    public String updateempdep (long id, String department ){
        //  step - 1 get the id using getById
        Employee employee = repository.getById(id);
        // step - 2 update department using setter
        employee.setDepartment(department);
        repository.save(employee);
        return "update department successfully ";
    }
    // delete data
    public String deleteempdata(long id){
        repository.deleteById(id);
        return "data deleted successfully";
    }

}
