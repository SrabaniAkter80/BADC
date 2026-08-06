package com.summer26.section1.group3.badc.Samia_Alam.Admin;
import java.io.Serializable;

public class ActivityMonitoring implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userId;
    private String action;
    private String timestamp;

    public ActivityMonitoring(String userId, String action, String timestamp) {
        this.userId = userId;
        this.action = action;
        this.timestamp = timestamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ActivityMonitoring{" +
                "userId='" + userId + '\'' +
                ", action='" + action + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
