package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class UpdateStockController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField productNameTextField;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    private final ObservableList<UpdateStock> stockList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize(){}

    @javafx.fxml.FXML
    public void clearButton(ActionEvent actionEvent) {
        idTextField.clear();
        productNameTextField.clear();
        quantityTextField.clear();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/WarehouseDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {
        String productId = idTextField.getText();
        String productName = productNameTextField.getText();
        String quantityText = quantityTextField.getText();


        if (productId.isEmpty() || productName.isEmpty() || quantityText.isEmpty()) {
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


        if (quantity < 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Invalid Quantity");
            alert.setContentText("Quantity cannot be negative.");
            alert.show();
            return;
        }

        UpdateStock stock = new UpdateStock(productId, productName, quantity);
        stockList.add(stock);



        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Success");
        alert.setContentText("Stock updated successfully.");
        alert.show();

        clearButton(actionEvent);
    }
}