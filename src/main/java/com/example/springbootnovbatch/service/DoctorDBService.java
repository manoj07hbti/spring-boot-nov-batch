package com.example.springbootnovbatch.service;

import com.example.springbootnovbatch.model.Doctor;
import com.example.springbootnovbatch.repository.DoctorDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorDBService {
    @Autowired
    DoctorDBRepository repository;
    public String adddocdata(Doctor doctor){
        repository.save(doctor);
        return "Doctor data added successfully";
    }

    public List<Doctor> getdocdata(){
        return repository.findAll();
    }
}
