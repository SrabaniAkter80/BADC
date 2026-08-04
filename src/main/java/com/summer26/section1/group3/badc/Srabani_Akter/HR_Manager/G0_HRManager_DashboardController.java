package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class G0_HRManager_DashboardController {
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void HandleEmployeeDirectoryButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo(

                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G1_Employee_Info_View.fxml");
    }

    @javafx.fxml.FXML
    public void HandleEmployeeAttendanceButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo(

                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G5_Employee_Attendance_View.fxml");
    }

    @javafx.fxml.FXML
    public void HandleUpdateProfileButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo(

                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G8_Update_ProfileView.fxml");
    }

    @javafx.fxml.FXML
    public void HandleLeaveRequestButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo(

                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G6_Leave_Request_Management_View.fxml");
    }

    @javafx.fxml.FXML
    public void HandleStaffActivityReportsButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo(

                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G7_Report_Generation_View.fxml");
    }

    @javafx.fxml.FXML
    public void HandleSendAnnouncementButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo(

                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G2_Send_Announcement_View.fxml");
    }

    @javafx.fxml.FXML
    public void HandleAssignTaskButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo(

                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G4_Task_Assignment_View.fxml");
    }

    @javafx.fxml.FXML
    public void HandleMaintenanceRequestButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo(

                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G3_Maintenance_Request_View.fxml");
    }
}