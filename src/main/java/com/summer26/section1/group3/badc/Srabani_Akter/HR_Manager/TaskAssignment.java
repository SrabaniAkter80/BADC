package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import java.io.Serializable;
import java.time.LocalDate;

public class TaskAssignment implements Serializable {

    private String employeeID;
    private String taskDescription;
    private LocalDate dueDate;

    public TaskAssignment(String employeeID, String taskDescription, LocalDate dueDate) {
        this.employeeID = employeeID;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "TaskAssignment{" +
                "employeeID='" + employeeID + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }
}