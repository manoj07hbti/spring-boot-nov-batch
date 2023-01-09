package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentCrudController {

    ArrayList<Student> studentArrayList= new ArrayList<>();

    //CREATE

    @RequestMapping("add_student/{name}/{age}/{section}")
    public String add(@PathVariable String name,@PathVariable int age,@PathVariable String section){

        Student student= new Student(name,age,section);
        studentArrayList.add(student);

        return "Student Added Successfully ";
    }

    //READ or GET

    @RequestMapping("/get_all_students")
    public ArrayList<Student> getStudentArrayList(){

        return studentArrayList;
    }

    //UPDATE
    @RequestMapping("/update_student/{name}/{index}")
    public String update(@PathVariable String name,@PathVariable int index){

        //Step 1
        Student student= studentArrayList.get(index);
        //step 2
        student.setName(name);

        return "Student updated successfully  ";
    }

    //DELETE
    @RequestMapping("/delete_student")
    public String delete(@RequestParam int index){
        studentArrayList.remove(index);

        return "Student deleted Successfully..";
    }

}
