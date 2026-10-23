package org.abesproject.hclhrms.controller;

import org.abesproject.hclhrms.entity.Employee;
import org.abesproject.hclhrms.service.EmployeeServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeServiceImp employeeServiceImp;

    public EmployeeController(EmployeeServiceImp employeeServiceImp) {
        this.employeeServiceImp = employeeServiceImp;
    }

    @GetMapping("/")
    public String welcomeMsg(){
        return "welcome to abes hrms";
    }

    @GetMapping("/addemp")
    public String addnewEmployee(){
        return employeeServiceImp.addEmp();
    }

    @GetMapping("/getemp")
    public List<Employee> getEmp(){
        return employeeServiceImp.getEmp();
    }

    @GetMapping("/getById")
    public Employee getEmpById(){
        return employeeServiceImp.getEmpById();
    }

    @GetMapping("/bulk")
    public List<Employee> getByBulk() {
        return employeeServiceImp.getByBulk();
    }
}
