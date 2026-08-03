package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import com.summer26.section1.group3.badc.utils.BinaryFileUtil;
import com.summer26.section1.group3.badc.utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class G2_Send_Announcement_ViewController {

    @javafx.fxml.FXML
    private TextField announcementTitleTextField;
    @javafx.fxml.FXML
    private Label ConfirmationMessageLabel;
    @javafx.fxml.FXML
    private TextArea announcementMessageTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        ConfirmationMessageLabel.setText("");
    }

    @javafx.fxml.FXML
    public void HandleSendAnnouncementButton(ActionEvent actionEvent) {

        String title = announcementTitleTextField.getText().trim();
        String message = announcementMessageTextArea.getText().trim();

        if (title.isEmpty()) {
            ConfirmationMessageLabel.setText("Please enter the announcement title.");
            return;
        }

        if (message.isEmpty()) {
            ConfirmationMessageLabel.setText("Please enter the announcement message.");
            return;
        }

        Announcement announcement = new Announcement(
                title,
                message,
                "HR Manager"
        );
        BinaryFileUtil.appendObject("data/announcements.bin", announcement);

        ConfirmationMessageLabel.setText("Announcement sent successfully.");

        announcementTitleTextField.clear();
        announcementMessageTextArea.clear();
    }

    @javafx.fxml.FXML
    public void HandleBackToDashboardButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G0_HR Manager_Dashboard.fxml",
                "HR Manager Dashboard");
    }
}