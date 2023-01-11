package com.example.springbootnovbatch.parameterized_curd_operation;

import com.example.springbootnovbatch.model.DoctorM;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DoctorController_JSON {

    // CRUD OPERATION

    ArrayList<DoctorM> doctorMArrayList = new ArrayList<>();
    @RequestMapping("/adddoc")
    public String adddoc (@RequestBody DoctorM D1){

        doctorMArrayList.add(D1);
        return "Doctor added Successfully ";


        // http://localhost:8082/adddoc
    }

    // Create-- add
    @RequestMapping("/adddoctor/{name}/{age}/{department}/{salary}")
    public String adddoctor (@PathVariable String name,@PathVariable int age ,
                             @PathVariable String department ,@PathVariable double salary ){

        DoctorM D1 = new DoctorM(name, age, department, salary);
        doctorMArrayList.add(D1);
        return "Doctor Added Successfully -"+" Name- " + name+" , Age - "+age+" , Department - "+department+
                ",Salary - "+ salary;

        // http://localhost:8082/adddoctor/sandeep/34/ortho/33.54
    }

    // Read- get
    @RequestMapping("/getdoctor")
    public ArrayList<DoctorM> getDoctorMArrayList (){
       return doctorMArrayList;
      //  http://localhost:8082/getdoctor
    }

    // Update - set
    @RequestMapping("/updatedoctor/{name}/{age}/{department}/{salary}/{index}")
    public String uddatedoctor (@PathVariable String name,@PathVariable int age ,
                                @PathVariable String department ,@PathVariable double salary,@PathVariable int index ){

        // step 1
         DoctorM D1 = doctorMArrayList.get(index);
         D1.setName(name);
         D1.setAge(age);
         D1.setDepartment(department);
         D1.setSalary(salary);

         return "Doctor Update Successfully -"+" Name- " + name+" , Age - "+age+" , Department - "+department+
                 ",Salary - "+ salary;

         // http://localhost:8082/updatedoctor/sanjay/35/ear/22.33/1
    }

    // delete - remove
    @RequestMapping("/deletedoc/{index}")
    public String deletedoc (@PathVariable int index){
        doctorMArrayList.remove(index);
        return "remove Succerssfully ";

        // http://localhost:8082/deletedoc/2
    }

}
