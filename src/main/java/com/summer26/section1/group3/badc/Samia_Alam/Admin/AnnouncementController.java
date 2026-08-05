package com.summer26.section1.group3.badc.Samia_Alam.Admin;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AnnouncementController
{
    @javafx.fxml.FXML
    private TextArea noticeContantTA;
    @javafx.fxml.FXML
    private ComboBox <String> targetCB;
    @javafx.fxml.FXML
    private TextField noticeTittleTF;

    @javafx.fxml.FXML
    public void initialize() {
        targetCB.getItems().addAll(
                "All Users",
                "Admin",
                "Accountant",
                "Field Officer",
                "Dealer",
                "Farmer"
        );

        targetCB.setValue("All Users");
    }

    @javafx.fxml.FXML
    public void publishAlertButton(ActionEvent actionEvent) {
        if (targetCB.getValue() == null ||
                noticeTittleTF.getText().trim().isEmpty() ||
                noticeContantTA.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all fields.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Announcement published successfully.");
        alert.showAndWait();

        targetCB.setValue("All Users");
        noticeTittleTF.clear();
        noticeContantTA.clear();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/AdminDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void ClearButton(ActionEvent actionEvent) {

        targetCB.setValue("All Users");
        noticeTittleTF.clear();
        noticeContantTA.clear();
    }
}