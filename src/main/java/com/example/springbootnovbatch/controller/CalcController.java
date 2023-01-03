package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class CalcController {
    @RestController
    public class calcController {


        @RequestMapping("add")
        public String add() {
            int a = 10;
            int b = 20;
            int sum = a + b;
            return "addition of a and b is " + sum;
        }

        @RequestMapping("Subtraction")
        public String sub() {
            int m = 20;
            int n = 10;
            int sub = m - n;
            return "  value  of subtraction  is" + sub;
        }


        @RequestMapping("Multiple")
        public String multi() {
            int n = 20;
            int m = 10;
            int multi = n - m;
            return " values  of multiple is " + multi;
        }


        @RequestMapping("Division")
        public String division() {
            int a = 20233;
            int b = 10;
            double division = (double) a / b;
            return "division  is " + division;

        }


        @RequestMapping("Cube")
        public String cube() {
            int a = 5;
            int cube = a * a * a;
            return "cube is " + cube;
        }

        @RequestMapping("Percentage")
        public int per() {
            int a = 100;
            int b = 10;
            int per = (a * b) / 100;
            return per;


        }

        @RequestMapping("/oddeven")
        public void testOddEven() {


            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println("even" + i);
                } else {
                    System.out.println("odd" + i);
                }
            }
        }
    }
}


