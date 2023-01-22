package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Student;
import com.example.springbootnovbatch.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
// framework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public String add(Student student) {
        // call service class

        repository.save(student); // insert into table()
        return "Successfully saved to database";
    }

    public List<Student> getAllStudent() {
        return repository.findAll();
    }

    public String update( long id, String name) {

        // Step-1 : find the record from database
        Student student = repository.getById(id);  // select * from table where id - id

        // Step-2 : update the name
        student.setName(name);
        repository.save(student);

        return "Successfully update name as "+name;
    }

    // Delete
    public String delete(@RequestParam long id) {
        repository.deleteById(id);
        return "Successfully delete data";
    }

}
