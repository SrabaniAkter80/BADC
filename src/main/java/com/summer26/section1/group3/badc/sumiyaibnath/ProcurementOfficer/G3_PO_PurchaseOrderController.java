package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
    public void Initialize(){
        orderstatus.getItems().addAll(
                "Pending",
                "Approved",
                "Cancelled"
        );

        tableview.getItems().setAll(PurchaseOrderManager.getOrderList());
    }

    @javafx.fxml.FXML
    public void cancel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approve(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) {
    }
}