package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

public class Complaint {
    private String complaintId;
    private String farmerName;
    private String complaintType;
    private String status;
    private String details;

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "complaintId='" + complaintId + '\'' +
                ", farmerName='" + farmerName + '\'' +
                ", complaintType='" + complaintType + '\'' +
                ", status='" + status + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    public Complaint(String complaintId, String farmerName, String complaintType, String status, String details) {
        this.complaintId = complaintId;
        this.farmerName = farmerName;
        this.complaintType = complaintType;
        this.status = status;
        this.details = details;


    }
}
