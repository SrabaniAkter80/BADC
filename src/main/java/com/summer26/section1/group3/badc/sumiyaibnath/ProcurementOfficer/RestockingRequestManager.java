package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.FileManager;

import java.util.ArrayList;
import java.util.List;

public class RestockingRequestManager {

    private static final ArrayList<RestockingRequest> requestList = new ArrayList<>();
    private static final String FILE_NAME = "RestockingRequest.bin";

    static {
        requestList.addAll(FileManager.loadFromFile(FILE_NAME));
    }

    public static List<RestockingRequest> getRequestList() {
        return requestList;
    }

    public static void addRequest(RestockingRequest request) {
        requestList.add(request);
        FileManager.saveToFile(requestList, FILE_NAME);
    }

    public static void deleteRequest(RestockingRequest request) {
        requestList.remove(request);
        FileManager.saveToFile(requestList, FILE_NAME);
    }

}
