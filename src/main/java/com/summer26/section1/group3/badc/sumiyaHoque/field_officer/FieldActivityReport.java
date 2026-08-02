package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

public class FieldActivityReport {
    private String reportId;
    private String reportType;
    private String reportDetails;

    public FieldActivityReport(String reportId, String reportType, String reportDetails) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.reportDetails = reportDetails;
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

    public String getReportDetails() {
        return reportDetails;
    }

    public void setReportDetails(String reportDetails) {
        this.reportDetails = reportDetails;
    }

    @Override
    public String toString() {
        return "FieldActivityReport{" +
                "reportId='" + reportId + '\'' +
                ", reportType='" + reportType + '\'' +
                ", reportDetails='" + reportDetails + '\'' +
                '}';
    }
}
