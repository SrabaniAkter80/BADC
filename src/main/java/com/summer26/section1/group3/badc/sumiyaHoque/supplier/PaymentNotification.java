package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

public class PaymentNotification {
    private String notificationId;
    private String paymentAmount;
    private String paymentDate;
    private String status;

    public PaymentNotification(String notificationId, String paymentAmount, String paymentDate, String status) {
        this.notificationId = notificationId;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
        this.status = status;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PaymentNotification{" +
                "notificationId='" + notificationId + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
