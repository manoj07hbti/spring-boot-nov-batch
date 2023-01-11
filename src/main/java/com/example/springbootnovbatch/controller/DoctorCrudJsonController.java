package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Doctor;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class DoctorCrudJsonController {

    ArrayList<Doctor> doctorArrayList  = new ArrayList<>();


    // C ---create or add ----endpoint ---- Post HTTP Method
    // URL : localhost:8081/add_doctor_json

    @RequestMapping("/add_doctor_json") // endpoint
    public String addDoctor (@RequestBody Doctor doctor){
        doctorArrayList.add(doctor);
        return  "  Doctor added successfully  :";

    }

    // R----Read or Get-----endpoint---GET HTTP Method
    // URL :localhost:8081/get_all_doctor_json


    @RequestMapping("/get_all_doctor_json") // endpoint
    public ArrayList<Doctor> getDoctorArrayList(){

        return doctorArrayList;
    }


    // U----Update----endpoint----PUT HTTP Method
    // URL : localhost:8081/update_doctor_json/Ajay kumar/0

    @RequestMapping("/update_doctor_json/{name}/{index}")
    public String updateDoctor(@PathVariable String name, @PathVariable int index){

        Doctor doctor = doctorArrayList.get(index);
        doctor.setName(name);
        return "Doctor Updated Successfully :" + "  Name is :" +name + "  At index : " +index;

    }



    // D----Delete----endpoint------DELETE HTTP Method
    // URL : localhost:8081/delete_doctor_json?index=1

    @RequestMapping("/delete_doctor_json") // endpoint
    public String deleteDoctor(@RequestParam int index){

       doctorArrayList.remove(index);  // object_name.remove_method();

        return " Doctor Deleted Successfully :"+ " At index :" +index;
    }





}
