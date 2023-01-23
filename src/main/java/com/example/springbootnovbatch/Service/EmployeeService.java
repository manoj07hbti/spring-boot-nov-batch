package com.example.springbootnovbatch.Service;



import com.example.springbootnovbatch.Model.Employee;
import com.example.springbootnovbatch.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class EmployeeService {
@Autowired
    EmployeeRepository repository;


public String add (Employee employee) {
    repository.save(employee);
    return "successfully saved to database";
}

    public List<Employee> getAllEmployee(){
    return repository.findAll();

    }
   // u- update
    public String update(long id ,String name){


     //   Step i - find record from db
         Employee employee =  repository.getById(id);

        // step 2 update the name
        employee.setName(name);
        repository.save(employee);// again saved to database

        return "Successfully updated name as "+name;
    }
    //delete
    public String delete( long id){

        repository.deleteById(id); // delete from table where id=id

        return "Successfully delete data from database table";
    }
    public Employee findByName(String name){
    return repository .findByName(name);
    }

    public Employee findByIdName( long id,  String name){
    return  repository.findByIdAndName(id ,name);
    }
    public Employee findBySQL (long id, String name){
    return repository .nativeSQLQuery(id , name);
    }

}