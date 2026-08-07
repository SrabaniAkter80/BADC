package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;

import java.io.IOException;

public class WarehouseSecurityController
{

    @javafx.fxml.FXML
    private PasswordField newPasswordField;
    @javafx.fxml.FXML
    private PasswordField currentPasswordField;


    private String storedPassword = "admin123";

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void changePasswordButton(ActionEvent actionEvent) {
        String currentPassword = currentPasswordField.getText();
        String newPassword = newPasswordField.getText();


        if (currentPassword.isEmpty() || newPassword.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Input Error");
            alert.setContentText("Please fill all fields.");
            alert.show();
            return;
        }


        if (!currentPassword.equals(storedPassword)) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Incorrect Password");
            alert.setContentText("Current password is incorrect.");
            alert.show();
            return;
        }


        if (newPassword.equals(currentPassword)) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Invalid New Password");
            alert.setContentText("New password must be different from the current password.");
            alert.show();
            return;
        }


        if (newPassword.length() < 6) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Weak Password");
            alert.setContentText("New password must be at least 6 characters long.");
            alert.show();
            return;
        }


        storedPassword = newPassword;


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Success");
        alert.setContentText("Password changed successfully.");
        alert.show();

        currentPasswordField.clear();
        newPasswordField.clear();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/WarehouseDashboard.fxml");
    }
}