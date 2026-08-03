package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import java.io.Serializable;

public class LeaveRequest implements Serializable {

    private String applicationID;
    private String employeeID;
    private String leaveType;
    private String applicationStatus;

    public LeaveRequest(String applicationID, String employeeID,
                        String leaveType, String applicationStatus) {
        this.applicationID = applicationID;
        this.employeeID = employeeID;
        this.leaveType = leaveType;
        this.applicationStatus = applicationStatus;
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
}