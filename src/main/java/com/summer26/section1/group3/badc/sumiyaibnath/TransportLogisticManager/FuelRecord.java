package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import java.io.Serializable;
import java.time.LocalDate;

public class FuelRecord implements Serializable {
    private String recordId;
    private String transportId;
    private double fuelCost;
    private double maintenanceCost;
    private double distanceTravelled;
    private LocalDate date;

    public FuelRecord() {
    }

    public FuelRecord(String recordId, String transportId, double fuelCost, double maintenanceCost, double distanceTravelled, LocalDate date) {
        this.recordId = recordId;
        this.transportId = transportId;
        this.fuelCost = fuelCost;
        this.maintenanceCost = maintenanceCost;
        this.distanceTravelled = distanceTravelled;
        this.date = date;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FuelRecord{" +
                "recordId='" + recordId + '\'' +
                ", transportId='" + transportId + '\'' +
                ", fuelCost=" + fuelCost +
                ", maintenanceCost=" + maintenanceCost +
                ", distanceTravelled=" + distanceTravelled +
                ", date=" + date +
                '}';
    }
}
