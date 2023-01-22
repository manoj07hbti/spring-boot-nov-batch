
package com.example.springbootnovbatch.Repository;

import com.example.springbootnovbatch.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
