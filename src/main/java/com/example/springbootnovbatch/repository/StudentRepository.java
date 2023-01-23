package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student,Long> {

    public  Student findByName(String name);// it will search student by name in database

    public Student findByIdAndName(long id, String name);

    @Query(value="select * from DEMO_STUDENT_TABLE where id=:id and name =:name",nativeQuery = true)
    public Student nativeSQLQuery(@Param("id") long id, @Param("name") String name);
}
