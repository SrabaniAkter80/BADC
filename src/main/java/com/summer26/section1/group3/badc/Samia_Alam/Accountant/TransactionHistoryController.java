package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    // সব transaction মেমোরিতে রাখা হচ্ছে, filter করার সময় এখান থেকেই বাছাই হবে
    private final List<Transaction> allTransactions = new ArrayList<>();

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

        allTransactions.clear();

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(file));

            while (true) {

                Transaction transaction =
                        (Transaction) ois.readObject();

                allTransactions.add(transaction);

            }

        } catch (EOFException e) {

            // End of File

        } catch (Exception e) {
            e.printStackTrace();
        }

        // প্রথমে সব দেখাও
        tnxHistoryTableView.setItems(FXCollections.observableArrayList(allTransactions));
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

        String selectedStatus = filterComboBox.getValue();
        String tnxId = tnxIdTF.getText().trim();

        if (selectedStatus == null && tnxId.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Filter");
            alert.setHeaderText(null);
            alert.setContentText("Please select a filter or enter Transaction ID.");
            alert.showAndWait();
            return;
        }

        List<Transaction> filtered = new ArrayList<>();

        for (Transaction t : allTransactions) {

            boolean statusMatches =
                    selectedStatus == null
                            || selectedStatus.equals("All")
                            || t.getStatus().equalsIgnoreCase(selectedStatus);

            boolean idMatches =
                    tnxId.isEmpty()
                            || t.getTransactionId().equalsIgnoreCase(tnxId);

            if (statusMatches && idMatches) {
                filtered.add(t);
            }
        }

        tnxHistoryTableView.setItems(FXCollections.observableArrayList(filtered));

        if (filtered.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Filter");
            alert.setHeaderText(null);
            alert.setContentText("No matching transactions found.");
            alert.showAndWait();
        }
    }
}