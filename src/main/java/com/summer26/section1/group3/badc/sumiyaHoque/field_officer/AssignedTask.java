package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

public class AssignedTask {
    private String taskId;
    private String taskName;
    private String dueDate;
    private String status;

    public AssignedTask(String taskId, String taskName, String dueDate, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AssignedTask{" +
                "taskId='" + taskId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
