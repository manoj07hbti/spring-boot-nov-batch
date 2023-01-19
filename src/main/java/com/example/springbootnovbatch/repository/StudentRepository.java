package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
