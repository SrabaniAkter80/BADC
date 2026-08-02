package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

public class SupplyReport {
    private String reportId;
    private String reportType;
    private String reportSummary;

    public SupplyReport(String reportId, String reportType, String reportSummary) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.reportSummary = reportSummary;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportSummary() {
        return reportSummary;
    }

    public void setReportSummary(String reportSummary) {
        this.reportSummary = reportSummary;
    }

    @Override
    public String toString() {
        return "SupplyReport{" +
                "reportId='" + reportId + '\'' +
                ", reportType='" + reportType + '\'' +
                ", reportSummary='" + reportSummary + '\'' +
                '}';
    }
}
