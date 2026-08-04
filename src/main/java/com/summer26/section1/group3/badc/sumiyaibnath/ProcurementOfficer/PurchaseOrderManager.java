package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.FileManager;

import java.util.ArrayList;
import java.util.List;

public class PurchaseOrderManager {

    private static final ArrayList<PurchaseOrder> orderList = new ArrayList<>();
    private static final String FILE_NAME = "PurchaseOrder.bin";

    static {
        orderList.addAll(FileManager.loadFromFile(FILE_NAME));
    }

    public static List<PurchaseOrder> getOrderList() {
        return orderList;
    }

    public static void approveOrder(PurchaseOrder order) {
        orderList.add(order);
        FileManager.saveToFile(orderList, FILE_NAME);
    }

    public static void cancelOrder(PurchaseOrder order) {
        orderList.remove(order);
        FileManager.saveToFile(orderList, FILE_NAME);
    }
}
