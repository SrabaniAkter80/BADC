package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import com.summer26.section1.group3.badc.common.FileManager;

import java.util.ArrayList;

public class TransportIssueManager {

    private static final String FILE_NAME = "transportIssue.bin";
    private static ArrayList<TransportIssue> issueList =
            FileManager.loadFromFile(FILE_NAME);

    public static void addIssue(TransportIssue issue) {
        issueList.add(issue);
        save();
    }

    public static ArrayList<TransportIssue> getIssueList() {
        return issueList;
    }

    public static void removeIssue(TransportIssue issue) {
        issueList.remove(issue);
        save();
    }

    public static TransportIssue findIssue(String issueId) {
        for (TransportIssue issue : issueList) {
            if (issue.getIssueId().equalsIgnoreCase(issueId)) {
                return issue;
            }
        }
        return null;
    }

    public static ArrayList<TransportIssue> getIssuesByTransport(String transportId) {

        ArrayList<TransportIssue> list = new ArrayList<>();
        for (TransportIssue issue : issueList) {
            if (issue.getTransportId().equalsIgnoreCase(transportId)) {
                list.add(issue);
            }
        }
        return list;
    }

    public static void updateIssues() {
        save();
    }

    public static void save() {
        FileManager.saveToFile(issueList, FILE_NAME);
    }

    public static void reload() {
        issueList = FileManager.loadFromFile(FILE_NAME);
    }

}