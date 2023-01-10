package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CURDStudent {


    ArrayList<String> student= new ArrayList<>();
    int i=1;

    //C = CREATE
    @RequestMapping("/student/{Name}")                      //localhost:8081/student/rahul
    public String student(@PathVariable String Name){
        student.add(Name);
        Name = "student "+i+" Name : "+Name;
        i++;
        return Name;

    }

    //R = Read
    @RequestMapping("/get-student")                 // localhost:8081/get-student
    public ArrayList<String> getstudent(){
        return student;
    }

    //U = Update
    @RequestMapping("/update-student")             //localhost:8081/update-student?Name=ganesh&index=1
    public String updatestudent (@RequestParam String Name, @RequestParam int index){
        student.set(index,Name);
        return "Student  Successfully Updated : At index - "+index+" Name - "+Name;
    }

    //D = Delete
    @RequestMapping("/remove-student/{index}")          //localhost:8081/remove-student/2
    public String removestudent(@PathVariable int index){
        student.remove(index);
        return "Successfully removed student name";
    }

    //R- READ particular course

    @RequestMapping("/get_student/{index}")          // localhost:8081/get-student/3
    public String getstudent(@PathVariable int index){

        return student.get(index);
    }
}
