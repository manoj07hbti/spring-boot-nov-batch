package com.example.springbootnovbatch;

import com.example.springbootnovbatch.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeCrudController {

    // Step1 : We have created a class---- name ending with controller
    // For creating the controller class ,we will use this annotation @RestController
    // and this annotation is used above the class due to which spring framework will understand that this is a controller class

    // CRUD OPERATION : it is used for creating the CRUD API
    // API: Application programming interface
    // C means : Create or Add resources (it is used for adding the data in the list )
    // R means : Read or Get (it is used to get the all data from the list )
    // U means : Update (it is used to update the data at given the index)
    // D means : Delete (it is used to delete the data at given the index)

    // Step2: First, We have created an ArrayList of Employee
    // Syntax for ArrayList : ArrayList <DataType>  object_name = new ArrayList <Datatype>();

    ArrayList <Employee> employeeArrayList  = new ArrayList<>();


    // Step3: We will create an endpoint ,it should be unique
    // For creating the endpoint ,we will use this annotation @RequestMapping("/endpoint_name")
    // and this annotation is used above the method due to which spring framework will understand that here an endpoint is created

    // Syntax for method : access_specifier  return_type  function or method_name (parameter){code}
    // Parameter------an input parameter that is optional

    // CREATE---endpoint

    @RequestMapping("/add_employee/{name}/{id}/{salary}")
      public String add (@PathVariable String name, @PathVariable int id , @PathVariable double salary){

          // Now we will create object of Employee class----classname object_name = new classname();

          Employee employee = new Employee(name,id,salary);

          // Now we will add object (employee) of Employee class---- in object( employeeArrayList) of ArrayList of Employee

          employeeArrayList.add(employee); // here used add method, add method: add(value);
                                           // object_name.add_method(); ------object_name.add(employee);

          return " Employee Added Successfully ";

      }


    // READ OR GET ----endpoint

    @RequestMapping("/get_all_employee")
    public ArrayList<Employee> getEmployeeArrayList (){


        return employeeArrayList;
    }


    // Update ----endpoint

    @RequestMapping("/update_employee")
    public String update(@RequestParam String name, @RequestParam int index){

        // Step1: we will get the data at given index and store the get data in employee variable

        Employee employee = employeeArrayList.get(index); // object_name.get_method();

      // Step2: we will use setter method to set the name

      employee.setName(name); // employee_variable .setter_method();

      return  " Employee updated successfully  : "+ "  Name is : " + name + " At index : " +index; // Employee updated successfully :Ajay kumar

    }


    // Delete---endpoint

    @RequestMapping("/delete_employee/{index}")
    public String delete (@PathVariable int index){

     employeeArrayList.remove(index);  // object_name.remove_method();

     return " Employee deleted Successfully" + " At index is : "+ index;

    }



}
