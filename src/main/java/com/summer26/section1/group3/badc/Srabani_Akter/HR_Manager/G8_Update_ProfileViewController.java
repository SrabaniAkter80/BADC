package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class G8_Update_ProfileViewController {

    @javafx.fxml.FXML
    private TextField NameTextField;
    @javafx.fxml.FXML
    private Label confirmationMessageLabel;
    @javafx.fxml.FXML
    private TextField PhoneNumberTextField;
    @javafx.fxml.FXML
    private Label UpdateProfileLabel;
    @javafx.fxml.FXML
    private TextField EmailTextField;
    private final String FILE_NAME = "data/HRManager.bin";

    private String loggedInEmployeeId = "HR001";
    private HRManager currentManager;

    @javafx.fxml.FXML
    public void initialize() {

        confirmationMessageLabel.setText("");

        ArrayList<HRManager> managerList =
                BinaryFileUtil.readObjects(FILE_NAME);

        for (HRManager manager : managerList) {

            if (manager.getEmployeeId().equals(loggedInEmployeeId)) {
                currentManager = manager;
                NameTextField.setText(manager.getName());
                PhoneNumberTextField.setText(manager.getPhoneNumber());
                EmailTextField.setText(manager.getEmail());

                break;
            }
        }
    }

    @javafx.fxml.FXML
    public void HandleUpdateProfileButton(ActionEvent actionEvent) {

        if (NameTextField.getText().trim().isEmpty()
                || PhoneNumberTextField.getText().trim().isEmpty()
                || EmailTextField.getText().trim().isEmpty()) {

            confirmationMessageLabel.setText("Please fill in all fields.");
            return;
        }

        if (currentManager == null) {
            confirmationMessageLabel.setText("Profile not found.");
            return;
        }

        currentManager.setName(NameTextField.getText().trim());
        currentManager.setPhoneNumber(PhoneNumberTextField.getText().trim());
        currentManager.setEmail(EmailTextField.getText().trim());

        ArrayList<HRManager> managerList =
                BinaryFileUtil.readObjects(FILE_NAME);

        for (int i = 0; i < managerList.size(); i++) {

            if (managerList.get(i).getEmployeeId()
                    .equals(currentManager.getEmployeeId())) {

                managerList.set(i, currentManager);
                break;
            }
        }

        BinaryFileUtil.saveList(FILE_NAME, managerList);

        confirmationMessageLabel.setText("Profile updated successfully.");
    }

    @javafx.fxml.FXML
    public void HandleBacktoDashboardButton(ActionEvent actionEvent)throws IOException {

        SceneSwitcher.switchTo(

                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G0_HR Manager_Dashboard.fxml");

    }
}