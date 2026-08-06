package com.summer26.section1.group3.badc.FarzanaKhushi.Dealer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class dealerDashboardController
{

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void purchaseProductButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/PurchaseProduct.fxml");
    }

    @javafx.fxml.FXML
    public void paymentButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/Payment.fxml");
    }


    @javafx.fxml.FXML
    public void viewProductsButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/ViewProducts.fxml");
    }

    @javafx.fxml.FXML
    public void messageOfficerButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/MessageFieldOfficer.fxml");
    }

    @javafx.fxml.FXML
    public void updateProfileButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/UpdateProfile.fxml");
    }



    @javafx.fxml.FXML
    public void deliveryStatusButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/DeliveryStatus.fxml");
    }

    @javafx.fxml.FXML
    public void purchaseHistoryButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/PurchaseProduct.fxml");
    }
}