package com.example.springbootnovbatch.Service;


import com.example.springbootnovbatch.Model.Person;
import com.example.springbootnovbatch.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class PersonService {

    @Autowired
    PersonRepository repository;


// create

    public String add (Person person){
        repository.save(person);
    return  "Data saved successfully in Database";

    }

    // read or get

    public List<Person>getAllPerson(){
    return repository.findAll();

    }

    // update

    public String update(long id,String name){

        //step 1 find the record from db

        Person person =repository.getById(id); // select * from table where id=id

        // step 2 update the name

        person.setName(name);
        repository.save(person); // again saved to database

        return "Successfully update name  "+name;

    }

    //delete

    public String delete( long id){

        repository.deleteById(id);// delete from table where id=id

        return "Successfully  data delete";
    }
    }

