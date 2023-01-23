package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Student;
import com.example.springbootnovbatch.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public String add(Student student){
        //call service class

        repository.save(student); // insert into table()
        return "Successfully saved to Database";
    }

    public List<Student> getAllStudents(){

        return repository.findAll();// select * from table
    }
    //update

    public String update( long id, String name){

      //step 1 find the record from db
      Student student=repository.getById(id); // select * from table where id=id

      // step 2 update the name
      student.setName(name);
      repository.save(student);// again saved to database

      return "Successfully updated name as "+name;
    }
    //delete
    public String delete( long id){

     repository.deleteById(id);// delete from table where id=id

     return "Successfully deleted data";
    }

    public Student findByName(String name){

        return repository.findByName(name);
    }

    public Student fndByIdName(long id, String name){

        return repository.findByIdAndName(id, name);
    }

    public Student findBySQL(long id, String name){

        return repository.nativeSQLQuery(id,name);
    }
}
