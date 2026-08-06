package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class G7_ContractsController
{
    @javafx.fxml.FXML
    private TableView<Contruct> contractTableView;
    @javafx.fxml.FXML
    private TableColumn<Contruct,String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<Contruct,String> productNameColumn;
    @javafx.fxml.FXML
    private TextArea agreementInfoTextArea;
    @javafx.fxml.FXML
    private TableColumn<Contruct,String> contractIdColumn;
    @javafx.fxml.FXML
    private TableColumn<Contruct,String> contractDateColumn;

    @javafx.fxml.FXML
    public void initialize() {
        contractIdColumn.setCellValueFactory(new PropertyValueFactory<>("contractId"));
        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("contractTitle"));
        contractDateColumn.setCellValueFactory(new PropertyValueFactory<>("agreementDetails"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("contractStatus"));
    }
    ObservableList<Contruct> list = FXCollections.observableArrayList(
            new Contruct("C001", "Rice Supply", "01-Aug-2026", "Approved"),
            new Contruct("C002", "Fertilizer Supply", "05-Aug-2026", "Pending"),
            new Contruct("C003", "Seed Supply", "10-Aug-2026", "Completed")
    );



    @javafx.fxml.FXML
    public void downloadContractButton(ActionEvent actionEvent) {
        Contruct contract = contractTableView.getSelectionModel().getSelectedItem();

        if (contract == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setContentText("Please select a contract.");
            alert.showAndWait();
            return;
        }

        agreementInfoTextArea.setText(
                "Contract ID : " + contract.getContractId() + "\n" +
                        "Contract Title : " + contract.getContractTitle() + "\n" +
                        "Agreement Details : " + contract.getAgreementDetails() + "\n" +
                        "Status : " + contract.getContractStatus()
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Contract downloaded successfully.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/SP_Dashboard.fxml");
    }
}