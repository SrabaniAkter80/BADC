package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import com.summer26.section1.group3.badc.utils.BinaryFileUtil;

import java.io.Serializable;

public class LeaveRequest implements Serializable {

    private String applicationID;
    private String employeeID;
    private String leaveType;
    private String applicationStatus;

    public LeaveRequest(String applicationID, String employeeID, String leaveType, String applicationStatus) {
        this.applicationID = applicationID;
        this.employeeID = employeeID;
        this.leaveType = leaveType;
        this.applicationStatus = applicationStatus;
    }
    public static void main(String[] args) {
        LeaveRequest L1 = new LeaveRequest("12","1", "For Vacation","Pending");
        LeaveRequest L2= new LeaveRequest("13","2","Others","Approved");
        LeaveRequest L3= new LeaveRequest("14","3","sick","Rejected");
        BinaryFileUtil.appendObject("data/LeaveRequest.bin", L1);
        BinaryFileUtil.appendObject("data/LeaveRequest.bin", L2);
        BinaryFileUtil.appendObject("data/LeaveRequest.bin", L3);



    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "applicationID='" + applicationID + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", leaveType='" + leaveType + '\'' +
                ", applicationStatus='" + applicationStatus + '\'' +
                '}';
    }
}