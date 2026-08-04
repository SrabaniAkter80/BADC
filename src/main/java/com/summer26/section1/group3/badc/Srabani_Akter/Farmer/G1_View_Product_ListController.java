package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class G1_View_Product_ListController
{
    @javafx.fxml.FXML
    private TextField FilterProductNameTextField;
    @javafx.fxml.FXML
    private TableColumn availabilityStatusColumn;
    @javafx.fxml.FXML
    private Label productListLabel;
    @javafx.fxml.FXML
    private TableView Product_List_TableView;
    @javafx.fxml.FXML
    private TableColumn ProductQuantityColumn;
    @javafx.fxml.FXML
    private TableColumn ProductNameColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void HandleSearchFilterButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void HandleResetFilter(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void HandleBackToDashboardButton(ActionEvent actionEvent) {
    }
}