package com.example.springbootnovbatch.crud_controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CRUD {

    //  CRUD OPERATIONS

    ArrayList <String> Course = new ArrayList<>();

    //  C - Create --(add)
    @RequestMapping("/addcourse/{input}")
    public String add (@PathVariable String input){

        Course.add(input);

        return "Added SuccessFully - " +input;
        //  http://localhost:8082/addcourse/springboot

    }
    //  R = READ-- get
    @RequestMapping("/getallcourse")
    public ArrayList<String> getCourse(){

        return Course;
       //   http://localhost:8082/getallcourse
    }
    // U = UPDATE --
    @RequestMapping("/update")
    public String update (@RequestParam String name , @RequestParam int index){

        Course.set(index,name);
        return "Update Successfully - "+ name+index;
        // http://localhost:8082/update?/sanjay/2

    }
    //  D = Delete-- remove
     @RequestMapping("/delete_course/{index}")
    public String delete (@PathVariable int index){

        Course.remove(index);
        return "Removed SuccessFully -"+ index;
        // http://localhost:8082/delete_course/index
    }

    // Read Particular Index
    @RequestMapping("/readindex/{index}")
    public String readindex (@PathVariable int index){

        return Course.get(index);

        // http://localhost:8082/readindex/index
    }

}
