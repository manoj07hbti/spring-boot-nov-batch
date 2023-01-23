package com.example.springbootnovbatch.Repository;

import com.example.springbootnovbatch.model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface engineerrepository extends JpaRepository<Engineer,Long >{
}
