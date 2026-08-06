package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DamagedProductsController
{
    @javafx.fxml.FXML
    private TableColumn <DamagedProductsController, String> damageReasonColumn;
    @javafx.fxml.FXML
    private TableColumn <DamagedProductsController, String> productNameColumn;
    @javafx.fxml.FXML
    private TableView <DamagedProductsController> damagedTableView;
    @javafx.fxml.FXML
    private TableColumn <DamagedProductsController, String> productIdColumn;
    @javafx.fxml.FXML
    private TextField damageTF;
    @javafx.fxml.FXML
    private TextField productTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/WarehouseDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }
}