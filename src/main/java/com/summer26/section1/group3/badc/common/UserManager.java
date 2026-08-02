package com.summer26.section1.group3.badc.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static final List<User> userList = new ArrayList<>();
    private static final String FileName= "users.bin";

    static {
            loadFromFile();
            if(userList.isEmpty()){
                userList.add(new User("Sumiya","121212","Procurement Officer"));
                saveToFile();
            }

    }

    public static List<User> getUserList() {
        return userList;
    }

    public static void saveToFile(){
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FileName));
            out.writeObject(userList);
            out.close();
        } catch(IOException e){
            System.out.println("Could not save user data to file");
        }
    }

    private static void loadFromFile(){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FileName))) {
        } catch (IOException e) {
            System.out.println("Could not save user data to file");
        }}
    }

