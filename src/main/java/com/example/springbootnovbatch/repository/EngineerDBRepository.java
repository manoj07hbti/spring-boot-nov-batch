package com.example.springbootnovbatch.repository;

import com.example.springbootnovbatch.model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineerDBRepository extends JpaRepository<Engineer, Long> {

    public Engineer findByName (String name); // it will search engineer data via name

    public Engineer findByEngineeridAndName (long engineerid, String name);

    // using SQL Query Syntax - @Query(value="select * from table where id=:id and name =:name",nativeQuery = true)

    //public modelclass nativeSQLQuery(@Param("id") long id, @Param("name") String name);


    @Query(value = "select * from Engineer_Table where engineerid= :engineerid and name = :name", nativeQuery = true)
    public Engineer nativeSQLQuery(@Param("engineerid") long engineerid, @Param("name") String name);
}
