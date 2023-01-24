package com.example.springbootnovbatch.Repository;

import com.example.springbootnovbatch.model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface engineerrepository extends JpaRepository<Engineer,Long > {
    public Engineer findByName(String name);

    public Engineer findByIdAndName(long id, String namr);

    @Query(value = "select *from Engineer where id=:id,name=:name", nativeQuery = true)
    public Engineer nativeSQLQuery(@Param("id") long id, @Param("name") String name);


}