package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.query.Param;

public interface EngineerRepository extends JpaRepository<Engineer, Long> {

    public Engineer findByName(String name); // it will search Engineer by name

    public Engineer findByIdAndName(long id, String name);
}
