package com.summer26.section1.group3.badc.FarzanaKhushi.Dealer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PurchaseProductController
{
    @javafx.fxml.FXML
    private TextField productIdTextField;
    @javafx.fxml.FXML
    private Label titleLabel;
    @javafx.fxml.FXML
    private TextField productNameTextField;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void clearButton(ActionEvent actionEvent) {
        productIdTextField.clear();
        productNameTextField.clear();
        quantityTextField.clear();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/dealerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void purchaseButton(ActionEvent actionEvent) {
        String productId = productIdTextField.getText();
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


        if (quantity <= 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Invalid Quantity");
            alert.setContentText("Quantity must be greater than zero.");
            alert.show();
            return;
        }


        PurchaseProduct purchase = new PurchaseProduct(productId, productName, quantity);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Success");
        alert.setContentText("Product purchased successfully: " + productName + " (Qty: " + quantity + ")");
        alert.show();

        clearButton(actionEvent);
    }
}