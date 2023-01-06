package com.example.springbootnovbatch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;
import java.util.ArrayList;

@RestController
public class CrudCarController {

    ArrayList<String> cars = new ArrayList<>();

    //C- CREATE
    @RequestMapping("/addcars/{Name}")
    // url Syntax - localhost:8081/addcars/TUV
    public String getcars(@PathVariable String Name){
        cars.add(Name);

        return "Car Name Added : "+Name;
    }

    //R- READ or get
    @RequestMapping("/getcars")
    // url Syntax - localhost:8081/getcars
    public ArrayList<String> getcars(){
        return cars;

    }
    //U- UPDATE
    @RequestMapping("/updatecars")
    // url Syntax - localhost:8081/updatecars?Name=XUV&index=0
    public String updatecars(@RequestParam String Name,@RequestParam int index){
        cars.set(index, Name);
        return "Car Name Updated Successfully : "+Name;
    }

    //D- DELETE
    @RequestMapping("/removecar/{index}")
    // url Syntax - localhost:8081/removecar/1
    public String removecar(@PathVariable int index){
        cars.remove(index);
        return "Car Name Successfully Removed ";
    }
}
