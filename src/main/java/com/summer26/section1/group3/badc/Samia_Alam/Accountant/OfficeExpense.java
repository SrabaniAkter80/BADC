package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

public class OfficeExpense {
    private String expenseType;
    private String voucherId;
    private double amount;
    private String expenseDate;


    public OfficeExpense(String expenseType, String voucherId, double amount, String expenseDate) {
        this.expenseType = expenseType;
        this.voucherId = voucherId;
        this.amount = amount;
        this.expenseDate = expenseDate;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(String expenseDate) {
        this.expenseDate = expenseDate;
    }


    @Override
    public String toString() {
        return "OfficeExpense{" +
                "expenseType='" + expenseType + '\'' +
                ", voucherId='" + voucherId + '\'' +
                ", amount=" + amount +
                ", expenseDate='" + expenseDate + '\'' +
                '}';
    }
}
