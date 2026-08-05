package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class G8_EditProfileController
{
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;

    @javafx.fxml.FXML
    public void initialize() {
        nameTextField.setText("Sumiya Hoque");
        phoneTextField.setText("01700000000");
        emailTextField.setText("supplier@gmail.com");
        addressTextField.setText("Dhaka, Bangladesh");

    }

    @javafx.fxml.FXML
    public void updateProfilebutton(ActionEvent actionEvent)throws IOException {
        if (nameTextField.getText().trim().isEmpty() ||
                phoneTextField.getText().trim().isEmpty() ||
                emailTextField.getText().trim().isEmpty() ||
                addressTextField.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all fields.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Profile updated successfully.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void Backbutton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/SP_Dashboard.fxml");
    }
}