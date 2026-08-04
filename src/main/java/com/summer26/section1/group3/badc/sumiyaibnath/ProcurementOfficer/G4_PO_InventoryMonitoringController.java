package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class G4_PO_InventoryMonitoringController
{
    @javafx.fxml.FXML
    private TableColumn<Inventory, String> colproductname;
    @javafx.fxml.FXML
    private ComboBox<String> stockstatus;
    @javafx.fxml.FXML
    private TextField productname;
    @javafx.fxml.FXML
    private TextField currentstock;
    @javafx.fxml.FXML
    private TableView<Inventory> tableview;
    @javafx.fxml.FXML
    private TableColumn<Inventory, String> colstockstatus;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn<Inventory, String> colcurrentstock;
    @javafx.fxml.FXML
    private ComboBox<String> demand;
    @javafx.fxml.FXML
    private TableColumn<Inventory, String> coldemand;

    @javafx.fxml.FXML
    public void initialize() {
        stockstatus.getItems().addAll("In Stock", "Low Stock", "Out of Stock");

        demand.getItems().addAll("Low", "Medium", "High");

        colproductname.setCellValueFactory(new PropertyValueFactory<>("productName"));
        colcurrentstock.setCellValueFactory(new PropertyValueFactory<>("currentStock"));
        colstockstatus.setCellValueFactory(new PropertyValueFactory<>("stockStatus"));
        coldemand.setCellValueFactory(new PropertyValueFactory<>("demand"));

        tableview.setItems(FXCollections.observableArrayList(InventoryManager.getInventoryList()));
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G0_PO_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
        Inventory selectedInventory =
                tableview.getSelectionModel().getSelectedItem();

        if (selectedInventory == null) {
            label.setText("Please select a product.");
            return;
        }

        if (productname.getText().isEmpty() ||
                currentstock.getText().isEmpty() ||
                stockstatus.getValue() == null ||
                demand.getValue() == null) {

            label.setText("Please fill up all fields.");
            return;
        }

        selectedInventory.setProductName(productname.getText());
        selectedInventory.setCurrentStock(currentstock.getText());
        selectedInventory.setStockStatus(stockstatus.getValue());
        selectedInventory.setDemand(demand.getValue());

        InventoryManager.updateInventory();
        tableview.refresh();
        label.setText("Inventory updated successfully.");
    }

    @javafx.fxml.FXML
    public void selectRow(MouseEvent event) {
        Inventory inventory = tableview.getSelectionModel().getSelectedItem();

        if (inventory != null) {
            productname.setText(inventory.getProductName());
            currentstock.setText(inventory.getCurrentStock());
            stockstatus.setValue(inventory.getStockStatus());
            demand.setValue(inventory.getDemand());
        }
    }
}