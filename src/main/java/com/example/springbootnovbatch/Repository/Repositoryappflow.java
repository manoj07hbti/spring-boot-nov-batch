package com.example.springbootnovbatch.Repository;

import com.example.springbootnovbatch.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Repositoryappflow {

    public Object save;

    public String demo(){
        return "this is response from repository ";
    }

    public void save(Student student) {

    }
}
