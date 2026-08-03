package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class G0_PO_DashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login.fxml");
    }

    @javafx.fxml.FXML
    public void suppliermanagement(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G1_PO_SupplierManagement.fxml");
    }

    @javafx.fxml.FXML
    public void report(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G8_PO_ProcurementReport.fxml");
    }

    @javafx.fxml.FXML
    public void ordermanagement(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G3_PO_PurchaseOrder.fxml");
    }

    @javafx.fxml.FXML
    public void purchaseproduct(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G2_PO_PurchaseProduct.fxml");
    }

    @javafx.fxml.FXML
    public void restockingrequest(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G5_PO_RestockingRequest.fxml");
    }

    @javafx.fxml.FXML
    public void history(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G7_PO_ProcurementHistory.fxml");
    }

    @javafx.fxml.FXML
    public void inventorymonitoring(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G4_PO_InventoryMonitoring.fxml");
    }

    @javafx.fxml.FXML
    public void supplierprice(ActionEvent actionEvent) throws  IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G6_PO_SupplierPrice.fxml");
    }
}