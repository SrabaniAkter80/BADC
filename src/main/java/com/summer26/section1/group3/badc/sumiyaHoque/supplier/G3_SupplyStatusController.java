package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class G3_SupplyStatusController
{
    @javafx.fxml.FXML
    private TableColumn<SupplyStatus,Integer> quantityColumn;
    @javafx.fxml.FXML
    private TableColumn<SupplyStatus,String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<SupplyStatus,String> productNameColumn;
    @javafx.fxml.FXML
    private TableColumn<SupplyStatus,String> requestDateColumn;
    @javafx.fxml.FXML
    private TableView<SupplyStatus> supplyStatusTableView;
    @javafx.fxml.FXML
    private TableColumn<SupplyStatus,String> requestIdColumn;



    @javafx.fxml.FXML
    public void initialize() {
        requestIdColumn.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        requestDateColumn.setCellValueFactory(new PropertyValueFactory<>("requestDate"));




    }

    @javafx.fxml.FXML
    public void refreshButton(ActionEvent actionEvent) {
        supplyStatusTableView.refresh();



    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {

    }
}