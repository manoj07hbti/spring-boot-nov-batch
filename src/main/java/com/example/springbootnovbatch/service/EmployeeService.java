package com.example.springbootnovbatch.service;
import com.example.springbootnovbatch.model.Employee;
import com.example.springbootnovbatch.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;
    public String add(Employee employee) {

        // call service class

        repository.save(employee); // insert into table()
        return "Successfully saved to database";
    }

    public List<Employee> getAllEmployee() {
        return repository.findAll();
    }

    // update
    public String update(long id, String name) {
        Employee employee = repository.getById(id);

        employee.getName(name);
        repository.save(employee);
        return "Successfully update Data of Employee"+name;
    }


    // Delete data
    public String delete(@RequestParam long id) {
        repository.deleteById(id);
        return "Successfully delete data";
    }
}
