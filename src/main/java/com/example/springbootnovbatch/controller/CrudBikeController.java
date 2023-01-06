package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CrudBikeController {
    ArrayList<String> bikes= new ArrayList<>();
    int i=1;

    //C = CREATE
    @RequestMapping("/addbikes/{Name}")
    // url Syntax - localhost:8081/addbikes/Apache
    public String addbikes(@PathVariable String Name){
        bikes.add(Name);
        Name = "Added Bike "+i+" Name : "+Name;
        i++;
        return Name;

    }

    //R = Read
    @RequestMapping("/getbikes")
    // url Syntax - localhost:8081/getbikes
    public ArrayList<String> getbikes(){
        return bikes;
    }

    //U = Update
    @RequestMapping("/updatebikes")
    // url Syntax - localhost:8081/updatebikes?Name=Pulsar&index=1
    public String updatebikes (@RequestParam String Name,@RequestParam int index){
        bikes.set(index,Name);
        return "Bike Name Successfully Updated : At index - "+index+" Name - "+Name;
    }

    //D = Delete
    @RequestMapping("/removebike/{index}")
    // url Syntax - localhost:8081/removebike
    public String removebike(@PathVariable int index){
        bikes.remove(index);
        return "Successfully removed bike name";
    }
}
