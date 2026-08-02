package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

public class Fielddocument {
    private String documentId;
    private String fileName;
    private String description;

    public Fielddocument(String documentId, String fileName, String description) {
        this.documentId = documentId;
        this.fileName = fileName;
        this.description = description;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Fielddocument{" +
                "documentId='" + documentId + '\'' +
                ", fileName='" + fileName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
