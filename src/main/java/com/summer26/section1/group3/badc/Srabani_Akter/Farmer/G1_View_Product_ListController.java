package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;



public class G1_View_Product_ListController
{
    @javafx.fxml.FXML
    private TableColumn<ProductList,String> availabilityStatusColumn;
    @javafx.fxml.FXML
    private Label productListLabel;
    @javafx.fxml.FXML
    private TableView<ProductList> Product_List_TableView;
    @javafx.fxml.FXML
    private TableColumn<ProductList,Float> ProductQuantityColumn;
    @javafx.fxml.FXML
    private TableColumn<ProductList,String> ProductNameColumn;
    @javafx.fxml.FXML
    private TextField productQuantityTextField;
    @javafx.fxml.FXML
    private ComboBox<String> availableStatusCombobox;
    @javafx.fxml.FXML
    private ComboBox<String> filterProductCategoryCombobox;
    @javafx.fxml.FXML
    private ComboBox<String> productCategoryComboBox;
    private ArrayList<ProductList> productListArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        ProductNameColumn.setCellValueFactory(new PropertyValueFactory<>("productCategory"));
        availabilityStatusColumn.setCellValueFactory(new PropertyValueFactory<>("availableStatus"));
        ProductQuantityColumn.setCellValueFactory(new PropertyValueFactory<>("productQuantity"));

        availableStatusCombobox.getItems().addAll("Available","Not Available");
        productCategoryComboBox.getItems().addAll("Seeds","fertilizers","Agricultural Products");
        filterProductCategoryCombobox.getItems().addAll("Seeds","fertilizers","Agricultural Products");
        Product_List_TableView.setItems(
                FXCollections.observableArrayList(productListArrayList)
        );


    }

    @javafx.fxml.FXML
    public void HandleSearchFilterButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void HandleResetFilter(ActionEvent actionEvent) {
        Product_List_TableView.getItems().clear();
        Product_List_TableView.getItems().addAll(productListArrayList);
    }

    @javafx.fxml.FXML
    public void HandleBackToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G0_Farmer_Dashboard.fxml");

    }

    @javafx.fxml.FXML
    public void HandleLoadInfoButton(ActionEvent actionEvent) {
//        String productCategory, float productQuantity, String availableStatus)
        String productCategory = productCategoryComboBox.getValue();
        float productQuantity = Float.parseFloat(productQuantityTextField.getText());
        String availableStatus = availableStatusCombobox.getValue();
        ProductList p = new ProductList(productCategory,productQuantity,availableStatus);
        productListArrayList.add(p);
        Product_List_TableView.getItems().clear();
        Product_List_TableView.getItems().addAll(productListArrayList);
    }
}