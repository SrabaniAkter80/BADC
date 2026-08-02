package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

public class SupplyDocument {
    private String documentId;
    private String documentType;
    private String fileName;
    private String uploadDate;

    public SupplyDocument(String documentId, String documentType, String fileName, String uploadDate) {
        this.documentId = documentId;
        this.documentType = documentType;
        this.fileName = fileName;
        this.uploadDate = uploadDate;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Override
    public String toString() {
        return "SupplyDocument{" +
                "documentId='" + documentId + '\'' +
                ", documentType='" + documentType + '\'' +
                ", fileName='" + fileName + '\'' +
                ", uploadDate='" + uploadDate + '\'' +
                '}';
    }
}
