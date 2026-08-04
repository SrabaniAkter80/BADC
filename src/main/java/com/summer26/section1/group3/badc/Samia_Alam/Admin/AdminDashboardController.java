package com.summer26.section1.group3.badc.Samia_Alam.Admin;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.Scene;

import java.io.IOException;

public class AdminDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void dtabaseBackupButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/DatabaseBackup.fxml");
    }

    @javafx.fxml.FXML
    public void globalAccouncementButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/Announcement.fxml");
    }

    @javafx.fxml.FXML
    public void activityMonitoringButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/ActivityMonitoring.fxml");
    }

    @javafx.fxml.FXML
    public void registrationRequestButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/RegistrationRequest.fxml");
    }

    @javafx.fxml.FXML
    public void inventoryConfigButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/InventoryConfiguration.fxml");
    }

    @javafx.fxml.FXML
    public void usermanagementButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/UserManagement.fxml");
    }


    @javafx.fxml.FXML
    public void ComplaintManagementButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/ComplaintManagement.fxml");
    }

    @javafx.fxml.FXML
    public void performanceAnalyticsButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/PerformanceAnalytics.fxml");
    }
}