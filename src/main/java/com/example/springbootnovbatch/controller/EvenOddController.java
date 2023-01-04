package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddController {
    @RequestMapping("/even")
    public String evennumber() {
        String output = "";
         for (int i = 1; i<=100; i++) {
            if (i % 2 == 0) {
            output+= i;
                output+=", ";
            }
        }

        return output;
    }

    @RequestMapping("/odd")
    public void oddnumber() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println("Odd no. = " + i);
            }

        }
    }
}
