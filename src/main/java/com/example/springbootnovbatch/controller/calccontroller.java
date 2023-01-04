package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calccontroller {
    @RequestMapping("/addition")
    public String add() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        return "addition is " + sum;
    }

    @RequestMapping("/substraction")
    public String sub() {
        int a = 1000;
        int b = 94;
        int sub = a - b;
        return "substraction " + sub;
    }

    @RequestMapping("/multiply")
    public String multi() {
        int a = 45;
        int b = 36;
        int multi = a * b;
        return "multiplication " + multi;
    }

    @RequestMapping("/division")
    public String divide() {
        int a = 458;
        int b = 59;
        double divide = (double) (a / b);
        return "division " + divide;
    }

    @RequestMapping("/percentage")
    public String percent() {
        int num = 1900;
        int percent = 19;
        double result = (double) (num * percent) / 100;
        return "percentage " + result;
    }

    @RequestMapping("/cubing")
    public String cube() {
        int num = 58;
        int cube = num * num * num;
        return "Cube of 58 is " + cube;
    }

    @RequestMapping("/odd_")
    public String odd() {
        String output = "";
        for (int i = 1; i <= 100; i++) {
            if (!(i % 2 == 0)) {
                output += ",";
                output +=i;
            }
        }
        return output;
    }
    @RequestMapping("/even_")
    public String even() {
        String output="";
        for(int i =1; i<=100; i++){
            if(i%2==0){
                output +=",";
                output += i;
            }
        }
        return output;

    }
}