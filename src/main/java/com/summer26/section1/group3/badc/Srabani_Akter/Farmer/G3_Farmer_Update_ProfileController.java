package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;

public class G3_Farmer_Update_ProfileController {

    @javafx.fxml.FXML
    private Label updateProfilePageLabel;

    @javafx.fxml.FXML
    private TextField NameTextField;

    @javafx.fxml.FXML
    private Label confirmationMessageLabel;

    @javafx.fxml.FXML
    private TextArea addressTextArea;

    @javafx.fxml.FXML
    private TextField PhoneNumberTextField;


    private static final String FILE_NAME = "data/farmers.bin";
    private Farmer farmer;


    @javafx.fxml.FXML
    public void initialize() {

        loadFarmer();

        confirmationMessageLabel.setText("");
    }

    private void loadFarmer() {

        ArrayList<Farmer> farmers =
                BinaryFileUtil.readObjects(FILE_NAME);

        if (farmers.isEmpty()) {
            confirmationMessageLabel.setText(
                    "Farmer information not found.");
            return;
        }

        farmer = farmers.get(0);

        NameTextField.setText(farmer.getName());
        PhoneNumberTextField.setText(
                farmer.getPhoneNumber()
        );

        addressTextArea.setText(farmer.getAddress());
    }

    @javafx.fxml.FXML
    public void HandleUpdateInformationButton(ActionEvent actionEvent) {
        if (farmer == null) {
            confirmationMessageLabel.setText("Farmer information not found.");
            return;
        }

        String name = NameTextField.getText().trim();

        String phoneNumber = PhoneNumberTextField.getText().trim();

        String address = addressTextArea.getText().trim();

        if (name.isEmpty()) {

            confirmationMessageLabel.setText(
                    "Please enter your name."
            );

            return;
        }


        if (phoneNumber.isEmpty()) {

            confirmationMessageLabel.setText(
                    "Please enter your phone number."
            );

            return;
        }


        if (address.isEmpty()) {

            confirmationMessageLabel.setText(
                    "Please enter your address."
            );

            return;
        }


        farmer.setName(name);
        farmer.setPhoneNumber(phoneNumber);
        farmer.setAddress(address);


        ArrayList<Farmer> farmers =
                BinaryFileUtil.readObjects(FILE_NAME);


        for (int i = 0; i < farmers.size(); i++) {

            if (farmers.get(i) == farmer) {

                farmers.set(i, farmer);

                break;
            }
        }

        BinaryFileUtil.saveList(
                FILE_NAME,
                farmers
        );


        confirmationMessageLabel.setText(
                "Profile information updated successfully."
        );
    }


    @javafx.fxml.FXML
    public void HandleBacktoDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G0_Farmer_Dashboard.fxml");

    }
}