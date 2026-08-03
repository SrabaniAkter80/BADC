package com.summer26.section1.group3.badc.common;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public static <T> void saveToFile(ArrayList<T> list, String fileName) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(list);
            out.close();
        } catch (IOException e) {
            System.out.println("Could not save data to file.");
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> ArrayList<T> loadFromFile(String fileName) {
        ArrayList<T> list = new ArrayList<>();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
            list.addAll((ArrayList<T>) in.readObject());
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " not found. A new file will be created.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Could not load data from file.");
        }
        return list;
    }
}
