package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

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
    public void downloadReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reportTypeComboBox(ActionEvent actionEvent) {
    }
}