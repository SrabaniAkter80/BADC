package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.FileManager;

import java.util.ArrayList;
import java.util.List;

public class SupplierManager {

    private static final ArrayList<Supplier> supplierList = new ArrayList<>();
    private static final String FileName = "Supplier.bin";

    static {
        supplierList.addAll(FileManager.loadFromFile(FileName));
        if (supplierList.isEmpty()) {
            supplierList.add(new Supplier("S001","Mr. Rashid","ABC ltd.","Active","4"));
            supplierList.add(new Supplier("S002","Mr. John","Green Tradings","Inactive","3.8"));
            supplierList.add(new Supplier("S003","Mr. Hassan","Chemical Institution","Blacklisted","1.3"));
            supplierList.add(new Supplier("S004","Mr. Taylor","Tea&Coffee House","Active","5"));

            FileManager.saveToFile(supplierList, FileName);
        }
    }

    public static List<Supplier> getSupplierList() {
        return supplierList;
    }

    public static void updateSupplier() {
        FileManager.saveToFile(supplierList, FileName);
    }
}