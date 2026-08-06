package com.summer26.section1.group3.badc.FarzanaKhushi.Dealer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PaymentController
{
    @javafx.fxml.FXML
    private TextField invoiceIdTextField;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private ComboBox<String> paymentMethodComboBox;

    private final ObservableList<Payment> paymentList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        paymentMethodComboBox.setItems(FXCollections.observableArrayList(
                "Cash", "Bank Transfer", "Mobile Banking", "Cheque"
        ));
    }

    @javafx.fxml.FXML
    public void payButton(ActionEvent actionEvent) {
        String invoiceId = invoiceIdTextField.getText();
        String amountText = amountTextField.getText();
        String paymentMethod = paymentMethodComboBox.getValue();


        if (invoiceId.isEmpty() || amountText.isEmpty() || paymentMethod == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Input Error");
            alert.setContentText("Please fill all fields and select a payment method.");
            alert.show();
            return;
        }


        double amount;
        try {
            amount = Double.parseDouble(amountText);
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Invalid Amount");
            alert.setContentText("Amount must be a valid number.");
            alert.show();
            return;
        }

        if (amount <= 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Invalid Amount");
            alert.setContentText("Amount must be greater than zero.");
            alert.show();
            return;
        }


        Payment payment = new Payment(invoiceId, amount, paymentMethod);
        paymentList.add(payment);



        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Success");
        alert.setContentText("Payment of " + amount + " (" + paymentMethod + ") recorded successfully.");
        alert.show();

        invoiceIdTextField.clear();
        amountTextField.clear();
        paymentMethodComboBox.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/DealerDashboard.fxml");
    }
}