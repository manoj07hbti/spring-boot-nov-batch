package com.example.springbootnovbatch.path_Variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentageVar {

    //Percentage formula
    @RequestMapping("/percent/{p}/{n}")
    public String percent (@PathVariable int p , @PathVariable int n ){

        double percent = (double) (p*n)/100;
        return "P percent of N is "+ percent;
    }   //     http://localhost:8081/percent/10/2000
}
