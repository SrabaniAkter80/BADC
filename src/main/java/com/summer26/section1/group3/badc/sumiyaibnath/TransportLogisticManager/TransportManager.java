package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import com.summer26.section1.group3.badc.common.FileManager;

import java.util.ArrayList;

public class TransportManager {

    private static final String FILE_NAME = "transport.bin";
    private static ArrayList<Transport> transportList =
            FileManager.loadFromFile(FILE_NAME);

    public static void addTransport(Transport transport) {
        transportList.add(transport);
        save();
    }

    public static ArrayList<Transport> getTransportList() {
        return transportList;
    }

    public static void removeTransport(Transport transport) {
        transportList.remove(transport);
        save();
    }

    public static Transport findTransport(String transportId) {
        for (Transport transport : transportList) {
            if (transport.getTransportId().equalsIgnoreCase(transportId)) {
                return transport;
            }
        }
        return null;
    }

    public static boolean transportExists(String transportId) {
        return findTransport(transportId) != null;
    }

    public static boolean isScheduled(String transportId) {
        Transport transport = findTransport(transportId);
        return transport != null &&
                "Scheduled".equalsIgnoreCase(transport.getStatus());
    }

    public static boolean isAssigned(String transportId) {
        Transport transport = findTransport(transportId);
        return transport != null &&
                "Assigned".equalsIgnoreCase(transport.getStatus());
    }

    public static void updateTransport() {
        save();
    }

    public static void save() {
        FileManager.saveToFile(transportList, FILE_NAME);
    }

    public static void reload() {
        transportList = FileManager.loadFromFile(FILE_NAME);
    }

}
