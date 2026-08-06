package com.summer26.section1.group3.badc.Samia_Alam.Admin;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class DatabaseBackupController
{
    @javafx.fxml.FXML
    private TextField destinationTF;
    @javafx.fxml.FXML
    private ComboBox <String> backupCB;

    @javafx.fxml.FXML
    public void initialize() {
        backupCB.getItems().addAll(
                "Full Backup",
                "Incremental Backup",
                "Database Only"
        );

        backupCB.setValue("Full Backup");
    }

    @javafx.fxml.FXML
    public void backupButton(ActionEvent actionEvent) {
        if (backupCB.getValue() == null ||
                destinationTF.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select backup type and destination.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Database backup generated successfully.");
        alert.showAndWait();

        destinationTF.clear();
        backupCB.setValue("Full Backup");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/AdminDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void browseButton(ActionEvent actionEvent) {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Select Backup Folder");

        Stage stage = (Stage) destinationTF.getScene().getWindow();

        File selectedFolder = directoryChooser.showDialog(stage);

        if (selectedFolder != null) {
            destinationTF.setText(selectedFolder.getAbsolutePath());
        }
    }
}