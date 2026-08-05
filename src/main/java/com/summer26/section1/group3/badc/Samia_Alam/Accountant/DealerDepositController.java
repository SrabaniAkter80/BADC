package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class DealerDepositController
{
    @javafx.fxml.FXML
    private TableColumn <DealerDeposit, String> amountTableCol;
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

    }

    @javafx.fxml.FXML
    public void approvedButton(ActionEvent actionEvent) {
        if (dealerDepositTableView.getSelectionModel().getSelectedItem() == null) {

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