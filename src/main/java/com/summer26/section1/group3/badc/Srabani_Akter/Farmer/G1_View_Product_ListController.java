package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class G1_View_Product_ListController {

    @javafx.fxml.FXML
    private TextField FilterProductNameTextField;

    @javafx.fxml.FXML
    private ComboBox<String> ProductCategoryComboBox;

    @javafx.fxml.FXML
    private TableColumn<Product, String> availabilityStatusColumn;

    @javafx.fxml.FXML
    private Label productListLabel;

    @javafx.fxml.FXML
    private TableView<Product> Product_List_TableView;
    @javafx.fxml.FXML
    private TableColumn<Product, Integer> ProductQuantityColumn;
    @javafx.fxml.FXML
    private TableColumn<Product, String> ProductNameColumn;

    private final ObservableList<Product> allProducts = FXCollections.observableArrayList();

    private final ObservableList<Product> displayedProducts = FXCollections.observableArrayList();

    private static final String FILE_NAME = "data/examples.bin";


    @javafx.fxml.FXML
    public void initialize() {

        ProductNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));

        ProductQuantityColumn.setCellValueFactory(new PropertyValueFactory<>("productQuantity"));

        availabilityStatusColumn.setCellValueFactory(new PropertyValueFactory<>("availabilityStatus"));

        ProductCategoryComboBox.setItems(FXCollections.observableArrayList("Seeds", "Fertilizers", "Agricultural Products"));

        loadProducts();
        displayedProducts.setAll(allProducts);

        Product_List_TableView.setItems(displayedProducts);
    }

    private void loadProducts() {
        ArrayList<Product> products = BinaryFileUtil.readObjects(FILE_NAME);
        allProducts.setAll(products);
    }


    @javafx.fxml.FXML
    public void HandleSearchFilterButton(ActionEvent actionEvent) {

        String searchText =
                FilterProductNameTextField.getText().trim().toLowerCase();

        String selectedCategory =
                ProductCategoryComboBox.getValue();


        ObservableList<Product> filteredProducts =
                FXCollections.observableArrayList();


        for (Product product : allProducts) {

            boolean categoryMatches =
                    selectedCategory == null
                            || selectedCategory.isEmpty()
                            || product.getCategory()
                            .equalsIgnoreCase(selectedCategory);


            boolean searchMatches =
                    searchText.isEmpty()
                            || product.getProductName()
                            .toLowerCase()
                            .contains(searchText);

            if (categoryMatches && searchMatches) {
                filteredProducts.add(product);
            }
        }
        displayedProducts.setAll(filteredProducts);
    }

    @javafx.fxml.FXML
    public void HandleResetFilter(ActionEvent actionEvent) {
        FilterProductNameTextField.clear();
        ProductCategoryComboBox.getSelectionModel().clearSelection();
        displayedProducts.setAll(allProducts);
    }
    @javafx.fxml.FXML
    public void HandleBackToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G0_Farmer_Dashboard.fxml");
    }
}