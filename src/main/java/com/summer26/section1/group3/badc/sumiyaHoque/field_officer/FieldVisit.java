package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import java.io.Serializable;

public class FieldVisit implements Serializable {
    private String areaId;
    private String areaName;
    private String farmerName;
    private String visitNotes;

    public FieldVisit(String areaId, String areaName, String farmerName, String visitNotes) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.farmerName = farmerName;
        this.visitNotes = visitNotes;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getVisitNotes() {
        return visitNotes;
    }

    public void setVisitNotes(String visitNotes) {
        this.visitNotes = visitNotes;
    }

    @Override
    public String toString() {
        return "FieldVisit{" +
                "areaId='" + areaId + '\'' +
                ", areaName='" + areaName + '\'' +
                ", farmerName='" + farmerName + '\'' +
                ", visitNotes='" + visitNotes + '\'' +
                '}';
    }
}
