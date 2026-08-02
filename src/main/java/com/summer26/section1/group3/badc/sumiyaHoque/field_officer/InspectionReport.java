package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

public class InspectionReport {
    private String reportId;
    private String inspectionType;
    private String findings;

    public InspectionReport(String reportId, String inspectionType, String findings) {
        this.reportId = reportId;
        this.inspectionType = inspectionType;
        this.findings = findings;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getInspectionType() {
        return inspectionType;
    }

    public void setInspectionType(String inspectionType) {
        this.inspectionType = inspectionType;
    }

    public String getFindings() {
        return findings;
    }

    public void setFindings(String findings) {
        this.findings = findings;
    }

    @Override
    public String toString() {
        return "InspectionReport{" +
                "reportId='" + reportId + '\'' +
                ", inspectionType='" + inspectionType + '\'' +
                ", findings='" + findings + '\'' +
                '}';
    }
}
