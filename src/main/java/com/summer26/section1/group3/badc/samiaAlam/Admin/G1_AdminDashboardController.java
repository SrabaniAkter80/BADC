package com.summer26.section1.group3.badc.samiaAlam.Admin;

public class G1_AdminDashboardController {
        private String fullName;
        private String username;
        private String password;
        private String role;
        private String contactNumber;
        private String email;

        public G1_AdminDashboardController() {
        }

        public G1_AdminDashboardController(String fullName, String username, String password,
                                           String role, String contactNumber, String email) {
            this.fullName = fullName;
            this.username = username;
            this.password = password;
            this.role = role;
            this.contactNumber = contactNumber;
            this.email = email;
        }

        public boolean createUser() {
            return true;
        }

        public boolean validateInput() {
            return true;
        }

        public boolean checkUsernameExists() {
            return false;
        }

        public String encryptPassword() {
            return password;
        }

        public void saveUser() {
            System.out.println("User Saved.");
        }
    }

