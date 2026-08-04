package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import java.io.Serializable;
import java.time.LocalDate;

public class EmployeeAttendance implements Serializable {

    private String employeeID;
    private String employeeName;
    private String attendanceRecord;
    private String workingStatus;
    private LocalDate date;

    public EmployeeAttendance(String employeeID,
                              String employeeName,
                              String attendanceRecord,
                              String workingStatus,
                              LocalDate date) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.attendanceRecord = attendanceRecord;
        this.workingStatus = workingStatus;
        this.date = date;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAttendanceRecord(String attendanceRecord) {
        this.attendanceRecord = attendanceRecord;
    }

    public void setWorkingStatus(String workingStatus) {
        this.workingStatus = workingStatus;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getAttendanceRecord() {
        return attendanceRecord;
    }

    public String getWorkingStatus() {
        return workingStatus;
    }

    public LocalDate getDate() {
        return date;
    }
}
