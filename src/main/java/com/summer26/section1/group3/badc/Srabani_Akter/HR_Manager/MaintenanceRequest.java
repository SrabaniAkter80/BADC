package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;


import java.io.Serializable;

public class MaintenanceRequest implements Serializable {

    private String equipmentType;
    private String issueDescription;

    public MaintenanceRequest(String equipmentType, String issueDescription) {
        this.equipmentType = equipmentType;
        this.issueDescription = issueDescription;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    @Override
    public String toString() {
        return "MaintenanceRequest{" +
                "equipmentType='" + equipmentType + '\'' +
                ", issueDescription='" + issueDescription + '\'' +
                '}';
    }
}