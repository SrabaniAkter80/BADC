package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import java.io.Serializable;

public class RestockingRequest implements Serializable {
    private String productName;
    private String stockStatus;
    private String requestedQuantity;
    private String demand;
    private String restockStatus;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getRequestedQuantity() {
        return requestedQuantity;
    }

    public void setRequestedQuantity(String requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }

    public String getRestockStatus() {
        return restockStatus;
    }

    public void setRestockStatus(String restockStatus) {
        this.restockStatus = restockStatus;
    }

    @Override
    public String toString() {
        return "RestockingRequest{" +
                "productName='" + productName + '\'' +
                ", stockStatus='" + stockStatus + '\'' +
                ", requestedQuantity='" + requestedQuantity + '\'' +
                ", demand='" + demand + '\'' +
                ", restockStatus='" + restockStatus + '\'' +
                '}';
    }

    public RestockingRequest(String productName, String stockStatus, String requestedQuantity, String demand, String restockStatus) {
        this.productName = productName;
        this.stockStatus = stockStatus;
        this.requestedQuantity = requestedQuantity;
        this.demand = demand;
        this.restockStatus = restockStatus;
    }
}
