package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import java.io.Serializable;

public class Supplier implements Serializable {
    String supplierId;
    String supplierName;
    String companyName;
    String productName;
    String status;
    String rating;
    String quality;
    Double unitPrice;

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", productName='" + productName + '\'' +
                ", status='" + status + '\'' +
                ", rating='" + rating + '\'' +
                ", quality='" + quality + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }

    public Supplier(String supplierId, String supplierName, String companyName, String productName, String status, String rating, String quality, Double unitPrice) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.companyName = companyName;
        this.productName = productName;
        this.status = status;
        this.rating = rating;
        this.quality = quality;
        this.unitPrice = unitPrice;
    }
}

