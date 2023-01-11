package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class StudentCRUDCONTROLLER {

    ArrayList<Student>studentArrayList=new ArrayList<>();

    //C- create

    @RequestMapping("/add-student/{name}/{age}/{section}")
    public String add(@PathVariable String name,@PathVariable int age,@PathVariable String section){

        Student student1= new Student(name,age,section);  // making student object

        studentArrayList.add(student1);   // adding student to array list

        return "Student added successfully";
    }

    // R-  READ & GET


    @RequestMapping("/get-all-students")
    public ArrayList<Student> getStudentArrayList(){

        return studentArrayList;
    }                                               // localhost:8081/rahul/32/cs


    // U- Update

    @RequestMapping("/update/{name}/{age}/{index}")
    public String update(@PathVariable String name,@PathVariable int age,@PathVariable int index){

        // step 1

        Student student=getStudentArrayList().get(index);

        // step 2

        student.setName(name);
                 // age not getting change on browser

        return "Student updated successfully";
    }

    // D- delete
@RequestMapping("/delete")                       // localhost:8081/delete/index=1
    public String delete(@RequestParam int index){

        studentArrayList.remove(index);

        return "Student deleted successfully";
    }
}
