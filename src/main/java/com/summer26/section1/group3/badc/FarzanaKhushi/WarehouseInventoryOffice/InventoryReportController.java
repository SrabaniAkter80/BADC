package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class InventoryReportController
{
    @javafx.fxml.FXML
    private TableColumn<InventoryReport, Integer> quantityColumn;
    @javafx.fxml.FXML
    private TableColumn<InventoryReport, String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<InventoryReport, String> productNameColumn;
    @javafx.fxml.FXML
    private TableColumn<InventoryReport, String> productIdColumn;
    @javafx.fxml.FXML
    private TableView<InventoryReport> inventoryTableView;

    private final ObservableList<InventoryReport> reportList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        productIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("productId"));

        productNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("productName"));

        quantityColumn.setCellValueFactory(
                new PropertyValueFactory<>("quantity"));

        statusColumn.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        inventoryTableView.setItems(reportList);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/WarehouseDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void generateReportButton(ActionEvent actionEvent) {

        reportList.clear();

        reportList.add(new InventoryReport("P001", "Rice Bag", 120, "In Stock"));
        reportList.add(new InventoryReport("P002", "Sugar Bag", 5, "Low Stock"));
        reportList.add(new InventoryReport("P003", "Flour Bag", 0, "Out of Stock"));

        inventoryTableView.setItems(reportList);
    }
}