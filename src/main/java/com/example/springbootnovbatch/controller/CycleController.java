package com.example.springbootnovbatch.controller;


import com.example.springbootnovbatch.model.Cycle;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CycleController {

    ArrayList<Cycle> cycleArrayList=new ArrayList<>();


    // Jason input
     @RequestMapping("/cycle")
     public  String addcycle(@RequestBody Cycle cycle){
         cycleArrayList.add(cycle);
         return "Cycle added to list by jason input successfully";
     }


    // C- create
    @RequestMapping("/add_cycle/{name}/{price}/{model}")
    public  String add(@PathVariable String name,@PathVariable double price,@PathVariable int model){
        Cycle cycle=new Cycle(name,price,model);
        cycleArrayList.add(cycle);
        return "Cycle added successfully";

    }                                                  // post-get-put-get-delete-get{crud}
    @RequestMapping("/get_cycle")
    public ArrayList<Cycle>getCycleArrayList(){
        return cycleArrayList;
    }

    @RequestMapping("/update_cycle/{name}/{index}")
    public String update(@PathVariable String name,@PathVariable int index){
        Cycle cycle=cycleArrayList.get(index);
        cycle.setName(name);                                        // setName annotation to change the name
        return "Cycle updated successfully";

    }
    @RequestMapping("/remove_cycle")
    public String remove(@RequestParam int index){
        cycleArrayList.remove(index);
        return "Cycle removed successfully";
    }
}
