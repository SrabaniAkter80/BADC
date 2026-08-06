package com.summer26.section1.group3.badc.Samia_Alam.Admin;

import java.io.Serializable;

public class UserManagement implements Serializable {

    private static final long serialVersionUID = 1L;
    private String fullName;
    private String username;
    private String password;
    private String role;
    private String contactNumber;
    private String email;


    public UserManagement(String fullName, String username, String password, String role, String contactNumber, String email) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.role = role;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserManagement{" +
                "fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

