package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;

import java.io.Serializable;

public class Notification implements Serializable {

    private String notificationTitle;
    private String message;
    private String date;

    public Notification(String notificationTitle,String message,String date) {
        this.notificationTitle = notificationTitle;
        this.message = message;
        this.date = date;
    }
    public static void main(String[] args) {


        Notification notification1 = new Notification("About seeds related", "must attend on time", "5/9/2026");
        Notification notification2 = new Notification("About order related", "Be Prepare", "3/2/2026");
        Notification notification3 = new Notification("others", "Warning", "3/5/2025");
        BinaryFileUtil.appendObject("data/notifications.bin",notification1);
        BinaryFileUtil.appendObject("data/notifications.bin",notification2);
        BinaryFileUtil.appendObject("data/notifications.bin",notification3);

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
