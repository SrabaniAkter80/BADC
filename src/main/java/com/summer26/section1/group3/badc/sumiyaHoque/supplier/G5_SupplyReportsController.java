package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class G5_SupplyReportsController
{
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeComboBox;
    @javafx.fxml.FXML
    private TextArea reportSummaryTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeComboBox.getItems().addAll(
                "Daily Report",
                "Weekly Report",
                "Monthly Report"
        );

}

    @javafx.fxml.FXML
    public void downloadReportButton(ActionEvent actionEvent)throws IOException {
        if (reportSummaryTextArea.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setContentText("Please select a report type first.");
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
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/SP_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void reportTypeComboBox(ActionEvent actionEvent) {

    }
}