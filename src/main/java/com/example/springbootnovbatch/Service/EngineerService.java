package com.example.springbootnovbatch.Service;

import com.example.springbootnovbatch.Model.Engineer;
import com.example.springbootnovbatch.Repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EngineerService {
@Autowired
    EngineerRepository repository;

// add
public String add (Engineer engineer){
    repository. save(engineer);
    return "successfully saved in database";
}
  // read

public List<Engineer>getAllEngineer(){
    return repository.findAll();

}

// update
    public String update(long id,String name){
     Engineer engineer= repository.getById(id);
     engineer . setName(name);
     repository.save(engineer);
        return "Successfully update name as "+name;
    }

    // delete
    public String delete(long id){

     repository. deleteById (id);
     return "successfully deleted data from database";
    }
}
