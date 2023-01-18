package com.example.springbootnovbatch.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name = "Employee_Table") // it will change the table name  from Employee2 to Employee_Table
public class Employee2 {

    // Step1: @Entity
    // Step2: @Id and @GeneratedValue
    // Step3: default constructor


    // Properties or data member or instance variable or field----- name ,id,age,department,salary----etc

    @Id
    @GeneratedValue
    long id;

    String employeeName;
    int employeeAge;

    @Column(name = "Emp_Dept") // it will change the column name from employeeDepartment to Emp_Dept
    String employeeDepartment;
    double employeeSalary;





    // Parameterized Constructor  (We will make it to fill the data)


    public Employee2(String employeeName, int employeeAge, String employeeDepartment, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = employeeSalary;
    }


    // Getter and Setter (Getter is used to get thd data and Setter is used to set or change the data)


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
