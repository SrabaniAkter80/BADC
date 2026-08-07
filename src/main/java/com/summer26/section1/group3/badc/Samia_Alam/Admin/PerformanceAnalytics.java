package com.summer26.section1.group3.badc.Samia_Alam.Admin;

import java.io.Serializable;

public class PerformanceAnalytics implements Serializable {

    private static final long serialVersionUID = 1L;

    private String month;
    private String category;
    private int value;

    public PerformanceAnalytics(String month, String category, int value) {
        this.month = month;
        this.category = category;
        this.value = value;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PerformanceAnalytics{" +
                "month='" + month + '\'' +
                ", category='" + category + '\'' +
                ", value=" + value +
                '}';
    }
}