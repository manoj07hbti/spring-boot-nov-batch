package com.example.springbootnovbatch.request_param;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNo_par {

    // number is prime or not
    @RequestMapping("/prime")
    public String prime (@RequestParam int n )
    {
        boolean isPrime=false;

        for (int i=2; i<n; i++){
        if(n%i==0){
            isPrime=false;
            break;
        }
        else {
            isPrime=true;
        }
    }
    String output = "";
        if(isPrime){
        output = output+"no. is prime"+n;
    }
        else {
        output = output+"no. is not prime " +n;
    }return output;
    }
    //       http://localhost:8082/prime?n=34
}
