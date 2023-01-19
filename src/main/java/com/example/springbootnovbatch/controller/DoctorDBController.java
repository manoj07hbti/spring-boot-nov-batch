package com.example.springbootnovbatch.controller;

import com.example.springbootnovbatch.model.Doctor;
import com.example.springbootnovbatch.service.DoctorDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import java.util.List;

@RestController
public class DoctorDBController {
    @Autowired
    DoctorDBService service;
    @RequestMapping("/adddocdata")
    public String adddocdata(@RequestBody Doctor doctor){
        return service.adddocdata(doctor);
    }

    @RequestMapping("/getdocdata")
    public List<Doctor> getdocdata(){
        return service.getdocdata();
    }
}
