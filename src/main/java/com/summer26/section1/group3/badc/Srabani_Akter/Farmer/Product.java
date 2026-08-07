package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import com.summer26.section1.group3.badc.utils.BinaryFileUtil;

import java.io.Serializable;

public class Product implements Serializable {

    private String productName;
    private int productQuantity;
    private String availabilityStatus;
    private String category;
    public static void main(String[] args){
        Product p1 = new Product("Seeds",1, "Active","Seeds");
        Product p2 = new Product("Fertilizes",1, "InActive","Fertilizers");
        Product p3 = new Product("Agricultural Products",1, "Active","Agricultural Products");
        BinaryFileUtil.appendObject("data/products.bin",p1);
        BinaryFileUtil.appendObject("data/products.bin",p2);
        BinaryFileUtil.appendObject("data/products.bin",p3);


    }

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