package org.abesproject.hclhrms.repository;

import org.abesproject.hclhrms.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo {
    String addEmp(Employee emp);
    List<Employee> addEmpBulk(List<Employee> bulkEmp);
    List<Employee> getEmp();
    Employee getEmpById(long empId);
    String deleteById(long empId);
    String updateById(long empId,Employee updateEmp);
}
