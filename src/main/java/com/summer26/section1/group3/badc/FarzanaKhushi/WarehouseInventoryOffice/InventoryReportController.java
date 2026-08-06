package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class InventoryReportController
{
    @javafx.fxml.FXML
    private TableColumn <InventoryReportController, String >quantityColumn;
    @javafx.fxml.FXML
    private AnchorPane reportTableView;
    @javafx.fxml.FXML
    private TableColumn <InventoryReportController, String > statusColumn;
    @javafx.fxml.FXML
    private TableColumn  <InventoryReportController, String >productNameColumn;
    @javafx.fxml.FXML
    private TableColumn <InventoryReportController, String > productIdColumn;
    @javafx.fxml.FXML
    private TableView <InventoryReportController>inventoryTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/dealerDashboardController.java");
    }

    @javafx.fxml.FXML
    public void generateReportButton(ActionEvent actionEvent) {
    }
}