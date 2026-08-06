package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

public class ProductDistribution {
    private String productId;
    private int quantity;
    private String destination;

    public ProductDistribution(String productId, int quantity, String destination) {
        this.productId = productId;
        this.quantity = quantity;
        this.destination = destination;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "ProductDistribution{" +
                "productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", destination='" + destination + '\'' +
                '}';
    }
}
