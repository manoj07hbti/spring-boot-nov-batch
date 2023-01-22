package com.example.springbootnovbatch.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppFlowRepository {

    public String demo() {
        return "This is RESPONSE from REPOSITORY Layer";
    }

}
