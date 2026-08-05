package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;

public class G3_PO_PurchaseOrderController
{
    @javafx.fxml.FXML
    private TextField product;
    @javafx.fxml.FXML
    private TextField supplierid;
    @javafx.fxml.FXML
    private TextField quantity;
    @javafx.fxml.FXML
    private ComboBox<String> orderstatus;
    @javafx.fxml.FXML
    private TextField orderid;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colunitprice;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colorderstatus;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private DatePicker orderdate;
    @javafx.fxml.FXML
    private TextField unitprice;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colproduct;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, LocalDate> colorderdate;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colsupplierid;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colorderid;
    @javafx.fxml.FXML
    private TableView<PurchaseOrder> tableview;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, Integer> colquantity;

    @javafx.fxml.FXML
    public void initialize() {
        orderstatus.getItems().addAll("Order placed", "Processing", "Shipped");

        colorderid.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        colsupplierid.setCellValueFactory(new PropertyValueFactory<>("supplierId"));
        colproduct.setCellValueFactory(new PropertyValueFactory<>("product"));
        colquantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colunitprice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        colorderdate.setCellValueFactory(new PropertyValueFactory<>("orderDate"));
        colorderstatus.setCellValueFactory(new PropertyValueFactory<>("orderStatus"));

        tableview.setItems(FXCollections.observableArrayList(PurchaseOrderManager.getOrderList()));

    }

    @javafx.fxml.FXML
    public void cancel(ActionEvent actionEvent) {
        PurchaseOrder selectedOrder = tableview.getSelectionModel().getSelectedItem();
        if (selectedOrder == null) {
            label.setText("Please select an order.");
            return;
        }
        PurchaseOrderManager.cancelOrder(selectedOrder);
        tableview.setItems(FXCollections.observableArrayList(PurchaseOrderManager.getOrderList()));
        label.setText("Purchase order cancelled successfully.");
    }

    @javafx.fxml.FXML
    public void approve(ActionEvent actionEvent) {
        if (orderid.getText().isEmpty() ||
                supplierid.getText().isEmpty() ||
                product.getText().isEmpty() ||
                quantity.getText().isEmpty() ||
                unitprice.getText().isEmpty() ||
                orderdate.getValue() == null ||
                orderstatus.getValue() == null) {
            label.setText("Please fill up all fields.");
            return;
        }
        try {
            PurchaseOrder order = new PurchaseOrder(
                    orderid.getText(),
                    supplierid.getText(),
                    product.getText(),
                    quantity.getText(),
                    unitprice.getText(),
                    orderdate.getValue(),
                    orderstatus.getValue()
            );
            PurchaseOrderManager.approveOrder(order);

            Inventory inventory = new Inventory(
                    product.getText(),
                    quantity.getText(),
                    "In Stock",
                    "Medium"
            );
            InventoryManager.addOrUpdateInventory(inventory);

            tableview.setItems(FXCollections.observableArrayList(PurchaseOrderManager.getOrderList()));
            orderid.clear();
            supplierid.clear();
            product.clear();
            quantity.clear();
            unitprice.clear();
            orderdate.setValue(null);
            orderstatus.setValue(null);
            label.setText("Purchase order approved successfully.");
        } catch (Exception e) {
            label.setText("Could not approve purchase order.");
        }

    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G0_PO_Dashboard.fxml");
    }
}