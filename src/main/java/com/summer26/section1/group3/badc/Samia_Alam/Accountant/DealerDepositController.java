package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class DealerDepositController
{
    @javafx.fxml.FXML
    private TableColumn <DealerDeposit, Double> amountTableCol;
    @javafx.fxml.FXML
    private TableColumn <DealerDeposit, String> challanTableCol;
    @javafx.fxml.FXML
    private TableColumn <DealerDeposit, String> dealerIdTableCol;
    @javafx.fxml.FXML
    private TableColumn <DealerDeposit, String> depositIdTableCol;
    @javafx.fxml.FXML
    private TableView <DealerDeposit> dealerDepositTableView;

    @javafx.fxml.FXML
    public void initialize() {
        depositIdTableCol.setCellValueFactory(new PropertyValueFactory<>("depositId"));
        dealerIdTableCol.setCellValueFactory(new PropertyValueFactory<>("dealerId"));
        challanTableCol.setCellValueFactory(new PropertyValueFactory<>("challan"));
        amountTableCol.setCellValueFactory(new PropertyValueFactory<>("amount"));

        ObservableList<DealerDeposit> deposits = FXCollections.observableArrayList(
                new DealerDeposit("D001", "DL-101", "CH-2001", 15000.0),
                new DealerDeposit("D002", "DL-102", "CH-2002", 8500.0),
                new DealerDeposit("D003", "DL-103", "CH-2003", 22000.0)
        );
        dealerDepositTableView.setItems(deposits);
    }

    @javafx.fxml.FXML
    public void approvedButton(ActionEvent actionEvent) {
        DealerDeposit selected = dealerDepositTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Approval Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select a deposit to approve.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Dealer deposit approved successfully.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/AccountantDashboard.fxml");
    }
}