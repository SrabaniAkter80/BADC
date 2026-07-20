package com.summer26.section1.group3.badc.common;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static final List<User> userList = new ArrayList<>();

    static {
        userList.add(new User("sumiya","yuyuyu","Admin"));
        }

    public static List<User> getUserList() {
        return userList;
    }
}
