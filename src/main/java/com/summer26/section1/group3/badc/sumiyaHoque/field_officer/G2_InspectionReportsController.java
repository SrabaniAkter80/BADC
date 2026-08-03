package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class G2_InspectionReportsController
{
    @javafx.fxml.FXML
    private Label inspectionReportsTitleLabel;
    @javafx.fxml.FXML
    private ComboBox<String> inspectionTypeComboBox;
    @javafx.fxml.FXML
    private TextArea inspectionFindingsTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        inspectionTypeComboBox.setItems(FXCollections.observableArrayList(
                "Crop Inspection",
                "Seed Inspection",
                "Fertilizer Inspection",
                "Pest Inspection",
                "Equipment Inspection"
        ));

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitReportButton(ActionEvent actionEvent) {
    }
}