
package com.example.springbootnovbatch.Repository;

import com.example.springbootnovbatch.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    public Employee findByName (String name);
    public Employee  findByIdAndName(long id, String name);

    @Query(value="select * from EMPLOYEE_DATABASE_TABLE where id=:id and name =:name",nativeQuery = true)
    public Employee nativeSQLQuery(@Param("id") long id, @Param("name") String name);
}
