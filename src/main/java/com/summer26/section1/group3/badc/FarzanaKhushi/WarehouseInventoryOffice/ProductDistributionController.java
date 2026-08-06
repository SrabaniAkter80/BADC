package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProductDistributionController
{

    @javafx.fxml.FXML
    private TextField destinationTextField;
    @javafx.fxml.FXML
    private TextField productIdTextField;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    private final ObservableList<ProductDistribution> distributionList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void distributeButton(ActionEvent actionEvent) {
        String productId = productIdTextField.getText();
        String destination = destinationTextField.getText();
        String quantityText = quantityTextField.getText();

        if (productId.isEmpty() || destination.isEmpty() || quantityText.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Input Error");
            alert.setContentText("Please fill all fields.");
            alert.show();
            return;
        }

        int quantity;
        try {
            quantity = Integer.parseInt(quantityText);
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Invalid Quantity");
            alert.setContentText("Quantity must be a valid number.");
            alert.show();
            return;
        }

        if (quantity <= 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Invalid Quantity");
            alert.setContentText("Quantity must be greater than zero.");
            alert.show();
            return;
        }

        ProductDistribution distribution =
                new ProductDistribution(productId, quantity, destination);

        distributionList.add(distribution);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Success");
        alert.setContentText("Product distributed successfully.");
        alert.show();

        productIdTextField.clear();
        destinationTextField.clear();
        quantityTextField.clear();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/WarehouseDashboard.fxml");
    }
}