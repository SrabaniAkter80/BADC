package com.summer26.section1.group3.badc.Samia_Alam.Admin;

public class ComplaintManagement {
    private String complaintId;
    private String farmerDealer;
    private String status;
    private String description;
    private String fieldOfficer;

    public ComplaintManagement(String complaintId, String farmerDealer, String status, String description, String fieldOfficer) {
        this.complaintId = complaintId;
        this.farmerDealer = farmerDealer;
        this.status = status;
        this.description = description;
        this.fieldOfficer = fieldOfficer;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getFarmerDealer() {
        return farmerDealer;
    }

    public void setFarmerDealer(String farmerDealer) {
        this.farmerDealer = farmerDealer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFieldOfficer() {
        return fieldOfficer;
    }

    public void setFieldOfficer(String fieldOfficer) {
        this.fieldOfficer = fieldOfficer;
    }

    @Override
    public String toString() {
        return "ComplaintManagement{" +
                "complaintId='" + complaintId + '\'' +
                ", farmerDealer='" + farmerDealer + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", fieldOfficer='" + fieldOfficer + '\'' +
                '}';
    }
}
