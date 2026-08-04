package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import java.io.Serializable;

public class Supplier implements Serializable {
    String supplierId;
    String supplierName;
    String companyName;
    String productName;
    String status;
    String rating;

    public Supplier(String supplierId, String supplierName, String companyName, String productName, String status, String rating) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.companyName = companyName;
        this.productName = productName;
        this.status = status;
        this.rating = rating;
    }

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

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", productName='" + productName + '\'' +
                ", status='" + status + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}

