package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

public class Contruct {
    private String contractId;
    private String contractTitle;
    private String agreementDetails;
    private String contractStatus;

    public Contruct(String contractId, String contractTitle, String agreementDetails, String contractStatus) {
        this.contractId = contractId;
        this.contractTitle = contractTitle;
        this.agreementDetails = agreementDetails;
        this.contractStatus = contractStatus;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractTitle() {
        return contractTitle;
    }

    public void setContractTitle(String contractTitle) {
        this.contractTitle = contractTitle;
    }

    public String getAgreementDetails() {
        return agreementDetails;
    }

    public void setAgreementDetails(String agreementDetails) {
        this.agreementDetails = agreementDetails;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    @Override
    public String toString() {
        return "Contruct{" +
                "contractId='" + contractId + '\'' +
                ", contractTitle='" + contractTitle + '\'' +
                ", agreementDetails='" + agreementDetails + '\'' +
                ", contractStatus='" + contractStatus + '\'' +
                '}';
    }
}
