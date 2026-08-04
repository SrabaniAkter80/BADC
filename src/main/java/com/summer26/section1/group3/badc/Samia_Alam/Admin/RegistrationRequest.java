package com.summer26.section1.group3.badc.Samia_Alam.Admin;

public class RegistrationRequest {
    private int requestId;
    private String name;
    private String userType;
    private String status;

    public RegistrationRequest(int requestId, String name, String userType, String status) {
        this.requestId = requestId;
        this.name = name;
        this.userType = userType;
        this.status = status;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RegistrationRequest{" +
                "requestId=" + requestId +
                ", name='" + name + '\'' +
                ", userType='" + userType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
