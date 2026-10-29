package com.abes.hrmsdatabase.service;

import com.abes.hrmsdatabase.model.Attendance;

import com.abes.hrmsdatabase.repository.AttendanceRepository;
import com.abes.hrmsdatabase.repository.AttendanceRepository;
import com.abes.hrmsdatabase.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

public class AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public String markAttendence(Attendance attendence) {

        // Get employee ID
        long empid = attendence.getEmployee().getEmpId();

        // Check whether employee exists
        if (!employeeRepository.existsById(empid)) {
            return "Employee does not exist";
        }

        // Get today's date
        LocalDate today = LocalDate.now();

        // Check whether attendance is already marked
        if (attendanceRepository.existsByEmployee_EmpIdAndAttendancedate(empid, today)) {
            return "Attendance already marked for today";
        }

        // Set today's date
        attendence.setAttendancedate(today);

        // Save attendance
        attendanceRepository.save(attendence);

        return "Attendance marked successfully";
    }
}
