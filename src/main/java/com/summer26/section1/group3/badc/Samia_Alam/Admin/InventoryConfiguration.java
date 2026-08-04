package com.summer26.section1.group3.badc.Samia_Alam.Admin;

public class InventoryConfiguration {
    private String productId;
    private String productName;
    private String warehouse;
    private int quantity;
    private int minimumThreshold;

    public InventoryConfiguration(String productId, String productName, String warehouse, int quantity, int minimumThreshold) {
        this.productId = productId;
        this.productName = productName;
        this.warehouse = warehouse;
        this.quantity = quantity;
        this.minimumThreshold = minimumThreshold;
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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMinimumThreshold() {
        return minimumThreshold;
    }

    public void setMinimumThreshold(int minimumThreshold) {
        this.minimumThreshold = minimumThreshold;
    }

    @Override
    public String toString() {
        return "InventoryConfiguration{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", warehouse='" + warehouse + '\'' +
                ", quantity=" + quantity +
                ", minimumThreshold=" + minimumThreshold +
                '}';
    }
}
