package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.FileManager;

import java.util.ArrayList;

public class ProductManager {

    private static final String FILE_NAME = "Product.bin";
    private static ArrayList<Product> productList = FileManager.loadFromFile(FILE_NAME);

    public static ArrayList<Product> getProductList() {
        return productList;
    }

    public static void addProduct(Product product) {
        productList.add(product);
        saveToFile();
    }

    public static void removeProduct(Product product) {
        productList.remove(product);
        saveToFile();
    }

    public static Product searchProduct(String productId) {
        for (Product product : productList) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    public static void updateProduct() {
        saveToFile();
    }

    public static void saveToFile() {
        FileManager.saveToFile(productList, FILE_NAME);
    }

    public static void loadFromFile() {
        productList = FileManager.loadFromFile(FILE_NAME);
    }
}