package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

public class FieldOfficer_DashboardController
{
    @javafx.fxml.FXML
    private Label dashboardTitleLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void myProfileButton(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/G8_MyProfile.fxml");

    }


    @javafx.fxml.FXML
    public void logoutButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/common/login.fxml");
    }

    @javafx.fxml.FXML
    public void fieldVisitsButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/G1_FieldVisits.fxml");
    }



    @javafx.fxml.FXML
    public void editProfileOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/G8_EditProfile.fxml");
    }

    @javafx.fxml.FXML
    public void InspectionsreportsButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/G2_InspectionReports.fxml");

    }

    @javafx.fxml.FXML
    public void VerifyFarmerApplicationsButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/G4_VerifyFarmerApplications.fxml");
    }

    @javafx.fxml.FXML
    public void FieldActivityReportsButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/G7_FieldActivityReports.fxml");
    }

    @javafx.fxml.FXML
    public void UploadFieldDocumentsbutton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/G5_UploadFieldDocuments.fxml");
    }

    @javafx.fxml.FXML
    public void AssignedTaskstButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/G6_AssignedTasks.fxml");
    }

    @javafx.fxml.FXML
    public void AssignedComplaintsButton(ActionEvent actionEvent)throws IOException {
       SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/G3_AssignedComplaints.fxml");
    }
}