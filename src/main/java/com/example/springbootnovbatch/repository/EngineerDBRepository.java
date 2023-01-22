package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineerDBRepository extends JpaRepository<Engineer, Long> {
}
