package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.Model.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

public class DoctorCrudController {
    ArrayList<Doctor> DoctorArrayList = new ArrayList<>();

    @RequestMapping("/Doctor")
    public String doc(@RequestBody Doctor doctor){
        DoctorArrayList.add(doctor);
        return"doctor data added successfully";             // localhost:8085/Doctor
    }

    // add

    @RequestMapping("/add_doctor/{name}/{index}")
    public String add(@PathVariable String name, @PathVariable String department,@PathVariable int age, @PathVariable double salary) {
        Doctor  doctor= new Doctor(name,department,age,salary );
        DoctorArrayList.add(doctor);
        return "added successfully";                       //  localhost:8085/add_doctor
    }


    // read or get

    @RequestMapping("/read_doctor")
    public  ArrayList <Doctor>getDoctorArrayList(){

        return DoctorArrayList ;                          // localhost:8085/read_doctor


    }


    // update

    @RequestMapping("/update_doctor/{name}/{index}")
    public  String update (@PathVariable  String name, @PathVariable int index) {
        Doctor doctor = DoctorArrayList.get(index);
        doctor.setName(name);

        return "update successfully ";                    // localhost:8085/update_doctor/name/0
    }


    // delete

    @RequestMapping("/delete_doctor/{index}")
    public  String delete(@PathVariable int index){
        DoctorArrayList.remove(index);
        return " deleted successfully";                  // localhost:8085/delete_doctor/0

    }

}
