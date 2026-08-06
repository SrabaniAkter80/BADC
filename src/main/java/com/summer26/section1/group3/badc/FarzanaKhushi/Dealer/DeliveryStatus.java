package com.summer26.section1.group3.badc.FarzanaKhushi.Dealer;

public class DeliveryStatus {

    private String orderId;
    private String product;
    private String status;

    public DeliveryStatus(String orderId, String product, String status) {
        this.orderId = orderId;
        this.product = product;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DeliveryStatus{" +
                "orderId='" + orderId + '\'' +
                ", product='" + product + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
