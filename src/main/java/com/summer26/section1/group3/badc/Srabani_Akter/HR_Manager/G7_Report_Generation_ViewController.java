package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import com.summer26.section1.group3.badc.utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class G7_Report_Generation_ViewController
{
    @javafx.fxml.FXML
    private ComboBox SelectReportTypeComboBox;
    @javafx.fxml.FXML
    private Label StaffActivityReportsLabel;
    @javafx.fxml.FXML
    private Label ConfirmationMessageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void HandleLoadReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void HandleBackToDashboardButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G0_HR Manager_Dashboard.fxml",
                "HR Manager Dashboard");
    }
}