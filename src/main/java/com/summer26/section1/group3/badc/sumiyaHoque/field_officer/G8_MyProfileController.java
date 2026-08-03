package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class G8_MyProfileController
{
    @javafx.fxml.FXML
    private TextArea profileInfoTextArea;

    @javafx.fxml.FXML
    public void initialize() {

        profileInfoTextArea.setEditable(false);

        profileInfoTextArea.setText(
                "Name : Rahim Uddin\n" +
                        "Email : rahim@gmail.com\n" +
                        "Phone : 01712345678\n" +
                        "Address : Dhaka, Bangladesh\n" +
                        "Designation : Field Officer"
        );
    }

    @javafx.fxml.FXML
    public void refreshButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void editButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}