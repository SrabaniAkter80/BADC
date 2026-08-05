package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import java.io.Serializable;

public class EmployeeInfo implements Serializable {
    private String employeeId;
    private String name;
    private String designation;
    private String contactInformation;

    public EmployeeInfo() {
    }

    public EmployeeInfo(String employeeId, String name, String designation, String contactInformation) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.contactInformation = contactInformation;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", contactInformation='" + contactInformation + '\'' +
                '}';
    }
}
