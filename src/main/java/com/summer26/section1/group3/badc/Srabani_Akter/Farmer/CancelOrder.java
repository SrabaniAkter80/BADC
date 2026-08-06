package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import java.io.Serializable;

public class CancelOrder implements Serializable {
    private String productName;
    private int orderId;
    private float quantity;

    public CancelOrder() {
    }

    public CancelOrder(String productName, int orderId, float quantity) {
        this.productName = productName;
        this.orderId = orderId;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CancelOrder{" +
                "productName='" + productName + '\'' +
                ", orderId=" + orderId +
                ", quantity=" + quantity +
                '}';
    }
}
