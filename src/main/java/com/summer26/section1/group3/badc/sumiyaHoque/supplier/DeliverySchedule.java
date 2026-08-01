package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

public class DeliverySchedule {
    private String scheduleId;
    private String deliveryDate;
    private String deliveryLocation;
    private String status;

    public DeliverySchedule(String scheduleId, String deliveryDate, String deliveryLocation, String status) {
        this.scheduleId = scheduleId;
        this.deliveryDate = deliveryDate;
        this.deliveryLocation = deliveryLocation;
        this.status = status;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DeliverySchedule{" +
                "scheduleId='" + scheduleId + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", deliveryLocation='" + deliveryLocation + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
