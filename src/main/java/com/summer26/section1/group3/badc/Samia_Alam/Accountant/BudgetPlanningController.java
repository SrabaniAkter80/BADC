package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class BudgetPlanningController
{
    @javafx.fxml.FXML
    private ComboBox <String> deptCB;
    @javafx.fxml.FXML
    private TextField currentBudgetTF;
    @javafx.fxml.FXML
    private TextField proposedBudgetTF;

    @javafx.fxml.FXML
    public void initialize() {
        deptCB.getItems().addAll(
                "Finance",
                "HR",
                "Accounts",
                "Inventory",
                "Procurement"
        );
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/AccountantDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {
        if (deptCB.getValue() == null ||
                currentBudgetTF.getText().trim().isEmpty() ||
                proposedBudgetTF.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all fields.");
            alert.showAndWait();
            return;
        }
        try {
            double currentBudget = Double.parseDouble(currentBudgetTF.getText().trim());
            double proposedBudget = Double.parseDouble(proposedBudgetTF.getText().trim());
            BudgetPlanning budgetPlanning = new BudgetPlanning(
                    deptCB.getValue(),
                    currentBudget,
                    proposedBudget
            );
            // TODO: এখানে budgetPlanning অবজেক্টটা database/service এ save করবে
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Budget amounts must be valid numbers.");
            alert.showAndWait();
            return;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Budget updated successfully.");
        alert.showAndWait();
        deptCB.getSelectionModel().clearSelection();
        currentBudgetTF.clear();
        proposedBudgetTF.clear();
    }
}