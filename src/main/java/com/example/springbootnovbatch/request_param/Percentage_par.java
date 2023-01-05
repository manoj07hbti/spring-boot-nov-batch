package com.example.springbootnovbatch.request_param;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Percentage_par {

    //Percentage formula
    @RequestMapping("/percent")
    public String percent (@RequestParam int p , @RequestParam int n ){

        double percent = (double) (p*n)/100;
        return "P percent of N is "+ percent;
    }   //       http://localhost:8082/percent?p=12&n=34567
}
