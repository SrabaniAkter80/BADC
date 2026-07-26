package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class G3_PO_PurchaseOrderController
{
    @javafx.fxml.FXML
    private TextField product;
    @javafx.fxml.FXML
    private TextField supplierid;
    @javafx.fxml.FXML
    private TextField quantity;
    @javafx.fxml.FXML
    private ComboBox orderstatus;
    @javafx.fxml.FXML
    private TextField orderid;
    @javafx.fxml.FXML
    private TableColumn colunitprice;
    @javafx.fxml.FXML
    private TableColumn colorderstatus;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private DatePicker orderdate;
    @javafx.fxml.FXML
    private TextField unitprice;
    @javafx.fxml.FXML
    private TableColumn colproduct;
    @javafx.fxml.FXML
    private TableColumn colorderdate;
    @javafx.fxml.FXML
    private TableColumn colsupplierid;
    @javafx.fxml.FXML
    private TableColumn colorderid;
    @javafx.fxml.FXML
    private TableView tableview;
    @javafx.fxml.FXML
    private TableColumn colquantity;

    @javafx.fxml.FXML
    public void initialize() {
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