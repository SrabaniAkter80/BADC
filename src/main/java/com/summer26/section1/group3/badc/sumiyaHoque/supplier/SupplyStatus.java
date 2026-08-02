package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

public class SupplyStatus {
    private String requestId;
    private String productCategory;
    private int quantity;
    private String status;

    public SupplyStatus(String requestId, String productCategory, int quantity, String status) {
        this.requestId = requestId;
        this.productCategory = productCategory;
        this.quantity = quantity;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SupplyStatus{" +
                "requestId='" + requestId + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                '}';
    }
}
