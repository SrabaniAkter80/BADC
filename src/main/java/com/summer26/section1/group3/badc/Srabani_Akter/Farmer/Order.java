package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import java.io.Serializable;

public class Order implements Serializable {

    private int orderID;
    private String productCategory;
    private int quantity;
    private String status;


    public Order(String productCategory, int quantity) {
        this.productCategory = productCategory;
        this.quantity = quantity;
        this.status = "Pending";
    }

    public Order(int orderID, String productCategory, int quantity, String status) {
        this.orderID = orderID;
        this.productCategory = productCategory;
        this.quantity = quantity;
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", productCategory='" + productCategory + '\'' +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                '}';
    }
}