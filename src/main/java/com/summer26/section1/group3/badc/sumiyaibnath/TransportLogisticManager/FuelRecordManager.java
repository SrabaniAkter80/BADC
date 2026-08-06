package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import com.summer26.section1.group3.badc.common.FileManager;

import java.util.ArrayList;

public class FuelRecordManager {

    private static final String FILE_NAME = "fuelRecord.bin";
    private static ArrayList<FuelRecord> fuelRecordList =
            FileManager.loadFromFile(FILE_NAME);

    public static void addFuelRecord(FuelRecord record) {
        fuelRecordList.add(record);
        save();
    }

    public static ArrayList<FuelRecord> getFuelRecordList() {
        return fuelRecordList;
    }

    public static void removeFuelRecord(FuelRecord record) {
        fuelRecordList.remove(record);
        save();
    }

    public static FuelRecord findRecord(String recordId) {
        for (FuelRecord record : fuelRecordList) {
            if (record.getRecordId().equalsIgnoreCase(recordId)) {
                return record;
            }
        }
        return null;
    }

    public static ArrayList<FuelRecord> getRecordsByTransport(String transportId) {

        ArrayList<FuelRecord> list = new ArrayList<>();
        for (FuelRecord record : fuelRecordList) {
            if (record.getTransportId().equalsIgnoreCase(transportId)) {
                list.add(record);
            }
        }
        return list;
    }

    public static void updateFuelRecords() {
        save();
    }

    public static void save() {
        FileManager.saveToFile(fuelRecordList, FILE_NAME);
    }

    public static void reload() {
        fuelRecordList = FileManager.loadFromFile(FILE_NAME);
    }

}