package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import com.summer26.section1.group3.badc.common.HelloApplication;
import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.control.Alert;
public class G2_InspectionReportsController {
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
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/FieldOfficer_Dashboard.fxml");


    }

    @javafx.fxml.FXML
    public void submitReportButton(ActionEvent actionEvent) {
    }
}



