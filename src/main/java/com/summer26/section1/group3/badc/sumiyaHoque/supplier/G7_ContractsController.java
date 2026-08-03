package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class G7_ContractsController
{
    @javafx.fxml.FXML
    private TableView<Contruct> contractTableView;
    @javafx.fxml.FXML
    private TableColumn<Contruct,String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<Contruct,String> productNameColumn;
    @javafx.fxml.FXML
    private TextArea agreementInfoTextArea;
    @javafx.fxml.FXML
    private TableColumn<Contruct,String> contractIdColumn;
    @javafx.fxml.FXML
    private TableColumn<Contruct,String> contractDateColumn;

    @javafx.fxml.FXML
    public void initialize() {
        contractIdColumn.setCellValueFactory(new PropertyValueFactory<>("contractId"));
        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        contractDateColumn.setCellValueFactory(new PropertyValueFactory<>("contractDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @javafx.fxml.FXML
    public void downloadContractButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}