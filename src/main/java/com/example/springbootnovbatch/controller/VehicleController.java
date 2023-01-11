package com.example.springbootnovbatch.controller;


import com.example.springbootnovbatch.model.Vehicle;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class VehicleController {

    ArrayList<Vehicle>vehicleArrayList=new ArrayList<>();

    // jason input
    @RequestMapping("/add-vehicle")
     public String addvehicle(@RequestBody Vehicle vehicle){
         vehicleArrayList.add(vehicle);
         return "Vehicle added to the list by jason successfully";
     }

    // create
    @RequestMapping("/add_vehicle/{name}/{model}/{price}/{brand}")
    public String add(@PathVariable String name,@PathVariable int model,@PathVariable double price,@PathVariable String brand){

        Vehicle vehicle=new Vehicle(name,model,price,brand);

        vehicleArrayList.add(vehicle);

        return "Vehicle successfully added to the list";
    }

    //http://localhost:8081/add_vehicle/honda/2013/6466567/city

    // R- read & get
     @RequestMapping("/get_vehicle")
    public ArrayList<Vehicle>getVehicleArrayList(){
        return vehicleArrayList;
    }

    //http://localhost:8081/get_vehicle

    // U- update
    @RequestMapping("/update_vehicle/{name}/{index}")
    public String update(@PathVariable String name,@PathVariable int index){
        Vehicle vehicle= vehicleArrayList.get(index);
        vehicle.setName(name);
        return "Name of the Vehicle updated succesfully";
    }

    //http://localhost:8081/update_vehicle/hundai/0

    // D- delete
    @RequestMapping("/remove_vehicle")
    public  String removename(@RequestParam int index){
        vehicleArrayList.remove(index);
        return "Vehicle data removed successfully";
    }
    //http://localhost:8081/remove_vehicle?index=0

    }

