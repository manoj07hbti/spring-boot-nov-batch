package com.example.springbootnovbatch.odd_even;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Odd_EVEN {

    //odd or even for single digit

    @RequestMapping("/oddeven")
    public void odd() {

        int a = 10 ;
        if (a%2==0){
            System.out.println("EVEN "+a);
        }else {
            System.out.println("ODD "+a);
        }

        // http://localhost:8081/oddeven
    }


    // method for 1 to 100
    @RequestMapping("/evenodd")
    public void oddeven (){

        for (int i=1; i<=100; i++){
            if (i%2==0){
                System.out.println("Even "+i);
            }else{
                System.out.println("odd "+i);
            }
            // http://localhost:8081/evenodd
        }
    }


    // Screen odd even
    @RequestMapping("Even")
    public String even (){
        String output="";
        for (int i=1; i<=100; i++){

            if (i%2==0){
                output = output + i; //output+= (also written)
                output=  output + ",";
            }
        }return output;
    }    //   http://localhost:8081/Even
}





