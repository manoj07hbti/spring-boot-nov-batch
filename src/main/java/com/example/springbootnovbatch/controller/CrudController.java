package com.example.springbootnovbatch.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CrudController {


    // Step1 : We have created a class---- name ending with controller
    // For creating the controller class ,we will use this annotation @RestController
    // and this annotation is used above the class due to which spring framework will understand that this is a controller class


    // CRUD OPERATION : it is used for creating the CRUD API
    // API: Application programming interface
    // C means : Create or Add resources (it is used for adding the data in the list )
    // R means : Read or Get (it is used to get the all data from the list )
    // U means : Update (it is used to update the data at given the index)
    // D means : Delete (it is used to delete the data at given the index)


    // Step2: First, We have created an ArrayList of String
    // Syntax for ArrayList : ArrayList <DataType>  object_name = new ArrayList <Datatype>();

    ArrayList <String> course = new ArrayList<>();


    // Step3: We will create an endpoint ,it should be unique
    // For creating the endpoint ,we will use this annotation @RequestMapping("/endpoint_name")
    // and this annotation is used above the method due to which spring framework will understand that here an endpoint is created

    // Syntax for method : access_specifier  return_type  function or method_name (parameter){code}
    // Parameter------an input parameter that is optional

    // We want to pass values from the browser (user input---input from the keyboard)
    // There are two types to pass values from the browser
    // 1)PathVariable   2) RequestParam
    // Note: Path Variable type is safer than Request Param
    // The annotation used for Path Variable is -----@PathVariable
    // The annotation used for Request Param  is -----@RequestParam


    // If we are using PathVariable therefore endpoint is:
    // @RequestMapping("/endpoint_name/{path_variable_name1}/{path_variable_name2}")
    // Method is : method(@PathVariable Datatype  path_variable_name)
    // URL : http://localhost:port/endpoint_name/value
    // http://localhost:8081/add_input/java


    // If we are using RequestParam therefore endpoint is:
    // @RequestMapping("/endpoint_name")
    // Method is : method(@RequestParam  Datatype  variable_name)
    // URL : http://localhost:port/endpoint_name?Param1=value1&Param2=value2



     // C means : Create or Add resources (it is used for adding the data in the list )
    @RequestMapping("/add_input/{input}")
      public String add( @PathVariable String input ){

          course.add(input);  // add method of collection, add method : add(value);
                              // object_name.add_method(); ------object_name.add(variable_name);

          return  " Added Successfully :"+input; // output
                                                 // Here used + operator , and it is used to add two things like "any message"+output;
                                                 // it is called concatenation

      }


    // R means : Read or Get (it is used to get the all data from the list )

    @RequestMapping("/get_all_input")
    public ArrayList<String> getCourse (){

        return course; // We have added all data in object (course) of an ArrayList of String
                       // So here, we will get all data from the object of an ArrayList of String

    }


    // U means : Update (it is used to update the data at given the index)
    // http://localhost:8081/update_input/java/0

    @RequestMapping("/update_input/{name}/{index}")
    public String updateInput(@PathVariable String name ,@PathVariable int index){

      course.set(index,name); // set method of collection, set method : set(value);
                              // object_name.set_method(); ------object_name.set(variable_name);


       return " Updated Successfully :"+name;

    }


    // U means : Update (it is used to update the data at given the index)
    // http://localhost:8081/update_input1?name=framework&index=0

    @RequestMapping("/update_input1")
    public String updateInput1(@RequestParam String name , @RequestParam int index){

        course.set(index,name); // set method of collection, set method : set(value);
                                // object_name.set_method(); ------object_name.set(variable_name);


        return " Updated Successfully :"+name;

    }


    // D means : Delete (it is used to delete the data at given the index)
    // http://localhost:8081/delete_input/0

    @RequestMapping("/delete_input/{index}")
    public String deleteInput(@PathVariable int index){

       course.remove(index); // remove method of collection, remove method : remove(index);
                             // object_name.remove_method(); ------object_name.remove(index);

       return  " Deleted Successfully at index :" +index;

    }


    //R- READ particular course or input

    @RequestMapping("/get_particular_course/{index}")
    public String getParticularInput (@PathVariable int index){

                          // get method of collection, get method : get(index);
                          // object_name.get_method(); ------object_name.get(index);

     return course.get(index);


    }




}
