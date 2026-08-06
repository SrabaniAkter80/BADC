package com.summer26.section1.group3.badc.Samia_Alam.Admin;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class InventoryConfigurationController
{
    @javafx.fxml.FXML
    private TextField searchProductTF;
    @javafx.fxml.FXML
    private TableView <InventoryConfiguration> configurationTableview;
    @javafx.fxml.FXML
    private Label lowStockWarningLabel;
    @javafx.fxml.FXML
    private TableColumn <InventoryConfiguration, String> productIdTableCol;
    @javafx.fxml.FXML
    private TableColumn <InventoryConfiguration, String> warehouseTableCol;
    @javafx.fxml.FXML
    private TableColumn <InventoryConfiguration, String> productNameTableCol;
    @javafx.fxml.FXML
    private TableColumn<InventoryConfiguration, Number> quantityTableCol;
    @javafx.fxml.FXML
    private TableColumn<InventoryConfiguration, Number> minimumThresholdTableCol;
    @javafx.fxml.FXML
    private TextField newThresholdTF;

    @javafx.fxml.FXML
    public void initialize() {
        lowStockWarningLabel.setText("No Low Stock Warning");

        productIdTableCol.setCellValueFactory(new PropertyValueFactory<>("productId"));
        productNameTableCol.setCellValueFactory(new PropertyValueFactory<>("productName"));
        warehouseTableCol.setCellValueFactory(new PropertyValueFactory<>("warehouse"));
        quantityTableCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        minimumThresholdTableCol.setCellValueFactory(new PropertyValueFactory<>("minimumThreshold"));
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {

        if (searchProductTF.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Search Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter a Product ID or Product Name.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Search");
        alert.setHeaderText(null);
        alert.setContentText("Product searched successfully.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/AdminDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {
        if (newThresholdTF.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Update Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter a new threshold value.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Threshold updated successfully.");
        alert.showAndWait();

        lowStockWarningLabel.setText("Threshold Updated");
        newThresholdTF.clear();
    }
}