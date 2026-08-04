package com.summer26.section1.group3.badc.Samia_Alam.Admin;

public class DatabaseBackup {
    private String backupType;
    private String destination;
    private String backupDate;
    private String status;

    public DatabaseBackup(String backupType, String destination, String backupDate, String status) {
        this.backupType = backupType;
        this.destination = destination;
        this.backupDate = backupDate;
        this.status = status;
    }

    public String getBackupType() {
        return backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getBackupDate() {
        return backupDate;
    }

    public void setBackupDate(String backupDate) {
        this.backupDate = backupDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DatabaseBackup{" +
                "backupType='" + backupType + '\'' +
                ", destination='" + destination + '\'' +
                ", backupDate='" + backupDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
