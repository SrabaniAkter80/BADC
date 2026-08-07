package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class TransactionHistoryController {

    @javafx.fxml.FXML
    private TableColumn<Transaction, Double> amountTableCol;
    @javafx.fxml.FXML
    private TableColumn<Transaction, String> tnxIdTableCol;
    @javafx.fxml.FXML
    private TableView<Transaction> tnxHistoryTableView;
    @javafx.fxml.FXML
    private ComboBox<String> filterComboBox;
    @javafx.fxml.FXML
    private TextField tnxIdTF;
    @javafx.fxml.FXML
    private TableColumn<Transaction, String> dateTableCol;
    @javafx.fxml.FXML
    private TableColumn<Transaction, String> statusTableCol;
    @javafx.fxml.FXML
    private TableColumn<Transaction, String> typeTableCol;

    File file = new File("transaction.bin");

    @javafx.fxml.FXML
    public void initialize() {

        filterComboBox.getItems().addAll(
                "All",
                "Completed",
                "Pending",
                "Failed"
        );

        tnxIdTableCol.setCellValueFactory(new PropertyValueFactory<>("transactionId"));
        dateTableCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        typeTableCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        amountTableCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        statusTableCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        if (!file.exists()) {
            writeSampleData();
        }

        loadData();
    }

    private void writeSampleData() {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(file));

            oos.writeObject(new Transaction(
                    "TNX001", "2026-08-01", "Payroll", 45000.0, "Completed"
            ));

            oos.writeObject(new Transaction(
                    "TNX002", "2026-08-02", "Subsidy", 12000.0, "Pending"
            ));

            oos.writeObject(new Transaction(
                    "TNX003", "2026-08-03", "Expense", 3200.0, "Failed"
            ));

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadData() {

        tnxHistoryTableView.getItems().clear();

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(file));

            while (true) {

                Transaction transaction =
                        (Transaction) ois.readObject();

                tnxHistoryTableView.getItems().add(transaction);

            }

        } catch (EOFException e) {

            // End of File

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void onTnxTableSort(Event event) {

        if (tnxHistoryTableView.getSelectionModel().getSelectedItem() != null) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Transaction");
            alert.setHeaderText(null);
            alert.setContentText("Transaction selected.");
            alert.showAndWait();
        }
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo(
                "/com/summer26/section1/group3/badc/Samia_Alam/Accountant/AccountantDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void filterButton(ActionEvent actionEvent) {

        if (filterComboBox.getValue() == null &&
                tnxIdTF.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Filter");
            alert.setHeaderText(null);
            alert.setContentText("Please select a filter or enter Transaction ID.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Filter applied successfully.");
        alert.showAndWait();
    }
}