package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import java.io.Serializable;

public class ProductList implements Serializable {
    private String productCategory;
    private float productQuantity;
    private String availableStatus;

    public ProductList() {
    }

    public ProductList(String productCategory, float productQuantity, String availableStatus) {
        this.productCategory = productCategory;
        this.productQuantity = productQuantity;
        this.availableStatus = availableStatus;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public float getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(float productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getAvailableStatus() {
        return availableStatus;
    }

    public void setAvailableStatus(String availableStatus) {
        this.availableStatus = availableStatus;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productCategory='" + productCategory + '\'' +
                ", productQuantity=" + productQuantity +
                ", availableStatus='" + availableStatus + '\'' +
                '}';
    }
}
