package com.summer26.section1.group3.badc.FarzanaKhushi.Dealer;

public class MessageFieldOfficer {

    private String subject;
    private String message;

    public MessageFieldOfficer(String subject, String message) {
        this.subject = subject;
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageFieldOfficer{" +
                "subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
