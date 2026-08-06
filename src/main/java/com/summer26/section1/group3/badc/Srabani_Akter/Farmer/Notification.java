package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;
import java.io.Serializable;

public class Notification implements Serializable {

    private String notificationTitle;
    private String message;
    private String date;

    public Notification(String notificationTitle,
                        String message,
                        String date) {

        this.notificationTitle = notificationTitle;
        this.message = message;
        this.date = date;
    }

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationTitle='" + notificationTitle + '\'' +
                ", message='" + message + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
