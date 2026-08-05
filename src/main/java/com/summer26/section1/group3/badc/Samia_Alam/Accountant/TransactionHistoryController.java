package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class TransactionHistoryController {

    @javafx.fxml.FXML
    private TableColumn<Transaction, String> amountTableCol;
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
    }

    @javafx.fxml.FXML
    public void tnxHistoryTableView(Event event) {

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