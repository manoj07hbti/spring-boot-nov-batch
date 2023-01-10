package com.example.springbootnovbatch.controller;


import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddParam {

                                        //http://localhost:8081/check-param?i=4

    @RequestMapping("/check-param")
    public String odd(@RequestParam int i) {

        String output ;

            if (i % 2 == 1) {

            return output="number u enter is :"+i+"and its a odd number";}

        else

            return output="number u enter is :"+i+"and its a even number";

    }
}
