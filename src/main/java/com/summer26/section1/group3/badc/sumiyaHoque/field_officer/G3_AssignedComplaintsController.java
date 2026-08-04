package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class G3_AssignedComplaintsController
{
    @javafx.fxml.FXML
    private TableColumn<Complaint,String> farmerNameColumn;
    @javafx.fxml.FXML
    private TableColumn<Complaint,String> statusColumn;
    @javafx.fxml.FXML
    private TextArea complaintDetailsTextArea;
    @javafx.fxml.FXML
    private TableColumn <Complaint,String>complaintIdColumn;
    @javafx.fxml.FXML
    private TableColumn<Complaint,String> complaintTypeColumn;
    @javafx.fxml.FXML
    private TableView<Complaint> complaintTableView;

    @javafx.fxml.FXML
    public void initialize() {
        complaintIdColumn.setCellValueFactory(new PropertyValueFactory<>("complaintId"));
        complaintTypeColumn.setCellValueFactory(new PropertyValueFactory<>("complaintType"));
        farmerNameColumn.setCellValueFactory(new PropertyValueFactory<>("farmerName"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        ObservableList<Complaint> list = FXCollections.observableArrayList(
        );
        complaintTableView.setItems(list);



    }

    @javafx.fxml.FXML
    public void resolveComplaintButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/FieldOfficer_Dashboard.fxml");
    }
}