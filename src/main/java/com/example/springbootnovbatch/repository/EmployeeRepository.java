package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    public Employee findByName(String name); // it will search student by name in data

    public Employee findByIDAndName(long ID,String name);

// SRCH DATA BY PASSING QUERY IN SQL
  @Query(value = "select * from demo_employee_table where ID=:ID and name=:name",nativeQuery = true)

    public Employee nativesqlquery(@Param("ID") long ID,@Param("name") String name);
}
