package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;

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
    public static void main(String[] args) {
        Employee employee1 = new Employee("1", "Samia Alam", "Account Officer", "01890681565");
        Employee employee2 = new Employee("2", "Sumaiya Haque", "Field Officer", "01890681569");
        Employee employee3 = new Employee("3", "Sumaiya Ibnath", "Procurement Officer", "01890681578");
        Employee employee4 = new Employee("4", "Sumaiya Ibnath", "Transport & Logistic Manager", "018906815775");
        BinaryFileUtil.appendObject("data/accountofficer.bin", employee1);
        BinaryFileUtil.appendObject("data/fieldofficer.bin", employee2);
        BinaryFileUtil.appendObject("data/procurementofficer.bin", employee3);
        BinaryFileUtil.appendObject("data/transportlogisticmanager.bin", employee4);


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