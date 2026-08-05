package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.stage.FileChooser;

import java.io.IOException;import java.io.File;
import java.io.File;
import java.io.File;
import java.io.File;
import java.io.IOException;

public class G2_UplodDocumentsController
{
    @javafx.fxml.FXML
    private ComboBox<String> DocumentTypeComboBox;
    private File selectedFile;

    @javafx.fxml.FXML
    public void initialize() {
        DocumentTypeComboBox.getItems().addAll(
                "Trade License",
                "TIN Certificate",
                "VAT Certificate",
                "Quality Certificate",
                "Company Registration"
        );

    }

    @javafx.fxml.FXML
    public void ChooseFileButton(ActionEvent actionEvent)throws IOException {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose Document");

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter(
                        "Documents", "*.pdf", "*.doc", "*.docx", "*.jpg", "*.png")
        );

        selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Selected File: " + selectedFile.getName());
            alert.showAndWait();
        }
    }


    @javafx.fxml.FXML
    public void UploadButton(ActionEvent actionEvent)throws IOException {

        if (selectedFile == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setContentText("Please choose a file first.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Document uploaded successfully.");
        alert.showAndWait();
    }



    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/SP_Dashboard.fxml");
    }
}