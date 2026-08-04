package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import java.io.Serializable;

public class Product implements Serializable {

    private String productId;
    private String productName;
    private double unitPrice;
    private int quantity;
    private String supplierId;

    public Product() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSupplierId() {
        return supplierId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", supplierId='" + supplierId + '\'' +
                '}';
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public Product(String productId, String productName, double unitPrice, int quantity, String supplierId) {
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.supplierId = supplierId;
    }
}
