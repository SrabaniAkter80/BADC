package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;

public class G2_UplodDocumentsController
{
    @javafx.fxml.FXML
    private ComboBox<String> DocumentTypeComboBox;

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
    public void ChooseFileButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void UploadButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) {
    }
}