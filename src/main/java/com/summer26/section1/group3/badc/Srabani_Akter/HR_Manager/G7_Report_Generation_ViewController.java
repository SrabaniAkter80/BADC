package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class G7_Report_Generation_ViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> SelectReportTypeComboBox;
    @javafx.fxml.FXML
    private Label StaffActivityReportsLabel;
    @javafx.fxml.FXML
    private Label ConfirmationMessageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        SelectReportTypeComboBox.getItems().addAll("Employee Activity Report","Performance Report","Attendance Report");
    }

    @javafx.fxml.FXML
    public void HandleLoadReportButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void HandleBackToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G0_HR Manager_Dashboard.fxml");
    }
}