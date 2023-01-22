package com.example.springbootnovbatch.Repository;

import com.example.springbootnovbatch.Model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineerRepository extends JpaRepository<Engineer,Long> {

}
