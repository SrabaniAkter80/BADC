package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class ViewStockController
{
    @javafx.fxml.FXML
    private TableView <ViewStockController>viewStockTableView;
    @javafx.fxml.FXML
    private TableColumn <ViewStockController, String>nameTableCol;
    @javafx.fxml.FXML
    private TableColumn <ViewStockController, String>productIdTableCol;
    @javafx.fxml.FXML
    private TableColumn <ViewStockController, String>quantityTableCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void refreshButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("WarehouseDashboardController");
    }
}