package com.summer26.section1.group3.badc.FarzanaKhushi.Dealer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DeliveryStatusController
{
    @javafx.fxml.FXML
    private TableColumn <DeliveryStatusController, String> orderIdColumn;
    @javafx.fxml.FXML
    private TextField orderIdTextField;
    @javafx.fxml.FXML
    private TableColumn<DeliveryStatusController, String> statusColumn;
    @javafx.fxml.FXML
    private TableView <DeliveryStatusController> deliveryStatusTable;
    @javafx.fxml.FXML
    private TableColumn <DeliveryStatusController, String>productColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void checkStatusButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/dealerDashboardController.java");
    }
}