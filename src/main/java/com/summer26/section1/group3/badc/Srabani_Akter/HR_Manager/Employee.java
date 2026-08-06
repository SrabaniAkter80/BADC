package com.summer26.section1.group3.badc.common;
import java.io.Serializable;

public class Employee implements Serializable {

    private String employeeID;
    private String name;
    private String designation;
    private String contactInformation;

    public Employee(String employeeID, String name,String designation, String contactInformation) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
        this.contactInformation = contactInformation;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", contactInformation='" + contactInformation + '\'' +
                '}';
    }
}