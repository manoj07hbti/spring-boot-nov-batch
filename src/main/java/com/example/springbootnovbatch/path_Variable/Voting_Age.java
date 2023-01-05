package com.example.springbootnovbatch.path_Variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Voting_Age {

    // Person is eligible for voting and or not variable is age and city

    @RequestMapping("/voting/{city}/{age}")
    public String eligible(@PathVariable String city, @PathVariable int age ){

        //city
        String output = "";

        if (city.equals("agra")& age>=18){
            output= output+"Person is eligible "+city +","+age;

        }else {
            output= output+"person is not eligible "+city +","+age;
        }
        return output;

        //  http://localhost:8082/voting/agra/18



    }

}
