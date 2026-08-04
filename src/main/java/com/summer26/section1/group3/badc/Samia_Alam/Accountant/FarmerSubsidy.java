package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

public class FarmerSubsidy {
    private String farmerId;
    private String name;
    private double landArea;
    private double subsidyAmount;

    public FarmerSubsidy(String farmerId, String name, double landArea, double subsidyAmount) {
        this.farmerId = farmerId;
        this.name = name;
        this.landArea = landArea;
        this.subsidyAmount = subsidyAmount;
    }

    public String getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLandArea() {
        return landArea;
    }

    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }

    public double getSubsidyAmount() {
        return subsidyAmount;
    }

    public void setSubsidyAmount(double subsidyAmount) {
        this.subsidyAmount = subsidyAmount;
    }

    @Override
    public String toString() {
        return "FarmerSubsidy{" +
                "farmerId='" + farmerId + '\'' +
                ", name='" + name + '\'' +
                ", landArea=" + landArea +
                ", subsidyAmount=" + subsidyAmount +
                '}';
    }
}
