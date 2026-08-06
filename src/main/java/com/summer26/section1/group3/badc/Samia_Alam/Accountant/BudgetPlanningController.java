package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BudgetPlanningController {

    @javafx.fxml.FXML
    private ComboBox<String> deptCB;
    @javafx.fxml.FXML
    private TextField currentBudgetTF;
    @javafx.fxml.FXML
    private TextField proposedBudgetTF;

    File file = new File("budget.bin");

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

        double currentBudget;
        double proposedBudget;

        try {
            currentBudget = Double.parseDouble(currentBudgetTF.getText().trim());
            proposedBudget = Double.parseDouble(proposedBudgetTF.getText().trim());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Budget amounts must be valid numbers.");
            alert.showAndWait();
            return;
        }

        BudgetPlanning budgetPlanning = new BudgetPlanning(
                deptCB.getValue(),
                currentBudget,
                proposedBudget
        );

        saveBudget(budgetPlanning);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Budget updated successfully.");
        alert.showAndWait();

        deptCB.getSelectionModel().clearSelection();
        currentBudgetTF.clear();
        proposedBudgetTF.clear();
    }

    private void saveBudget(BudgetPlanning newBudget) {

        List<BudgetPlanning> budgetList = loadAllBudgets();
        budgetList.add(newBudget);

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(file))) {

            for (BudgetPlanning bp : budgetList) {
                oos.writeObject(bp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<BudgetPlanning> loadAllBudgets() {

        List<BudgetPlanning> budgetList = new ArrayList<>();

        if (!file.exists()) {
            return budgetList;
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {

            while (true) {
                BudgetPlanning bp = (BudgetPlanning) ois.readObject();
                budgetList.add(bp);
            }

        } catch (EOFException e) {
            // End of File, expected

        } catch (Exception e) {
            e.printStackTrace();
        }

        return budgetList;
    }
}