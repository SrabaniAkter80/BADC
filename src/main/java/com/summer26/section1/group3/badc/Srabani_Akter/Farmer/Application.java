package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;


import java.io.Serializable;

public class Application implements Serializable {

    private String applicationType;
    private String submissionDate;
    private String currentStatus;

    public Application(String applicationType,
                       String submissionDate,
                       String currentStatus) {

        this.applicationType = applicationType;
        this.submissionDate = submissionDate;
        this.currentStatus = currentStatus;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public String toString() {
        return "Application{" +
                "applicationType='" + applicationType + '\'' +
                ", submissionDate='" + submissionDate + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                '}';
    }
}