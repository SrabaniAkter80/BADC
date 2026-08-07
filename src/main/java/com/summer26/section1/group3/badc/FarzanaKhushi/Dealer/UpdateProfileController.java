package com.summer26.section1.group3.badc.FarzanaKhushi.Dealer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.regex.Pattern;

public class UpdateProfileController
{
    @javafx.fxml.FXML
    private Label titleLabel;
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;


    private UpdateProfile currentProfile;

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$");

    @javafx.fxml.FXML
    public void initialize() {

        // currentProfile = DealerSession.getCurrentDealerProfile();
        // nameTextField.setText(currentProfile.getName());
        // phoneTextField.setText(currentProfile.getPhone());
        // emailTextField.setText(currentProfile.getEmail());
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/DealerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String phone = phoneTextField.getText();
        String email = emailTextField.getText();


        if (name.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Input Error");
            alert.setContentText("Please fill all fields.");
            alert.show();
            return;
        }


        if (!phone.matches("\\d{10,15}")) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Invalid Phone Number");
            alert.setContentText("Phone number must contain 10-15 digits only.");
            alert.show();
            return;
        }


        if (!EMAIL_PATTERN.matcher(email).matches()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Invalid Email");
            alert.setContentText("Please enter a valid email address.");
            alert.show();
            return;
        }

        currentProfile = new UpdateProfile(name, phone, email);



        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Success");
        alert.setContentText("Profile updated successfully.");
        alert.show();
    }
}