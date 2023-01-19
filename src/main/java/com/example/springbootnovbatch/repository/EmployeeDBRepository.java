package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDBRepository extends JpaRepository<Employee, Long> {
}
