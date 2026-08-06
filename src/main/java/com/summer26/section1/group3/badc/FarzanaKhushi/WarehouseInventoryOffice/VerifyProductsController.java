package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class VerifyProductsController
{
    @javafx.fxml.FXML
    private TableColumn <VerifyProductsController, String>statusColumn;
    @javafx.fxml.FXML
    private TableColumn <VerifyProductsController, String>productNameColumn;
    @javafx.fxml.FXML
    private TableColumn <VerifyProductsController, String>productIdColumn;
    @javafx.fxml.FXML
    private TableView <VerifyProductsController>verifyProductTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/WarehouseDashboardController.java");
    }

    @javafx.fxml.FXML
    public void verifyButton(ActionEvent actionEvent) {
    }
}