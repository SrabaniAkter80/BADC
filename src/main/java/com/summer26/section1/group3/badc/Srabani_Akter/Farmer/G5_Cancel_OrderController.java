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

public class G5_Cancel_OrderController {

    @javafx.fxml.FXML
    private TableColumn<Order, Integer> quantityColumn;

    @javafx.fxml.FXML
    private TableView<Order> CancelOrder_TableView;

    @javafx.fxml.FXML
    private TextField filterOrderIDTextField;

    @javafx.fxml.FXML
    private Label confirmationMessageLabel;

    @javafx.fxml.FXML
    private Label myOrdersLabel;

    @javafx.fxml.FXML
    private TableColumn<Order, Integer> orderIDColumn;

    @javafx.fxml.FXML
    private TableColumn<Order, String> ProductNameColumn;

    private static final String FILE_NAME =
            "data/orders.bin";


    private final ObservableList<Order> orders = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        orderIDColumn.setCellValueFactory(new PropertyValueFactory<>("orderID"));

        ProductNameColumn.setCellValueFactory(new PropertyValueFactory<>("productCategory"));

        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        loadOrders();
        CancelOrder_TableView.setItems(orders);
        confirmationMessageLabel.setText("");
    }


    private void loadOrders() {

        ArrayList<Order> orderList =
                BinaryFileUtil.readObjects(FILE_NAME);

        orders.setAll(orderList);
    }


    @javafx.fxml.FXML
    public void HandleCancelOrderButton(ActionEvent actionEvent) {

        String orderIDText = filterOrderIDTextField.getText();

        if (orderIDText.isEmpty()) {

            confirmationMessageLabel.setText("Please enter an Order ID.");
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


        Order orderToCancel = null;


        for (Order order : orders) {

            if (order.getOrderID() == orderID) {

                orderToCancel = order;

                break;
            }
        }

        if (orderToCancel == null) {

            confirmationMessageLabel.setText(
                    "Order not found."
            );

            return;
        }

        if (!orderToCancel.getStatus()
                .equalsIgnoreCase("Pending")) {

            confirmationMessageLabel.setText(
                    "Only pending orders can be cancelled."
            );

            return;
        }

        orders.remove(orderToCancel);

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
        confirmationMessageLabel.setText("Request cancelled successfully");
        filterOrderIDTextField.clear();
    }
    @javafx.fxml.FXML
    public void HandleBacktoDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G0_Farmer_Dashboard.fxml");

    }
}