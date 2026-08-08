package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import com.summer26.section1.group3.badc.utils.BinaryFileUtil;

import java.io.Serializable;
import java.time.LocalDate;

public class EmployeeAttendance implements Serializable {

    private String employeeID;
    private String employeeName;
    private String attendanceRecord;
    private String workingStatus;
    private LocalDate date;

    public EmployeeAttendance(String employeeID,String employeeName,String attendanceRecord,String workingStatus, LocalDate date) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.attendanceRecord = attendanceRecord;
        this.workingStatus = workingStatus;
        this.date = date;
    }
    public static void main(String[] args) {
        EmployeeAttendance employee1 = new EmployeeAttendance("1", "Samia Alam", "Good", "Present",LocalDate.of(2026,5,5));
        EmployeeAttendance employee2 = new EmployeeAttendance("2", "Sumaiya Haque", "Always attend", "Present",LocalDate.of(2026,6,8));
        EmployeeAttendance employee3 = new EmployeeAttendance("3", "Sumaiya Ibnath", "Sometimes absent", "Absent",LocalDate.of(2026,2,2));
        EmployeeAttendance employee4 = new EmployeeAttendance("4", "Farjana Khusi", "Absent rate is hight", "absent",LocalDate.of(2025,4,3));
        BinaryFileUtil.appendObject("data/EmployeeAttendance.bin", employee1);
        BinaryFileUtil.appendObject("data/EmployeeAttendance.bin", employee2);
        BinaryFileUtil.appendObject("data/EmployeeAttendance.bin", employee3);
        BinaryFileUtil.appendObject("data/EmployeeAttendance.bin", employee4);


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

    @Override
    public String toString() {
        return "EmployeeAttendance{" +
                "employeeID='" + employeeID + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", attendanceRecord='" + attendanceRecord + '\'' +
                ", workingStatus='" + workingStatus + '\'' +
                ", date=" + date +
                '}';
    }
}
