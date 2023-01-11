package com.example.springbootnovbatch.controller;


import com.example.springbootnovbatch.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentCrudController {

    ArrayList<Student> studentArrayList = new ArrayList<>();

@RequestMapping("/add_std")
    public String add_student(@RequestBody Student student){  // {
                                                              //  "name":"arun",
                                                             //   "age":27,
                                                             //   "section":"me"
                                                             //    }
        studentArrayList.add(student);
        return "Student added successfully";

    }

    //CREATE                                //http://localhost:8081/add_student/rajesh/27/me

    @RequestMapping("add_student/{name}/{age}/{section}")
    public String add(@PathVariable String name, @PathVariable int age, @PathVariable String section) {

        Student student = new Student(name, age, section);
        studentArrayList.add(student);

        return "Student Added Successfully ";
    }

    //READ or GET

    @RequestMapping("/get_all_students")
    public ArrayList<Student> getStudentArrayList() {     //http://localhost:8081/get_all_students

        return studentArrayList;
    }

    //UPDATE
    @RequestMapping("/update_student/{name}/{index}")
    public String update(@PathVariable String name, @PathVariable int index) {

        //Step 1
        Student student = studentArrayList.get(index);    //http://localhost:8081/update_student/rahul/0
        //step 2
        student.setName(name);

        return "Student updated successfully  ";
    }

    //DELETE
    @RequestMapping("/delete_student")
    public String delete(@RequestParam int index) {    //http://localhost:8081/delete_student?index=0
        studentArrayList.remove(index);

        return "Student removed";
    }
}
