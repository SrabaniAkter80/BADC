package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import java.io.Serializable;

public class ReportGeneration implements Serializable {
    private String reportType;

    public ReportGeneration() {
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    @Override
    public String toString() {
        return "ReportGeneration{" +
                "reportType='" + reportType + '\'' +
                '}';
    }
}
