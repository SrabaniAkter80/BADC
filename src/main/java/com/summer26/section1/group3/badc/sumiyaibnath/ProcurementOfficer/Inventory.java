package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import java.io.Serializable;

public class Inventory implements Serializable {
    private String productName;
    private String currentStock;
    private String stockStatus;
    private String demand;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(String currentStock) {
        this.currentStock = currentStock;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "productName='" + productName + '\'' +
                ", currentStock='" + currentStock + '\'' +
                ", stockStatus='" + stockStatus + '\'' +
                ", demand='" + demand + '\'' +
                '}';
    }

    public Inventory(String productName, String currentStock, String stockStatus, String demand) {
        this.productName = productName;
        this.currentStock = currentStock;
        this.stockStatus = stockStatus;
        this.demand = demand;
    }
}
