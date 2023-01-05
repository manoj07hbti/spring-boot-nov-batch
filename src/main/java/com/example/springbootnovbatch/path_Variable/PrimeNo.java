package com.example.springbootnovbatch.path_Variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNo {

    // number is prime or not
    @RequestMapping("/prime/{n}")
    public String prime (@PathVariable int n ){

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
    }//   http://localhost:8081/prime/23
}
