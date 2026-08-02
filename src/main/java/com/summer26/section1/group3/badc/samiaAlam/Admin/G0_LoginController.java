package com.summer26.section1.group3.badc.samiaAlam.Admin;

public class G0_LoginController {

        private String adminId;
        private String name;
        private String username;
        private String password;
        private String email;

        public G0_LoginController() {
        }

        public G0_LoginController(String adminId, String name, String username, String password, String email) {
            this.adminId = adminId;
            this.name = name;
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public boolean login() {
            return true;
        }

        public void logout() {
            System.out.println("Logged out successfully.");
        }

        public void viewDashboard() {
            System.out.println("Admin Dashboard");
        }

        // Getters & Setters

        public String getAdminId() {
            return adminId;
        }

        public void setAdminId(String adminId) {
            this.adminId = adminId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

