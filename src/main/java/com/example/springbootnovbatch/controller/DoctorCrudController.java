package com.example.springbootnovbatch.controller;


import com.example.springbootnovbatch.model.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DoctorCrudController {

    // C - create
                                                 //http://localhost:8081/doctor/rajesh/27/3432.43/cs
    ArrayList<Doctor>doctorArrayList=new ArrayList<>();


    @RequestMapping("/doctor/{name}/{age}/{salary}/{department}")
    public String add(@PathVariable String name,@PathVariable int age, @PathVariable double salary,@PathVariable String department){

        Doctor doctor=new Doctor(name,age,salary,department);
        doctorArrayList.add(doctor);

        return "Doctor added to list successfully";

    }

    // R - read & get             //http://localhost:8081/all_doctor
    @RequestMapping("/all_doctor")
    public ArrayList<Doctor>getDoctorArrayList(){
        return doctorArrayList;
    }

    // U- update
                                                   //http://localhost:8081/update_doctor/rahul/0
@RequestMapping("/update_doctor/{name}/{index}")
    public String update(@PathVariable String name,@PathVariable int index){

        Doctor doctor=doctorArrayList.get(index);

        doctor.setName(name);

        return "Doctor name updated sucessfully";


    }


    // d - delete

    @RequestMapping("/remove_doctor")
    public  String remove( @RequestParam int index){   //http://localhost:8081/remove_doctor?index=0
        doctorArrayList.remove(index);
        return "Doctor remove from list successfully";
    }
}

