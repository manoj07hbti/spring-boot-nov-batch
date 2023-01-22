package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.Model.Person;
import com.example.springbootnovbatch.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonDBController {
    @Autowired
    PersonService service ;

    // c

    @RequestMapping("/person_db")
    public String add(@RequestBody Person person){
        return service.add(person);
    }

    // r
    @RequestMapping("/get_person_db")

      public List<Person> getAllPerson() {

        return service.getAllPerson();

    }
    // u
    @RequestMapping("/update_person_db/{id}/{name}")
    public String update(@PathVariable  long id,@PathVariable String name){
       return service.update(id,name);
    }

    // d
    @RequestMapping("/delete_person_db/{id}")
    public String delete(@PathVariable long id ){
        return service.delete(id);
    }
}
