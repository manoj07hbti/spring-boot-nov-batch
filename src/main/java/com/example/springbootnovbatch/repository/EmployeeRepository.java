package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
