package com.example.springbootnovbatch.parameterized_curd_operation;

import com.example.springbootnovbatch.model.CompanyM;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CompanyClass_JSON {

    ArrayList <CompanyM> companyMArrayList = new ArrayList<>();

    // at one time (make a method )
    @RequestMapping("/addcompdata")
    // use annotation for this part is @REQUESTBODY
    public String add_data (@RequestBody CompanyM C1) // use CompanyM (object) as a input parameter
     {

        companyMArrayList.add(C1);

        return "Added Successfully";

        // http://localhost:8082/addcompdata
    }


    // Create - add
    @RequestMapping("/addcompany/{name}/{estd}/{turnover}")
    public String add (@PathVariable String name , @PathVariable int estd , @PathVariable double turnover ){

        CompanyM C1 = new CompanyM(name, estd, turnover);
        companyMArrayList.add(C1);
        return "Company Added Successfully -"+" Name- " + name+" , Estd. - "+estd+" , TurnOver - "+turnover;

        //   http://localhost:8082/addcompany/BMW/2022/22.56
    }

    // Read-- Get
    @RequestMapping("/getcompany")
    public ArrayList<CompanyM> getCompanyMArrayList (){
        return companyMArrayList;
        // http://localhost:8082/getcompany
    }

    // Update - set
    @RequestMapping("/updatecompany/{name}/{estd}/{turnover}/{index}")
    public String setcompany (@PathVariable String name ,
                              @PathVariable int estd ,@PathVariable double turnover ,@PathVariable int index){

        CompanyM C1 = companyMArrayList.get(index);
        C1.setName(name);
        C1.setEstd(estd);
        C1.setTurnover(turnover);

        return "Company Update Successfully -"+" Name- " + name+" , Estd. - "+estd+" , TurnOver - "+turnover;
        // http://localhost:8082/updatecompany/honda/2021/11.56/0
    }

    // Delete-- remove
    @RequestMapping("/deletecompany/{index}")
    public String deletecompany (@PathVariable int index){
        companyMArrayList.remove(index);
        return "Deleted Successfully"+index;
        // http://localhost:8082/deletecompany/1
    }



}
