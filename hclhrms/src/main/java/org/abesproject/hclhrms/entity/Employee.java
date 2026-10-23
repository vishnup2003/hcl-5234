package org.abesproject.hclhrms.entity;

import org.springframework.stereotype.Component;


public class Employee {
    private long emp_id;
    private String emp_Name;
    private String designation;
    private String progStack;
    private String email;


    public Employee(long emp_id, String emp_Name, String designation, String progStack, String email) {
        this.emp_id = emp_id;
        this.emp_Name = emp_Name;
        this.designation = designation;
        this.progStack = progStack;
        this.email = email;
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getProgStack() {
        return progStack;
    }

    public void setProgStack(String progStack) {
        this.progStack = progStack;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
