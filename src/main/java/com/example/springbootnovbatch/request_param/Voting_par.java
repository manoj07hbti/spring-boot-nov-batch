package com.example.springbootnovbatch.request_param;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Voting_par {

    // Person is eligible for voting and or not variable is age and city

    @RequestMapping("/voting")
    public String eligible(@RequestParam String city, @RequestParam int age ){

        //city
        String output = "";

        if (city.equals("agra")& age>=18){
            output= output+"Person is eligible "+" City - "+city +" , Age -"+age;

        }else {
            output= output+"person is not eligible "+" City - "+city +", Age- "+age;
        }
        return output;

        //  http://localhost:8082/voting?city=agra&age=19



    }
}
