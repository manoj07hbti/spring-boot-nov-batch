package com.example.springbootnovbatch.parameterized_curd_operation;

import com.example.springbootnovbatch.model.EmployeeM;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeClass {

    ArrayList<EmployeeM> employeeMArrayList = new ArrayList<>();

    //  Create - add
    @RequestMapping("/addemployee/{name}/{age}/{salary}")
    public String add (@PathVariable String name ,@PathVariable int age ,@PathVariable double salary){

        EmployeeM E1 = new EmployeeM(name, age, salary);
        employeeMArrayList.add(E1);

        return "Employee added Successfully -- "+" Name- " + name+" , Age - "+age+" , Salary - "+salary;
        // http://localhost:8082/addemployee/sandeep/24/2500000
    }

    // Read -- Get

    @RequestMapping("/getemployee")
    public ArrayList<EmployeeM> getEmployeeMArrayList() {
        return employeeMArrayList;
    }
    // http://localhost:8082/getemployee

    // Update----set
    @RequestMapping("/updateemployee/{name}/{age}/{salary}/{index}")
    public String update (@PathVariable String name ,
                          @PathVariable int age ,@PathVariable double salary,@PathVariable int index){

        // STEP 1
        EmployeeM E1 = employeeMArrayList.get(index);
        // STEP 2
        E1.setName(name);
        E1.setAge(age);
        E1.setSalary(salary);

        return "Employee Update Successfully --- "+" Name- " + name+" , Age - "+age+" , Salary - "+salary;

        // http://localhost:8082/updateemployee/name/age/salary/index
    }

    //Delete-- remove
     @RequestMapping("/deleteemployee")
    public String delete (@RequestParam int index){

        employeeMArrayList.remove(index);
        return "Employee deleted Successfully - "+ index;
        // http://localhost:8082/deleteemployee?index=1

    }
}
