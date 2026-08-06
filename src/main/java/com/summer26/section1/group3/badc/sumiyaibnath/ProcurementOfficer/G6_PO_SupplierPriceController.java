package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class G6_PO_SupplierPriceController
{
    @javafx.fxml.FXML
    private TableColumn<Supplier, String> colproductname;
    @javafx.fxml.FXML
    private TableColumn<Supplier, Double> colunitprice;
    @javafx.fxml.FXML
    private TableColumn<Supplier, String> colsuppliername;
    @javafx.fxml.FXML
    private ComboBox<String> productname;
    @javafx.fxml.FXML
    private TableView<Supplier> tableview;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn<Supplier, String> colquality;
    @javafx.fxml.FXML
    private TableColumn<Supplier, String> colrating;

    @javafx.fxml.FXML
    public void initialize() {
        productname.getItems().addAll("seed", "fertilizer", "soil", "bio-pesticides", "machinery");

        colsuppliername.setCellValueFactory(new PropertyValueFactory<>("supplierName"));
        colproductname.setCellValueFactory(new PropertyValueFactory<>("productName"));
        colunitprice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        colquality.setCellValueFactory(new PropertyValueFactory<>("quality"));
        colrating.setCellValueFactory(new PropertyValueFactory<>("rating"));
    }

    @javafx.fxml.FXML
    public void compare(ActionEvent actionEvent) {
        if (productname.getValue() == null) {
            label.setText("Please select a product.");
            return;
        }
        tableview.setItems(
                FXCollections.observableArrayList(
                        SupplierManager.getSuppliersByProduct(productname.getValue())
                )
        );
        if (tableview.getItems().isEmpty()) {
            label.setText("No suppliers found for this product.");
        } else {
            label.setText("Price comparison completed.");
        }
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G0_PO_Dashboard.fxml");
    }
}