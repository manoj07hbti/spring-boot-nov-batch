package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineerRepository extends JpaRepository<Engineer, Long> {
}
