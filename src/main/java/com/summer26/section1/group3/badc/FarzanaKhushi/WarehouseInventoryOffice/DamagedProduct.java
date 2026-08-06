package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

public class DamagedProduct {
    private String productId;
    private String productName;
    private String damageReason;

    public DamagedProduct(String productId, String productName, String damageReason) {
        this.productId = productId;
        this.productName = productName;
        this.damageReason = damageReason;
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

    public String getDamageReason() {
        return damageReason;
    }

    public void setDamageReason(String damageReason) {
        this.damageReason = damageReason;
    }

    @Override
    public String toString() {
        return "DamagedProduct{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", damageReason='" + damageReason + '\'' +
                '}';
    }
}
