package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;

import java.io.IOException;

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
    public void BackButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/SP_Dashboard.fxml");
    }
}