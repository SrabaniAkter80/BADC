package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class FinancialReportController
{
    @javafx.fxml.FXML
    private TextArea reportTextArea;
    @javafx.fxml.FXML
    private ComboBox <String> quarterComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        quarterComboBox.getItems().addAll(
                "Q1",
                "Q2",
                "Q3",
                "Q4"
        );

        reportTextArea.setEditable(false);
    }

    @javafx.fxml.FXML
    public void downloadButton(ActionEvent actionEvent) {
        if (reportTextArea.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Generate the report first.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Report downloaded successfully.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void generateButton(ActionEvent actionEvent) {
        if (quarterComboBox.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select a quarter.");
            alert.showAndWait();
            return;
        }

        reportTextArea.setText(
                "Financial Report\n\n" +
                        "Quarter: " + quarterComboBox.getValue() +
                        "\nTotal Revenue: 500,000 BDT" +
                        "\nTotal Expense: 320,000 BDT" +
                        "\nNet Profit: 180,000 BDT"
        );
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/AccountantDashboard.fxml");
    }
}