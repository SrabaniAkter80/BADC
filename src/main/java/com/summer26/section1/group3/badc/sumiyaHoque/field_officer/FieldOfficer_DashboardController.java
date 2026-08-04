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

    @Deprecated
    public void farmerInspectionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("'/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/G2_InspectionReports.fxml");

    }

    @Deprecated
    public void cropMonitoringButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/");

    }

    @javafx.fxml.FXML
    public void myProfileButton(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("");

    }

    @Deprecated
    public void complaintResolutionButton(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("");


    }

    @Deprecated
    public void distributionVerificationButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void submitInspectionReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fieldVisitsButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void notificationsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void editProfileOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void InspectionsreportsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void VerifyFarmerApplicationsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void FieldActivityReportsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UploadFieldDocumentsbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AssignedTaskstButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AssignedComplaintsButton(ActionEvent actionEvent) {
    }
}