package com.example.springbootnovbatch.repository;


import com.example.springbootnovbatch.model.Engineer1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Engineer1DBRepository extends JpaRepository<Engineer1 ,Long> {


}
