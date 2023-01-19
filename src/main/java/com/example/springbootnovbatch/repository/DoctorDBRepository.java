package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorDBRepository extends JpaRepository<Doctor, Long> {
}
