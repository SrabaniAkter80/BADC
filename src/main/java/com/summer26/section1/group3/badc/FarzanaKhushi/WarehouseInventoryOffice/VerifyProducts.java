package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

public class VerifyProducts {

    private String productId;
    private String productName;
    private String status;

    public VerifyProducts(String productId, String productName, String status) {
        this.productId = productId;
        this.productName = productName;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "VerifyProducts{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
