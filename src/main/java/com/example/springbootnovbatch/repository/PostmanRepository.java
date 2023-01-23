package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Postman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostmanRepository extends JpaRepository<Postman,Long> {
}
