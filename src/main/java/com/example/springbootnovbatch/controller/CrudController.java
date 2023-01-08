package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class CrudController {


        ArrayList<String> company = new ArrayList<>();


        // c = create
        @RequestMapping("/add_company/{name}")
        public String add(@PathVariable String name) {
            company.add(name);
            return "company  name is : " + name; // http://localhost:8085/add_company/Microsoft
        }

        // r = read or get
        @RequestMapping("/read")
        public ArrayList<String> getCompany() {
            return company;        //  http://localhost:8085/read
        }

        // u-update
        @RequestMapping("/update")
        public String update (@RequestParam String name, @RequestParam int index) {
           company.set( index,name);
            return "update successfully: " + name +index ; // http//localhost:8085/update?name=flipkart&index=2
        }

        // d-delete
        @RequestMapping("/delete/{index}")
        public String remove(@PathVariable int index) {
            company.remove(index);
            return "deleted successfully : "+ index;   //   http://localhost:8085/delete/2
        }
     // Read Particular Index data
       @RequestMapping("/readdata/{index}")
      public String readdata (@PathVariable int index){


           return company.get(index);              // http://localhost:8085/readdata/1


    }

}
