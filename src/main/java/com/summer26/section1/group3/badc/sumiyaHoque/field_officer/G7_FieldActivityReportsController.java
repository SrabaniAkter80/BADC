package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class G7_FieldActivityReportsController
{
    @javafx.fxml.FXML
    private TextArea reportDetailsTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeComboBox.setItems(FXCollections.observableArrayList(
                "Daily Report",
                "Weekly Report",
                "Monthly Report",
                "Field Visit Report",
                "Inspection Report"
        ));
    }

    @javafx.fxml.FXML
    public void downloadReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/FieldOfficer_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void generateReportButton(ActionEvent actionEvent) {
    }
}