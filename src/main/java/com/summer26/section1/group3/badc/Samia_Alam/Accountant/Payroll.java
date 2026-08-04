package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

public class Payroll {
    private String staffId;
    private String name;
    private String department;
    private double salary;

    public Payroll(String staffId, String name, String department, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
