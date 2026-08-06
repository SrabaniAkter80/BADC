package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import com.summer26.section1.group3.badc.common.HelloApplication;
import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

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

            Complaint complaint = complaintTableView.getSelectionModel().getSelectedItem();

            if (complaint == null) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText(null);
                alert.setContentText("Please select a complaint first.");
                alert.showAndWait();
                return;
            }

            complaintDetailsTextArea.setText(
                    "Complaint ID : " + complaint.getComplaintId() + "\n" +
                            "Farmer Name : " + complaint.getFarmerName() + "\n" +
                            "Complaint Type : " + complaint.getComplaintType() + "\n" +
                            "Status : Resolved"
            );

            complaint.setStatus("Resolved");
            complaintTableView.refresh();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Complaint resolved successfully.");
            alert.showAndWait();
        }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/FieldOfficer_Dashboard.fxml");
    }
}





