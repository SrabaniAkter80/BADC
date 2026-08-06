package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class G8_Farmer_Delivery_ConfirmationController {

    @javafx.fxml.FXML
    private TableView<Order> DeleveryConfirmation_TableView;

    @javafx.fxml.FXML
    private TableColumn<Order, String> deleveryStatusColumn;

    @javafx.fxml.FXML
    private TextField FilterOrderIDtextField;

    @javafx.fxml.FXML
    private Label DeleveryInformationLabel;

    @javafx.fxml.FXML
    private TableColumn<Order, String> productNameColumn;

    @javafx.fxml.FXML
    private Label confirmationMessageLabel;

    @javafx.fxml.FXML
    private TableColumn<Order, Integer> orderIDColumn;

    private static final String FILE_NAME = "data/orders.bin";

    private final ObservableList<Order> orders =
            FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        orderIDColumn.setCellValueFactory(new PropertyValueFactory<>("orderID"));

        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productCategory"));

        deleveryStatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        loadOrders();

        DeleveryConfirmation_TableView.setItems(orders);

        confirmationMessageLabel.setText("");
    }

    private void loadOrders() {

        ArrayList<Order> orderList = BinaryFileUtil.readObjects(FILE_NAME);

        orders.setAll(orderList);
    }
    @javafx.fxml.FXML
    public void handleLoadDataButton(ActionEvent actionEvent) {

        String orderIDText =
                FilterOrderIDtextField.getText().trim();

        if (orderIDText.isEmpty()) {

            confirmationMessageLabel.setText(
                    "Please enter an Order ID."
            );

            return;
        }
        int orderID;

        try {
            orderID = Integer.parseInt(orderIDText);

        } catch (NumberFormatException e) {

            confirmationMessageLabel.setText(
                    "Please enter a valid Order ID."
            );

            return;
        }

        Order selectedOrder = null;
        for (Order order : orders) {

            if (order.getOrderID() == orderID) {

                selectedOrder = order;

                break;
            }
        }

        if (selectedOrder == null) {

            confirmationMessageLabel.setText(
                    "Order not found."
            );

            return;
        }if (selectedOrder.getStatus().equalsIgnoreCase("Delivered")) {

            confirmationMessageLabel.setText("Delivery has already been confirmed.");

            return;
        }

        selectedOrder.setStatus("Delivered");
        DeleveryConfirmation_TableView.refresh();

        File file = new File(FILE_NAME);

        if (file.exists()) {
            file.delete();
        }

        for (Order order : orders) {

            BinaryFileUtil.appendObject(
                    FILE_NAME,
                    order
            );
        }

        confirmationMessageLabel.setText("Delivery confirmed successfully");
        FilterOrderIDtextField.clear();
    }
    @javafx.fxml.FXML
    public void handleBacktoDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G0_Farmer_Dashboard.fxml");
    }
}