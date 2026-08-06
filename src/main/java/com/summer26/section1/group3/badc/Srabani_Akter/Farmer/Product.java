package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import java.io.Serializable;

public class Product implements Serializable {

    private String productName;
    private int productQuantity;
    private String availabilityStatus;
    private String category;

    public Product(String productName, int productQuantity,
                   String availabilityStatus, String category) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.availabilityStatus = availabilityStatus;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public String getCategory() {
        return category;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}