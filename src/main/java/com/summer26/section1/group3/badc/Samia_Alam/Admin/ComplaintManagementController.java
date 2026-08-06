package com.summer26.section1.group3.badc.Samia_Alam.Admin;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class ComplaintManagementController
{
    @javafx.fxml.FXML
    private TableColumn<ComplaintManagement, String> farmerDealerTableCol;
    @javafx.fxml.FXML
    private ComboBox<String> fieldOfficerCB;
    @javafx.fxml.FXML
    private TableColumn<ComplaintManagement, String> complaintIdTableCol;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private TableColumn<ComplaintManagement, String> statusTableCol;
    @javafx.fxml.FXML
    private TableView<ComplaintManagement> complaintTableView;

    @javafx.fxml.FXML
    public void initialize() {
        complaintIdTableCol.setCellValueFactory(new PropertyValueFactory<>("complaintId"));
        farmerDealerTableCol.setCellValueFactory(new PropertyValueFactory<>("farmerDealer"));
        statusTableCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        fieldOfficerCB.getItems().addAll(
                "Officer 1", "Officer 2", "Officer 3", "Officer 4"
        );

    @javafx.fxml.FXML
    public void AssingOfficerButton(ActionEvent actionEvent) {
        if (fieldOfficerCB.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select a Field Officer.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Field Officer assigned successfully.");
        alert.showAndWait();

        fieldOfficerCB.getSelectionModel().clearSelection();
        descriptionTA.clear();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/AdminDashboard.fxml");
    }
}