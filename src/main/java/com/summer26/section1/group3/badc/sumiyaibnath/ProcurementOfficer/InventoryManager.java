package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.FileManager;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private static final ArrayList<Inventory> inventoryList = new ArrayList<>();
    private static final String FILE_NAME = "Inventory.bin";

    static {
        inventoryList.addAll(FileManager.loadFromFile(FILE_NAME));
    }

    public static List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public static void addOrUpdateInventory(Inventory inventory) {
        for (Inventory i : inventoryList) {
            if (i.getProductName().equalsIgnoreCase(inventory.getProductName())) {

                int currentStock = Integer.parseInt(i.getCurrentStock());
                int newStock = Integer.parseInt(inventory.getCurrentStock());

                i.setCurrentStock(String.valueOf(currentStock + newStock));
                i.setStockStatus(inventory.getStockStatus());
                i.setDemand(inventory.getDemand());

                FileManager.saveToFile(inventoryList, FILE_NAME);
                return;
            }
        }

        inventoryList.add(inventory);
        FileManager.saveToFile(inventoryList, FILE_NAME);
    }

    public static void updateInventory() {
        FileManager.saveToFile(inventoryList, FILE_NAME);
    }
}
