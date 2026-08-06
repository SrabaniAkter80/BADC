package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class VerifyProductsController
{
    @javafx.fxml.FXML
    private TableColumn<VerifyProducts, String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<VerifyProducts, String> productNameColumn;
    @javafx.fxml.FXML
    private TableColumn<VerifyProducts, String> productIdColumn;
    @javafx.fxml.FXML
    private TableView<VerifyProducts> verifyProductTableView;

    private final ObservableList<VerifyProducts> verifyList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        productIdColumn.setCellValueFactory(new PropertyValueFactory<>("productId"));
        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));


        verifyList.add(new VerifyProducts("P001", "Rice Bag", "Pending"));
        verifyList.add(new VerifyProducts("P002", "Sugar Bag", "Pending"));
        verifyList.add(new VerifyProducts("P003", "Notebook", "Pending"));

        verifyProductTableView.setItems(verifyList);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/WarehouseDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void verifyButton(ActionEvent actionEvent) {
        VerifyProducts selected = verifyProductTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("No Selection");
            alert.setContentText("Please select a product to verify.");
            alert.show();
            return;
        }

        selected.setStatus("Verified");
        verifyProductTableView.refresh();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Success");
        alert.setContentText("Product verified successfully: " + selected.getProductName());
        alert.show();
    }
}