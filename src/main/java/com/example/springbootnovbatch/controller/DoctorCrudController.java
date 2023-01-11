package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DoctorCrudController {
    ArrayList<Doctor> doctorArrayList = new ArrayList<>();

    // Request body
    //URL = localhost:8081/add_doctor_data
    /* JSON File body
    {
        "name" : "Deshraj",
        "age" : 35,
        "deprt" : "Nephrology",
        "salary" : 125000.0
     }     */
    @RequestMapping("/add_doctor_data")
    public String adddoctordata(@RequestBody Doctor doctor){
        doctorArrayList.add(doctor);
        return "Doctor data Added Successfully";
    }

    //C- Create Section
    @RequestMapping("/add_doctor/{name}/{age}/{deprt}/{salary}")
    public String adddoctor(@PathVariable String name,@PathVariable int age,@PathVariable String deprt,@PathVariable double salary){
        Doctor doctor = new Doctor(name,age,deprt,salary);
        doctorArrayList.add(doctor);
        return "Doctor data Added Successfully";
    }
    //URL = localhost:8081/add_doctor/deshraj/35/nephrology/125000.0
    //URL = localhost:8081/add_doctor/vineet/42/Orthology/115000.0
    //URL = localhost:8081/add_doctor/rahul/37/gastrology/105000.0
    //URL = localhost:8081/add_doctor/vandita/30/neurology/155000.0

    //R- Read Section
    @RequestMapping("/get_doctors_data")
    public ArrayList<Doctor> getdoctordata(){
        return doctorArrayList;
    }       //URL = localhost:8081/get_doctors_data


    //U- Update Name Section
    @RequestMapping("/update_doc_name/{name}/{index}")
    public String updatedoctorname(@PathVariable String name,@PathVariable int index){
        Doctor doctor = doctorArrayList.get(index);
        doctor.setName(name);
        return "Doctor Name Updated Successfully";
    }
    //URL = localhost:8081/update_doc_name/Deshraj Gurjar/0

    //U- Update Age Section
    @RequestMapping("/update_doc_age/{age}/{index}")
    public String updatedoctorage(@PathVariable int age,@PathVariable int index){
        Doctor doctor = doctorArrayList.get(index);
        doctor.setAge(age);
        return "Doctor Age Updated Successfully";
    }
    //URL = localhost:8081/update_doc_age/36/0

    //U- Update Department Section
    @RequestMapping("/update_doc_deprt/{deprt}/{index}")
    public String updatedoctordeprt(@PathVariable String deprt,@PathVariable int index){
        Doctor doctor = doctorArrayList.get(index);
        doctor.setDeprt(deprt);
        return "Doctor Department Updated Successfully";
    }
    //URL = localhost:8081/update_doc_deprt/Nephro/0

    //U- Update Salary Section
    @RequestMapping("/update_doc_salary/{salary}/{index}")
    public String updatedoctorname(@PathVariable double salary,@PathVariable int index){
        Doctor doctor = doctorArrayList.get(index);
        doctor.setSalary(salary);
        return "Doctor Salary Updated Successfully";
    }
    //URL = localhost:8081/update_doc_salary/185000.0/0

    //D- Delete Section
    @RequestMapping("/remove_doc/{index}")
    public String removedoctor(@PathVariable int index){
        doctorArrayList.remove(index);
        return "Doctor Data Removed Successfully";
    }
    //URL = localhost:8081/remove_doc/1




}
