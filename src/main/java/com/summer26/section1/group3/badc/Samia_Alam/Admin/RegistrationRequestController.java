package com.summer26.section1.group3.badc.Samia_Alam.Admin;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class RegistrationRequestController
{
    @javafx.fxml.FXML
    private TableColumn <RegistrationRequest, String> nameTV;
    @javafx.fxml.FXML
    private TableColumn<RegistrationRequest, String> userTypeTV;
    @javafx.fxml.FXML
    private TableColumn <RegistrationRequest, Number> requestIdTV;
    @javafx.fxml.FXML
    private TableView <RegistrationRequest> requestTV;
    @javafx.fxml.FXML
    private TableColumn <RegistrationRequest, String> statusTV;
    @javafx.fxml.FXML
    private TextArea applicantDetailsTA;

    @javafx.fxml.FXML
    public void initialize() {
        applicantDetailsTA.setEditable(false);

        requestIdTV.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        nameTV.setCellValueFactory(new PropertyValueFactory<>("name"));
        userTypeTV.setCellValueFactory(new PropertyValueFactory<>("userType"));
        statusTV.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @FXML
    public void approvedButton(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Registration request approved successfully.");
        alert.showAndWait();

        applicantDetailsTA.clear();
    }

    @FXML
    public void rejectButton(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Rejected");
        alert.setHeaderText(null);
        alert.setContentText("Registration request rejected.");
        alert.showAndWait();

        applicantDetailsTA.clear();
    }

    @FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/AdminDashboard.fxml");

    }
}

