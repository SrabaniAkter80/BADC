package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class ViewStockController
{
    @javafx.fxml.FXML
    private TableView<ViewStock> viewStockTableView;
    @javafx.fxml.FXML
    private TableColumn<ViewStock, String> nameTableCol;
    @javafx.fxml.FXML
    private TableColumn<ViewStock, String> productIdTableCol;
    @javafx.fxml.FXML
    private TableColumn<ViewStock, Integer> quantityTableCol;

    private final ObservableList<ViewStock> stockList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        productIdTableCol.setCellValueFactory(new PropertyValueFactory<>("productId"));
        nameTableCol.setCellValueFactory(new PropertyValueFactory<>("productName"));
        quantityTableCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        viewStockTableView.setItems(stockList);

        loadStockData();
    }

    private void loadStockData() {

        stockList.clear();
        stockList.add(new ViewStock("P001", "Rice Bag", 120));
        stockList.add(new ViewStock("P002", "Sugar Bag", 5));
        stockList.add(new ViewStock("P003", "Notebook", 300));
    }

    @javafx.fxml.FXML
    public void refreshButton(ActionEvent actionEvent) {
        loadStockData();
        viewStockTableView.refresh();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/WarehouseDashboard.fxml");
    }
}