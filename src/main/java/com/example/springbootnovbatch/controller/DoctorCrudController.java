package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Doctor;
import com.example.springbootnovbatch.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class DoctorCrudController {

    ArrayList<Doctor> doctorArrayList = new ArrayList<>();

    @RequestMapping("/add_dr")
    public String addDoctor(@RequestBody Doctor doctor){

        doctorArrayList.add(doctor);

        return "Doctor Added Successfully ";
    }


    // C - CREATE
    @RequestMapping("/Doctor_Data/{name}/{age}/{department}/{salary}")
    public String add(@PathVariable String name, @PathVariable int age,@PathVariable String department, @PathVariable double salary) {
        Doctor doctor = new Doctor(name, age ,department, salary);
        return "Added Doctor details Successfully";
    }


    // R - READ AND GET
    @RequestMapping("/Get_Doctor_Details/")
    public ArrayList <Doctor> getDoctorArrayList(){
        return doctorArrayList;
    }


    // U - UPDATE
    @RequestMapping("/Update_Data_Doctor/{name}/{age}")
    public String update(@PathVariable String name, @PathVariable int age){
        Doctor doctor =  doctorArrayList.get(age);
        doctor.setName(name);
        return "Update Data SuccessFully";
    }


    // D - DELETE
    @RequestMapping("/Delete_Doctor_Data")
    public String delete(@RequestParam String name) {
       doctorArrayList.remove(name);
        return "Data Deleted Successfully";
    }

}
