package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SearchProductController
{
    @javafx.fxml.FXML
    private TableView<SearchProductController> productTableView;
    @javafx.fxml.FXML
    private TableColumn <SearchProductController, String>quantityColumn;
    @javafx.fxml.FXML
    private TableColumn <SearchProductController, String> productNameColumn;
    @javafx.fxml.FXML
    private TableColumn <SearchProductController, String>categoryColumn;
    @javafx.fxml.FXML
    private TableColumn <SearchProductController, String>productIdColumn;
    @javafx.fxml.FXML
    private TextField searchTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/WarehouseDashboardController.java");
    }
}