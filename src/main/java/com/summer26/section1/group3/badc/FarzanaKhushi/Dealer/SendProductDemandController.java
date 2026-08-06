package com.summer26.section1.group3.badc.FarzanaKhushi.Dealer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SendProductDemandController
{
    @javafx.fxml.FXML
    private Label titleLabel;
    @javafx.fxml.FXML
    private TextField productNameTextField;
    @javafx.fxml.FXML
    private TextArea messageTextArea;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    private final ObservableList<SendProductDemand> demandList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/DealerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void sendButton(ActionEvent actionEvent) {
        String productName = productNameTextField.getText();
        String quantityText = quantityTextField.getText();
        String message = messageTextArea.getText();


        if (productName.isEmpty() || quantityText.isEmpty() || message.isEmpty()) {
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


        SendProductDemand demand = new SendProductDemand(productName, quantity, message);
        demandList.add(demand);



        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Success");
        alert.setContentText("Product demand sent successfully.");
        alert.show();

        productNameTextField.clear();
        quantityTextField.clear();
        messageTextArea.clear();
    }
}