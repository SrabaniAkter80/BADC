package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class SupplierInvoiceController
{
    @javafx.fxml.FXML
    private TableColumn <SupplierInvoice, String> invoiceIdTableCol;
    @javafx.fxml.FXML
    private TableView <SupplierInvoice> supplierInvoiceTableView;
    @javafx.fxml.FXML
    private TextArea detailsTextArea;
    @javafx.fxml.FXML
    private TableColumn <SupplierInvoice, String> supplierTableCol;
    @javafx.fxml.FXML
    private TableColumn <SupplierInvoice, String> costTableCol;
    @javafx.fxml.FXML
    private TableColumn <SupplierInvoice, String> materialTableCol;

    @javafx.fxml.FXML
    public void initialize() {
        invoiceIdTableCol.setCellValueFactory(new PropertyValueFactory<>("invoiceId"));
        supplierTableCol.setCellValueFactory(new PropertyValueFactory<>("supplier"));
        materialTableCol.setCellValueFactory(new PropertyValueFactory<>("material"));
        costTableCol.setCellValueFactory(new PropertyValueFactory<>("cost"));

        detailsTextArea.setEditable(false);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/AccountantDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void authhorizeButton(ActionEvent actionEvent) {
        if (supplierInvoiceTableView.getSelectionModel().getSelectedItem() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Authorization Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select an invoice.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Supplier invoice authorized successfully.");
        alert.showAndWait();

        detailsTextArea.clear();
    }
}