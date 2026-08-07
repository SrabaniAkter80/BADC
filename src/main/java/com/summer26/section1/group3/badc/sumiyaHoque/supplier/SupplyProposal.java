package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import java.io.Serializable;

public class SupplyProposal implements Serializable {
    private String proposalId;
    private String productCategory;
    private int quantity;
    private String proposalDetails;
    private String status;

    public SupplyProposal(String proposalId, String productCategory, int quantity, String proposalDetails, String status) {
        this.proposalId = proposalId;
        this.productCategory = productCategory;
        this.quantity = quantity;
        this.proposalDetails = proposalDetails;
        this.status = status;
    }

    public String getProposalId() {
        return proposalId;
    }

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProposalDetails() {
        return proposalDetails;
    }

    public void setProposalDetails(String proposalDetails) {
        this.proposalDetails = proposalDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SupplyProposal{" +
                "proposalId='" + proposalId + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", quantity=" + quantity +
                ", proposalDetails='" + proposalDetails + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
