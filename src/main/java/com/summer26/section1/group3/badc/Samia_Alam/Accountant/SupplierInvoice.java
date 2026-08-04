package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

public class SupplierInvoice {
    private String invoiceId;
    private String supplier;
    private String material;
    private double cost;

    public SupplierInvoice(String invoiceId, String supplier, String material, double cost) {
        this.invoiceId = invoiceId;
        this.supplier = supplier;
        this.material = material;
        this.cost = cost;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "SupplierInvoice{" +
                "invoiceId='" + invoiceId + '\'' +
                ", supplier='" + supplier + '\'' +
                ", material='" + material + '\'' +
                ", cost=" + cost +
                '}';
    }
}
