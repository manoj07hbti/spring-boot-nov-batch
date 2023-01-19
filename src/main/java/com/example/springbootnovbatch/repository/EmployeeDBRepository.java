package com.example.springbootnovbatch.repository;


import com.example.springbootnovbatch.model.Employee2;
import com.example.springbootnovbatch.model.Employee3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDBRepository  extends JpaRepository <Employee3,Long> {





}
