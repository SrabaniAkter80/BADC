package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import java.io.Serializable;
import java.time.LocalDate;

public class TransportIssue implements Serializable {
    private String issueId;
    private String transportId;
    private String issueType;
    private String description;
    private String status;
    private LocalDate reportedDate;

    public TransportIssue(String issueId, String transportId, String issueType, String description, String status, LocalDate reportedDate) {
        this.issueId = issueId;
        this.transportId = transportId;
        this.issueType = issueType;
        this.description = description;
        this.status = status;
        this.reportedDate = reportedDate;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(LocalDate reportedDate) {
        this.reportedDate = reportedDate;
    }

    @Override
    public String toString() {
        return "TransportIssue{" +
                "issueId='" + issueId + '\'' +
                ", transportId='" + transportId + '\'' +
                ", issueType='" + issueType + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", reportedDate=" + reportedDate +
                '}';
    }

    public TransportIssue() {
    }

}
