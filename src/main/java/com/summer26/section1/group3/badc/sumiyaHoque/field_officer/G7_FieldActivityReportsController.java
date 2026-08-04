package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
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
        if (reportDetailsTextArea.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setContentText("Please generate a report first.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Report downloaded successfully.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/FieldOfficer_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void generateReportButton(ActionEvent actionEvent) {
        if (reportTypeComboBox.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setContentText("Please select a report type.");
            alert.showAndWait();
            return;
        }

        String report =
                "===== Field Activity Report =====\n\n" +
                        "Report Type : " + reportTypeComboBox.getValue() + "\n" +
                        "Officer Name : Field Officer\n" +
                        "Date : 04-Aug-2026\n\n" +
                        "Activities:\n" +
                        "- Visited assigned farming areas.\n" +
                        "- Conducted field inspections.\n" +
                        "- Verified farmer applications.\n" +
                        "- Resolved assigned complaints.\n" +
                        "- Uploaded field documents.";

        reportDetailsTextArea.setText(report);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Report generated successfully.");
        alert.showAndWait();
    }
}