package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.FileManager;

import java.util.ArrayList;
import java.util.List;

public class SupplierManager {

    private static final ArrayList<Supplier> supplierList = new ArrayList<>();
    private static final String FILE_NAME = "Supplier.bin";

    static {
        supplierList.addAll(FileManager.loadFromFile(FILE_NAME));
    }

    public static List<Supplier> getSupplierList() {
        return supplierList;
    }

    public static void addSupplier(Supplier supplier) {
        supplierList.add(supplier);
        FileManager.saveToFile(supplierList, FILE_NAME);
    }

    public static void deleteSupplier(Supplier supplier) {
        supplierList.remove(supplier);
        FileManager.saveToFile(supplierList, FILE_NAME);
    }

    public static void updateSupplier() {
        FileManager.saveToFile(supplierList, FILE_NAME);
    }
}