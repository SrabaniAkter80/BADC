package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import java.io.Serializable;
import java.time.LocalDate;

public class Transport implements Serializable {
    private String transportId;
    private String destination;
    private LocalDate scheduledDate;
    private String driverName;
    private String vehicleId;
    private LocalDate dispatchDate;
    private String status;
    private LocalDate assignmentDate;

    @Override
    public String toString() {
        return "Transport{" +
                "transportId='" + transportId + '\'' +
                ", destination='" + destination + '\'' +
                ", scheduledDate=" + scheduledDate +
                ", driverName='" + driverName + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                ", dispatchDate=" + dispatchDate +
                ", status='" + status + '\'' +
                ", assignmentDate=" + assignmentDate +
                ", warehouse='" + warehouse + '\'' +
                ", farm='" + farm + '\'' +
                '}';
    }

    private String warehouse;

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }

    private String farm;

    public Transport(String warehouse, String farm) {
        this.warehouse = warehouse;
        this.farm = farm;
    }

    public LocalDate getAssignmentDate() {
        return assignmentDate;
    }

    public void setAssignmentDate(LocalDate assignmentDate) {
        this.assignmentDate = assignmentDate;
    }

    public Transport(LocalDate assignmentDate) {
        this.assignmentDate = assignmentDate;
    }

    public Transport() {
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(LocalDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public LocalDate getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(LocalDate dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Transport(String transportId, String destination, LocalDate scheduledDate, String driverName, String vehicleId, LocalDate dispatchDate, String status) {
        this.transportId = transportId;
        this.destination = destination;
        this.scheduledDate = scheduledDate;
        this.driverName = driverName;
        this.vehicleId = vehicleId;
        this.dispatchDate = dispatchDate;
        this.status = status;
    }
}
