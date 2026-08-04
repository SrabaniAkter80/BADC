package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

public class DealerDeposit {
    private String depositId;
    private String dealerId;
    private String challan;
    private double amount;

    public DealerDeposit(String depositId, String dealerId, String challan, double amount) {
        this.depositId = depositId;
        this.dealerId = dealerId;
        this.challan = challan;
        this.amount = amount;
    }

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getChallan() {
        return challan;
    }

    public void setChallan(String challan) {
        this.challan = challan;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "DealerDeposit{" +
                "depositId='" + depositId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", challan='" + challan + '\'' +
                ", amount=" + amount +
                '}';
    }
}
