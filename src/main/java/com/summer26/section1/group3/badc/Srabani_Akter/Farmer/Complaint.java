package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import java.io.Serializable;

public class Complaint implements Serializable {

    private String complaintCategory;
    private String complaintDetails;

    public Complaint(String complaintCategory,
                     String complaintDetails) {

        this.complaintCategory = complaintCategory;
        this.complaintDetails = complaintDetails;
    }

    public String getComplaintCategory() {
        return complaintCategory;
    }

    public String getComplaintDetails() {
        return complaintDetails;
    }

    public void setComplaintCategory(String complaintCategory) {
        this.complaintCategory = complaintCategory;
    }

    public void setComplaintDetails(String complaintDetails) {
        this.complaintDetails = complaintDetails;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "complaintCategory='" + complaintCategory + '\'' +
                ", complaintDetails='" + complaintDetails + '\'' +
                '}';
    }
}