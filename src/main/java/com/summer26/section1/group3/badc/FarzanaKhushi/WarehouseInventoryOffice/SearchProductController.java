package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class SearchProductController
{
    @javafx.fxml.FXML
    private TableView<SearchProduct> productTableView;
    @javafx.fxml.FXML
    private TableColumn<SearchProduct, Integer> quantityColumn;
    @javafx.fxml.FXML
    private TableColumn<SearchProduct, String> productNameColumn;
    @javafx.fxml.FXML
    private TableColumn<SearchProduct, String> categoryColumn;
    @javafx.fxml.FXML
    private TableColumn<SearchProduct, String> productIdColumn;
    @javafx.fxml.FXML
    private TextField searchTextField;

    private final ObservableList<SearchProduct> fullProductList = FXCollections.observableArrayList();
    private final ObservableList<SearchProduct> filteredList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        productIdColumn.setCellValueFactory(new PropertyValueFactory<>("productId"));
        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));


        fullProductList.add(new SearchProduct("P001", "Rice Bag", "Grocery", 120));
        fullProductList.add(new SearchProduct("P002", "Sugar Bag", "Grocery", 5));
        fullProductList.add(new SearchProduct("P003", "Notebook", "Stationery", 300));

        filteredList.addAll(fullProductList);
        productTableView.setItems(filteredList);
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
        String keyword = searchTextField.getText();

        if (keyword == null || keyword.trim().isEmpty()) {
            filteredList.setAll(fullProductList);
            return;
        }

        String lowerKeyword = keyword.trim().toLowerCase();

        filteredList.clear();

        for (SearchProduct product : fullProductList) {
            if (product.getProductId().toLowerCase().contains(lowerKeyword)
                    || product.getProductName().toLowerCase().contains(lowerKeyword)
                    || product.getCategory().toLowerCase().contains(lowerKeyword)) {
                filteredList.add(product);
            }
        }

        if (filteredList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("No Result");
            alert.setContentText("No product found matching: " + keyword);
            alert.show();
        }
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/WarehouseDashboard.fxml");
    }
}