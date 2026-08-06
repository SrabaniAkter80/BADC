package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import java.io.Serializable;

public class DeleveryConfirmation implements Serializable {
    private int orderId;
    private String productName;
    private String deleveryStatus;

    public DeleveryConfirmation() {
    }

    public DeleveryConfirmation(int orderId, String productName, String deleveryStatus) {
        this.orderId = orderId;
        this.productName = productName;
        this.deleveryStatus = deleveryStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDeleveryStatus() {
        return deleveryStatus;
    }

    public void setDeleveryStatus(String deleveryStatus) {
        this.deleveryStatus = deleveryStatus;
    }

    @Override
    public String toString() {
        return "DeleveryConfirmation{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", deleveryStatus='" + deleveryStatus + '\'' +
                '}';
    }
}
