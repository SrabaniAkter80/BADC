package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

public class FarmerApplication {
    private String applicationId;
    private String farmerName;
    private String applicationType;
    private String status;

    public FarmerApplication(String applicationId, String farmerName, String applicationType, String status) {
        this.applicationId = applicationId;
        this.farmerName = farmerName;
        this.applicationType = applicationType;
        this.status = status;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FarmerApplication{" +
                "applicationId='" + applicationId + '\'' +
                ", farmerName='" + farmerName + '\'' +
                ", applicationType='" + applicationType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
