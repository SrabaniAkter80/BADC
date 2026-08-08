package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import com.summer26.section1.group3.badc.utils.BinaryFileUtil;

import java.io.Serializable;

public class Complaint implements Serializable {

    private String complaintCategory;
    private String complaintDetails;

    public Complaint(String complaintCategory,
                     String complaintDetails) {

        this.complaintCategory = complaintCategory;
        this.complaintDetails = complaintDetails;
    }

        public static void main(String[] args){
            Complaint complaint1 = new Complaint("Products","This products is unavailable");
            Complaint complaint2 = new Complaint("Services","Must be active to give service");
            Complaint complaint3 = new Complaint("Application Process","Have an error in this running process");

            BinaryFileUtil.appendObject("data/complaints.bin",complaint1);
            BinaryFileUtil.appendObject("data/complaints.bin",complaint2);
            BinaryFileUtil.appendObject("data/complaints.bin",complaint3);
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