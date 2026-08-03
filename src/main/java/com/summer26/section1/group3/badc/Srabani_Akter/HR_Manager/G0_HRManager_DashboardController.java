package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import com.summer26.section1.group3.badc.utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class G0_HRManager_DashboardController {
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void HandleEmployeeDirectoryButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G1_Employee_Info_View.fxml",
                "Employee Info");
    }

    @javafx.fxml.FXML
    public void HandleEmployeeAttendanceButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G5_Employee_Attendance_View.fxml",
                "Employee Attendance");
    }

    @javafx.fxml.FXML
    public void HandleUpdateProfileButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G8_Update_ProfileView.fxml",
                "Update Profile");
    }

    @javafx.fxml.FXML
    public void HandleLeaveRequestButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G6_Leave_Request_Management_View.fxml",
                "Leave Request");
    }

    @javafx.fxml.FXML
    public void HandleStaffActivityReportsButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G7_Report_Generation_View.fxml",
                "Generate Report");
    }

    @javafx.fxml.FXML
    public void HandleSendAnnouncementButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G2_Send_Announcement_View.fxml",
                "Announcement");
    }

    @javafx.fxml.FXML
    public void HandleAssignTaskButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G4_Task_Assignment_View.fxml",
                "Assign Task");
    }

    @javafx.fxml.FXML
    public void HandleMaintenanceRequestButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G3_Maintenance_Request_View.fxml",
                "Maintenance Request");
    }
}