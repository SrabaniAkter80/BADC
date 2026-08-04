package com.summer26.section1.group3.badc.Samia_Alam.Admin;

public class Announcement {
    private String targetAudience;
    private String noticeTitle;
    private String noticeContent;

    public Announcement(String targetAudience, String noticeTitle, String noticeContent) {
        this.targetAudience = targetAudience;
        this.noticeTitle = noticeTitle;
        this.noticeContent = noticeContent;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "targetAudience='" + targetAudience + '\'' +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                '}';
    }
}
