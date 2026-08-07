package com.summer26.section1.group3.badc.FarzanaKhushi.Dealer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class DeliveryStatusController
{
    @javafx.fxml.FXML
    private TableColumn<DeliveryStatus, String> orderIdColumn;
    @javafx.fxml.FXML
    private TextField orderIdTextField;
    @javafx.fxml.FXML
    private TableColumn<DeliveryStatus, String> statusColumn;
    @javafx.fxml.FXML
    private TableView<DeliveryStatus> deliveryStatusTable;
    @javafx.fxml.FXML
    private TableColumn<DeliveryStatus, String> productColumn;

    private final ObservableList<DeliveryStatus> fullDeliveryList = FXCollections.observableArrayList();
    private final ObservableList<DeliveryStatus> filteredList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        orderIdColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        productColumn.setCellValueFactory(new PropertyValueFactory<>("product"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));


        fullDeliveryList.add(new DeliveryStatus("O001", "Rice Bag", "Delivered"));
        fullDeliveryList.add(new DeliveryStatus("O002", "Sugar Bag", "In Transit"));
        fullDeliveryList.add(new DeliveryStatus("O003", "Notebook", "Pending"));

        filteredList.addAll(fullDeliveryList);
        deliveryStatusTable.setItems(filteredList);
    }

    @javafx.fxml.FXML
    public void checkStatusButton(ActionEvent actionEvent) {
        String orderId = orderIdTextField.getText();

        if (orderId == null || orderId.trim().isEmpty()) {
            filteredList.setAll(fullDeliveryList);
            return;
        }

        String keyword = orderId.trim().toLowerCase();

        filteredList.clear();

        for (DeliveryStatus delivery : fullDeliveryList) {
            if (delivery.getOrderId().toLowerCase().contains(keyword)) {
                filteredList.add(delivery);
            }
        }

        if (filteredList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("No Result");
            alert.setContentText("No delivery found with Order ID: " + orderId);
            alert.show();
        }
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/DealerDashboard.fxml");
    }
}