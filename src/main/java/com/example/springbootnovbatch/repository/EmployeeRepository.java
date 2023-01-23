package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Employee_Database;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee_Database,Long> {
}
