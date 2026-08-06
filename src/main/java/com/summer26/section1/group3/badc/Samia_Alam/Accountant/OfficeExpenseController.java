package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class OfficeExpenseController
{
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private ComboBox <String> expenseTypeComboBox;
    @javafx.fxml.FXML
    private TextField voucharTextField;

    @javafx.fxml.FXML
    public void initialize() {
        expenseTypeComboBox.getItems().addAll(
                "Transport",
                "Office Supplies",
                "Electricity",
                "Maintenance",
                "Miscellaneous"
        );
    }

    @javafx.fxml.FXML
    public void clearButton(ActionEvent actionEvent) {
        expenseTypeComboBox.getSelectionModel().clearSelection();
        voucharTextField.clear();
        amountTextField.clear();
        dateDatePicker.setValue(null);
    }

    @javafx.fxml.FXML
    public void RecordButton(ActionEvent actionEvent) {
        if (expenseTypeComboBox.getValue() == null ||
                voucharTextField.getText().trim().isEmpty() ||
                amountTextField.getText().trim().isEmpty() ||
                dateDatePicker.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all fields.");
            alert.showAndWait();
            return;
        }

        double amount;
        try {
            amount = Double.parseDouble(amountTextField.getText().trim());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Amount must be a valid number.");
            alert.showAndWait();
            return;
        }

        OfficeExpense expense = new OfficeExpense(
                expenseTypeComboBox.getValue(),
                voucharTextField.getText().trim(),
                amount,
                dateDatePicker.getValue().toString()
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Expense recorded successfully.");
        alert.showAndWait();

        clearButton(null);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/AccountantDashboard.fxml");
    }
}