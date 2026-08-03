package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class G1_FieldVisitsController
{
    @javafx.fxml.FXML
    private TableColumn<FieldVisit,String> farmerNameColumn;
    @javafx.fxml.FXML
    private TableView<FieldVisit> assignedAreasTableView;
    @javafx.fxml.FXML
    private TableColumn<FieldVisit,String> areaNameColumn;
    @javafx.fxml.FXML
    private TableColumn<FieldVisit,String> areaIdColumn;
    @javafx.fxml.FXML
    private TextArea visitNotesTextArea;
    @javafx.fxml.FXML
    private TableColumn<FieldVisit,String> visitDateColumn;
    @javafx.fxml.FXML
    private Label fieldVisitLabel;

    @javafx.fxml.FXML
    public void initialize() {
        areaIdColumn.setCellValueFactory(new PropertyValueFactory<>("areaId"));
        areaNameColumn.setCellValueFactory(new PropertyValueFactory<>("areaName"));
        farmerNameColumn.setCellValueFactory(new PropertyValueFactory<>("farmerName"));
        visitDateColumn.setCellValueFactory(new PropertyValueFactory<>("visitDate"));


        ObservableList<FieldVisit> list = FXCollections.observableArrayList(
                new FieldVisit("A101", "Kaliganj", "Rahim", "03-Aug-2026"),
                new FieldVisit("A102", "Gazipur", "Karim", "04-Aug-2026"),
                new FieldVisit("A103", "Tangail", "Salam", "05-Aug-2026")
        );

        assignedAreasTableView.setItems(list);




    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void submitVisitReportButton(ActionEvent actionEvent) {
    }
}