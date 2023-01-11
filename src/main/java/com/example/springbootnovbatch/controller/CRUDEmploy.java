package com.example.springbootnovbatch.controller;


import com.example.springbootnovbatch.model.Employ;
import com.example.springbootnovbatch.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CRUDEmploy {


    ArrayList<Employ>employArrayList=new ArrayList<>();

    //C- create

    @RequestMapping("/add-employ/{name}/{age}/{salary}/{department}")
    public String add(@PathVariable String name,@PathVariable int age,@PathVariable double salary,@PathVariable String department){


        Employ employee= new Employ(name,age,salary,department);  // making employ object

        employArrayList.add(employee);   // adding employ to array list

        return "Employee added successfully";
    }

    // R-read & Get

    @RequestMapping("/all-employ")
    public ArrayList<Employ> getemployArrayList(){

        return employArrayList;

    }

    // U -update

    @RequestMapping("/update-employ/{name}/{index}")
    public  String update( @PathVariable String name,@PathVariable int index ){

        // step 1

     Employ employ=getemployArrayList().get(index);


     // step 2

        employ.getName(name);

        return "Employ updated successfully";
    }

    @RequestMapping("/update-age/{age}/{index}")
    public String updateage(@PathVariable int age, int index){

        Employ employ= getemployArrayList().get(index);

        employ.getAge(age);

         return " employ age updated sucessfully";

    }

    // delete section
    @RequestMapping("/remove-employ")
    public String removeemployee(@RequestParam int index){
        employArrayList.remove(index);
        return "Employee data removed successfully";
    }

}




