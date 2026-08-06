package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

public class WarehouseSecurity {

    private String currentPassword;
    private String newPassword;

    public WarehouseSecurity() {
    }

    public WarehouseSecurity(String currentPassword, String newPassword) {
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public String toString() {
        return "WarehouseSecurity{" +
                "currentPassword='" + currentPassword + '\'' +
                ", newPassword='" + newPassword + '\'' +
                '}';
    }
}
