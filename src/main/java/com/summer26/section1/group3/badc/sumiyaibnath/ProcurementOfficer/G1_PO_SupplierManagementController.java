package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableColumn<Supplier, String> colcompany;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn<Supplier, String> colproduct;
    @javafx.fxml.FXML
    private TableColumn<Supplier, String> colname;
    @javafx.fxml.FXML
    private ComboBox<String> product;
    @javafx.fxml.FXML
    private TextField supplieridsearch;
    @javafx.fxml.FXML
    private TextField suppliername;
    @javafx.fxml.FXML
    private TextField companyname;
    @javafx.fxml.FXML
    private ComboBox<String> status;
    @javafx.fxml.FXML
    private ComboBox<String> rating;
    @javafx.fxml.FXML
    private TableColumn<Supplier, String> colrating;

    @javafx.fxml.FXML
    public void initialize() {

        status.getItems().addAll("Active", "Inactive", "Blacklisted");

        rating.getItems().addAll("1", "2", "3", "4", "5");

        product.getItems().addAll("seed", "fertilizer", "soil", "bio-pesticides", "machinery");

        colsupplierid.setCellValueFactory(new PropertyValueFactory<>("supplierId"));
        colname.setCellValueFactory(new PropertyValueFactory<>("supplierName"));
        colcompany.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        colproduct.setCellValueFactory(new PropertyValueFactory<>("productName"));
        colstatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        colrating.setCellValueFactory(new PropertyValueFactory<>("rating"));

    }


    @javafx.fxml.FXML
    public void search(ActionEvent actionEvent) {
        String id = supplieridsearch.getText();
        tableview.getItems().clear();
        for (Supplier supplier : SupplierManager.getSupplierList()) {
            if (supplier.getSupplierId().equals(id)) {
                tableview.getItems().add(supplier);
                return;
            }
        }
        label.setText("Supplier not found.");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G0_PO_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
        Supplier selectedSupplier = tableview.getSelectionModel().getSelectedItem();
        if (selectedSupplier == null) {
            label.setText("Please select a supplier.");
            return;
        }

        selectedSupplier.setSupplierId(supplierid.getText());
        selectedSupplier.setSupplierName(suppliername.getText());
        selectedSupplier.setCompanyName(companyname.getText());
        selectedSupplier.setProductName(product.getValue());
        selectedSupplier.setStatus(status.getValue());
        selectedSupplier.setRating(rating.getValue());

        SupplierManager.updateSupplier();
        tableview.refresh();
        label.setText("Supplier updated successfully.");
    }

    @javafx.fxml.FXML
    public void add(ActionEvent actionEvent) {
        Supplier supplier = new Supplier(
                supplierid.getText(),
                suppliername.getText(),
                companyname.getText(),
                product.getValue(),
                status.getValue(),
                rating.getValue()
        );
        SupplierManager.addSupplier(supplier);
        tableview.getItems().clear();
        tableview.getItems().addAll(SupplierManager.getSupplierList());
        tableview.getItems().setAll(SupplierManager.getSupplierList());
        label.setText("Supplier added successfully.");
        supplierid.clear();
        suppliername.clear();
        companyname.clear();
        product.setValue(null);
        status.setValue(null);
        rating.setValue(null);
    }

    @javafx.fxml.FXML
    public void delete(ActionEvent actionEvent) {
        Supplier selectedSupplier = tableview.getSelectionModel().getSelectedItem();
        if (selectedSupplier == null) {
            label.setText("Please select a supplier.");
            return;
        }
        SupplierManager.deleteSupplier(selectedSupplier);
        tableview.getItems().setAll(SupplierManager.getSupplierList());
        label.setText("Supplier deleted successfully.");
    }

    @javafx.fxml.FXML
    public void refresh(ActionEvent actionEvent) {
        tableview.getItems().setAll(SupplierManager.getSupplierList());
        label.setText("Table refreshed.");
    }
}