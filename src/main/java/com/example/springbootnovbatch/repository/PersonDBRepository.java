package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDBRepository  extends JpaRepository <Person,Long> {



}
