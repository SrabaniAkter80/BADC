package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class G7_PO_ProcurementHistoryController
{
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colproduct;
    @javafx.fxml.FXML
    private DatePicker purchasedate;
    @javafx.fxml.FXML
    private ComboBox<String> productname;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, LocalDate> colpurchasedate;
    @javafx.fxml.FXML
    private TableView<PurchaseOrder> tableview;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colquantity;
    @javafx.fxml.FXML
    private TextField supplierid;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colsupplierid;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colunitprice;
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
        productname.getItems().addAll("Seed", "Fertilizer", "Soil", "Bio-pesticides", "Machinery");

        colproduct.setCellValueFactory(new PropertyValueFactory<>("product"));
        colsupplierid.setCellValueFactory(new PropertyValueFactory<>("supplierId"));
        colquantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colunitprice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        colpurchasedate.setCellValueFactory(new PropertyValueFactory<>("orderDate"));

        tableview.setItems(FXCollections.observableArrayList(PurchaseOrderManager.getOrderList()));
    }


    @javafx.fxml.FXML
    public void filter(ActionEvent actionEvent) {

        ArrayList<PurchaseOrder> filteredList = new ArrayList<>();

        for (PurchaseOrder order : PurchaseOrderManager.getOrderList()) {
            boolean match = true;
            if (!supplierid.getText().isEmpty()) {
                if (!order.getSupplierId().equalsIgnoreCase(supplierid.getText())) {
                    match = false;
                }
            }
            if (productname.getValue() != null) {
                if (!order.getProduct().equalsIgnoreCase(productname.getValue())) {
                    match = false;
                }
            }
            if (purchasedate.getValue() != null) {
                if (!order.getOrderDate().equals(purchasedate.getValue())) {
                    match = false;
                }
            }
            if (match) {
                filteredList.add(order);
            }
        }
        tableview.setItems(
                FXCollections.observableArrayList(filteredList)
        );

        label.setText(filteredList.size() + " record(s) found.");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G0_PO_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void refresh(ActionEvent actionEvent) {
        supplierid.clear();
        productname.setValue(null);
        purchasedate.setValue(null);
        tableview.setItems(
                FXCollections.observableArrayList(
                        PurchaseOrderManager.getOrderList()
                )
        );
        label.setText("Table refreshed.");
    }
}