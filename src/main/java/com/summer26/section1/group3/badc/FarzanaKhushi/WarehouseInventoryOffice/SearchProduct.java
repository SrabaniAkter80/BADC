package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

public class SearchProduct {

    private String productId;
    private String productName;
    private String category;
    private int quantity;

    public SearchProduct(String productId, String productName, String category, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.quantity = quantity;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SearchProduct{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
