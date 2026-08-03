package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import java.io.Serializable;
import java.time.LocalDate;

public class Announcement implements Serializable {
    private String title;
    private String message;
    private String sender;
    private LocalDate dateTime;

    public Announcement(String title, String message, String sender) {
        this.title = title;
        this.message = message;
        this.sender = sender;
        this.dateTime = LocalDate.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", sender='" + sender + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}