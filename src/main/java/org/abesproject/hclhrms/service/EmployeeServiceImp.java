package org.abesproject.hclhrms.service;

import org.abesproject.hclhrms.entity.Employee;
import org.abesproject.hclhrms.repository.EmpRepoImp;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class EmployeeServiceImp {
    private EmpRepoImp  empRepoImp;

    public EmployeeServiceImp(EmpRepoImp empRepoImp) {
        this.empRepoImp = empRepoImp;
    }

    public String addEmp(){
        Employee emp1 = new Employee(1,"Vishnu","FSD","JAVA","xy@gmail.com");
        empRepoImp.addEmp(emp1);
        return "success";
    }

    public List<Employee> getEmp(){
        return empRepoImp.getEmp();
    }

    public Employee getEmpById(){
        return empRepoImp.getEmpById(1);
    }

    public List<Employee> getByBulk() {
        List<Employee> employees = List.of(
                new Employee(2L, "Ram", "Teacher", "Backend", "ram@gmail.com"),
                new Employee(3L, "Shyam", "Student", "AI", "shyam@gmail.com"),
                new Employee(4L, "Geeta", "Developer", "React", "geeta@gmail.com"),
                new Employee(5L, "Babita", "Developer", "Spring", "babita@gmail.com")
        );

        return empRepoImp.addEmpBulk(employees);
    }
}
