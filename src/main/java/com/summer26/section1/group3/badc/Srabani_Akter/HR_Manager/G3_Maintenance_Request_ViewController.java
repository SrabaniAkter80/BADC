package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class G3_Maintenance_Request_ViewController {

    @javafx.fxml.FXML
    private ComboBox<String> equipmentTypeComboBox;
    @javafx.fxml.FXML
    private Label maintenanceRequestLabel;
    @javafx.fxml.FXML
    private Label StatusConfirmationLabel;
    @javafx.fxml.FXML
    private TextArea maintenanceIssueDescriptionTextArea;
    private final String FILE_NAME = "data/MaintenanceRequest.bin";

    @javafx.fxml.FXML
    public void initialize() {
        equipmentTypeComboBox.getItems().addAll("Computer","Printer","Furniture","Office Facility");
        StatusConfirmationLabel.setText("");
    }

    @javafx.fxml.FXML
    public void HandleSubmitRequestButton(ActionEvent actionEvent) {

        String equipment = equipmentTypeComboBox.getValue();
        String description = maintenanceIssueDescriptionTextArea.getText();

        if (equipment == null || description == null || description.trim().isEmpty()) {
            StatusConfirmationLabel.setText("Please fill in all required information.");
            return;
        }
        MaintenanceRequest request = new MaintenanceRequest(equipment, description);
        BinaryFileUtil.appendObject(FILE_NAME, request);

        StatusConfirmationLabel.setText("Request submitted successfully.");

        equipmentTypeComboBox.setValue(null);
        maintenanceIssueDescriptionTextArea.clear();
    }

    @javafx.fxml.FXML
    public void HandleBacktoDashBoardButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo(
                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G0_HR Manager_Dashboard.fxml");
    }
}