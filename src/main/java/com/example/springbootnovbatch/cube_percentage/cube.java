package com.example.springbootnovbatch.cube_percentage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cube {

    //cube
    @RequestMapping("cube")
    public String cube(){

        int a = 3;

        int cube = a*a*a;

        return "Cube of 3 is = "+ cube;
       //       http://localhost:8081/cube
    }
}
