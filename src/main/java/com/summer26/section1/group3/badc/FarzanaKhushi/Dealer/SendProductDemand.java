package com.summer26.section1.group3.badc.FarzanaKhushi.Dealer;

public class SendProductDemand {

    private String productName;
    private int quantity;
    private String message;

    public SendProductDemand(String productName, int quantity, String message) {
        this.productName = productName;
        this.quantity = quantity;
        this.message = message;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SendProductDemand{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", message='" + message + '\'' +
                '}';
    }
}
