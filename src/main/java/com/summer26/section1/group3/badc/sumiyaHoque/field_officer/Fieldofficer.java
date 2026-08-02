package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

public class Fieldofficer {
    private String officerId;
    private String name;
    private String phone;
    private String email;
    private String address;

    public Fieldofficer(String officerId, String name, String phone, String email, String address) {
        this.officerId = officerId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Fieldofficer{" +
                "officerId='" + officerId + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
