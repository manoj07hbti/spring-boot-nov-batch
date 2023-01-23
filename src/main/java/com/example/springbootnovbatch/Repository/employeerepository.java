package com.example.springbootnovbatch.Repository;

import com.example.springbootnovbatch.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeerepository extends JpaRepository<Employee,Long> {
}
