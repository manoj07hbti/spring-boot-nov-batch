package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Cycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CycleRepository extends JpaRepository<Cycle,Long> {
}
