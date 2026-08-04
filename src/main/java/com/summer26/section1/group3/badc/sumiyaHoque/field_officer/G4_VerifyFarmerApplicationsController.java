package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class G4_VerifyFarmerApplicationsController
{
    @javafx.fxml.FXML
    private TableColumn<FarmerApplication,String> farmerNameColumn;
    @javafx.fxml.FXML
    private TableView<FarmerApplication> applicationTableView;
    @javafx.fxml.FXML
    private TableColumn<FarmerApplication,String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<FarmerApplication,String> applicationTypeColumn;
    @javafx.fxml.FXML
    private TextArea applicationDetailsTextArea;
    @javafx.fxml.FXML
    private TableColumn <FarmerApplication,String>applicationIdColumn;

    @javafx.fxml.FXML
    public void initialize() {
        applicationIdColumn.setCellValueFactory(new PropertyValueFactory<>("applicationId"));
        applicationTypeColumn.setCellValueFactory(new PropertyValueFactory<>("applicationType"));
        farmerNameColumn.setCellValueFactory(new PropertyValueFactory<>("farmerName"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/FieldOfficer_Dashboard.fxml");

    }
}