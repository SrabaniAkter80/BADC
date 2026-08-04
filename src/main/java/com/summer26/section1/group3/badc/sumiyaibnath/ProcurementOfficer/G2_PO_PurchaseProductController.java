package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class G2_PO_PurchaseProductController
{
    @javafx.fxml.FXML
    private TableColumn<Product, String> colproduct;
    @javafx.fxml.FXML
    private TextField product;
    @javafx.fxml.FXML
    private TextField supplierid;
    @javafx.fxml.FXML
    private TextField quantity;
    @javafx.fxml.FXML
    private TableColumn<Product, String> colpurchaseid;
    @javafx.fxml.FXML
    private TableColumn<Product, String> colsupplierid;
    @javafx.fxml.FXML
    private TextField purchaseid;
    @javafx.fxml.FXML
    private TableView<Product> tableview;
    @javafx.fxml.FXML
    private TableColumn<Product, Integer> colquantity;
    @javafx.fxml.FXML
    private Label message;

    @javafx.fxml.FXML
    public void initialize() {

        colpurchaseid.setCellValueFactory(new PropertyValueFactory<>("productId"));
        colproduct.setCellValueFactory(new PropertyValueFactory<>("productName"));
        colsupplierid.setCellValueFactory(new PropertyValueFactory<>("supplierId"));
        colquantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        tableview.setItems(FXCollections.observableArrayList(ProductManager.getProductList()));
    }

    @javafx.fxml.FXML
    public void confirm(ActionEvent actionEvent) {
        if (purchaseid.getText().isEmpty() ||
                product.getText().isEmpty() ||
                supplierid.getText().isEmpty() ||
                quantity.getText().isEmpty()) {
            message.setText("Please fill up all fields.");
            return;
        }
        try {
            Product p = new Product(
                    purchaseid.getText(),
                    product.getText(),
                    0,
                    Integer.parseInt(quantity.getText()),
                    supplierid.getText()
            );
            ProductManager.addProduct(p);
            tableview.setItems(FXCollections.observableArrayList(ProductManager.getProductList()));
            purchaseid.clear();
            product.clear();
            supplierid.clear();
            quantity.clear();
            message.setText("Product purchased successfully.");
        } catch (NumberFormatException e) {
            message.setText("Quantity must be a number.");
        }
    }
    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G0_PO_Dashboard.fxml");
    }
}