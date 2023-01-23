package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Employee4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Employee4DBRepository  extends JpaRepository <Employee4 ,Long> {

    public Employee4 findByName (String name); // it will search the Employee by name in the database table
                                               // Syntax  : findByField();

    public Employee4 findByIdAndName(long id,String name); // it will search the Employee by id and name in the database table
                                                           // Syntax : findByField1AndField2(1,'Name'); -------findByIdAndName


    public  Employee4 findByCity(String city);

    public  Employee4 findByDepartment(String department);

    public  Employee4 findByIdAndNameAndCity (long id,String name ,String city);

    // If we want to execute query : then we will use @Query annotation
    // @Query (value = "SQL" , nativeQuery = true)------
    // @Query (value =" select * from Employee4 where id =: id and name =:name" , nativeQuery = true)
    // method


    @Query(value = " select * from Employee4 where id=:id and name=:name" ,nativeQuery = true)

    public Employee4 nativeSQLQuery (@Param("id")long id , @Param("name") String name);



    @Query(value = " select * from Employee4 where city=:city and age=:age",nativeQuery = true)

    public Employee4 nativeSQLQuery1(@Param("city") String city ,@Param("age") int age);




}
