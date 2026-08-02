package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class G1_PO_SupplierManagementController
{
    @javafx.fxml.FXML
    private TextField supplierid;
    @javafx.fxml.FXML
    private TableColumn<Supplier,String> colsupplierid;
    @javafx.fxml.FXML
    private TableColumn<Supplier, String> colstatus;
    @javafx.fxml.FXML
    private TableView<Supplier> tableview;
    @javafx.fxml.FXML
    private ComboBox<String> statusupdate;
    @javafx.fxml.FXML
    private TableColumn colcompany;
    @javafx.fxml.FXML
    private TextField nameupdate;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private ComboBox productupdate;
    @javafx.fxml.FXML
    private TableColumn colproduct;
    @javafx.fxml.FXML
    private TableColumn colname;
    @javafx.fxml.FXML
    private TextField companyupdate;
    @javafx.fxml.FXML
    private TextField supplieridupdate;

    @javafx.fxml.FXML
    public void initialize() {
        statusupdate.getItems().addAll("Active", "Inactive", "Blacklisted");
        tableview.getItems().addAll(SupplierManager.getSupplierList());
    }

    @Deprecated
    public void filter(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void search(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G0_PO_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
    }
}