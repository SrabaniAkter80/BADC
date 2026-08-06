package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class DamagedProductsController
{
    @javafx.fxml.FXML
    private TableColumn<DamagedProduct, String> damageReasonColumn;
    @javafx.fxml.FXML
    private TableColumn<DamagedProduct, String> productNameColumn;
    @javafx.fxml.FXML
    private TableView<DamagedProduct> damagedTableView;
    @javafx.fxml.FXML
    private TableColumn<DamagedProduct, String> productIdColumn;
    @javafx.fxml.FXML
    private TextField damageTF;
    @javafx.fxml.FXML
    private TextField productTF;

    private final ObservableList<DamagedProduct> damagedList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        productIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("productId"));

        productNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("productName"));

        damageReasonColumn.setCellValueFactory(
                new PropertyValueFactory<>("damageReason"));

        damagedTableView.setItems(damagedList);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/WarehouseDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        String productId = productTF.getText();
        String damageReason = damageTF.getText();

        if (productId.isEmpty() || damageReason.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Input Error");
            alert.setContentText("Please fill all fields.");
            alert.show();

            return;
        }

        DamagedProduct product =
                new DamagedProduct(productId, "Unknown Product", damageReason);

        damagedList.add(product);

        productTF.clear();
        damageTF.clear();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Success");
        alert.setContentText("Damaged Product Saved Successfully.");
        alert.show();
    }
}