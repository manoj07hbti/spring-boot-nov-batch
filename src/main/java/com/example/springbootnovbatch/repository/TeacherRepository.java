package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
