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
    //update name section
    public String updatedocname(long id, String name){
        //Step - 1 find id using getbyid
        Doctor doctor = repository.getById(id);
        // Step - 2 set name in doc name using setter
        doctor.setName(name);
        repository.save(doctor);
        return "Updated name successfully";
    }
    // update age section
    public String updatedocage(long id, int age){
        Doctor doctor = repository.getById(id);
        doctor.setAge(age);
        repository.save(doctor);
        return "Age updated successfully";
    }
    // update salary section
    public String updatedocsalary(long id, double salary){
        Doctor doctor = repository.getById(id);
        doctor.setSalary(salary);
        repository.save(doctor);
        return "Salary updated successfully";
    }
    // delete data
    public String deletedocdata(long id){
        repository.deleteById(id);
        return "data deleted successfully";
    }

}
