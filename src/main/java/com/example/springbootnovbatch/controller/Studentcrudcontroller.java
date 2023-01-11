package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class Studentcrudcontroller {
    ArrayList<Student>studentarraylist=new ArrayList<>();

@RequestMapping("/add_std")
    public String addstudent(@RequestBody Student student){
        studentarraylist.add(student);
       return "student added successfully";
    }

@RequestMapping("/add_student/{name}/{age}/{section}")
    public String add(@PathVariable String name,@PathVariable int age,@PathVariable String section){
        Student student=new Student(name,age,section);
        studentarraylist.add(student);
        return "student added succesfully";
    }

    @RequestMapping("/get_all_students")
    public ArrayList<Student>getStudentArrayList(){

    return studentarraylist;

    }
    @RequestMapping("/update_student/{name}/{index}")
    public String update(@PathVariable String name,@PathVariable int index){

    Student student=studentarraylist.get(index);

    student.setName(name);

    return "student update successfully";
    }
    @RequestMapping("/delete_student")
    public String delete(@RequestParam int index){
    studentarraylist.remove(index);
    return"student delete successfully";
    }
}
