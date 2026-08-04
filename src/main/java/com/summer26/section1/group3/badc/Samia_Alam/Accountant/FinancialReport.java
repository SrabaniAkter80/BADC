package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

public class FinancialReport {
    private String quarter;
    private String report;

    public FinancialReport(String quarter, String report) {
        this.quarter = quarter;
        this.report = report;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    @Override
    public String toString() {
        return "FinancialReport{" +
                "quarter='" + quarter + '\'' +
                ", report='" + report + '\'' +
                '}';
    }
}
