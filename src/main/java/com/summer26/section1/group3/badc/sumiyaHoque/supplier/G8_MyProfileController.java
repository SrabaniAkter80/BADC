package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class G8_MyProfileController
{
    @javafx.fxml.FXML
    private TextField phonetextfield;
    @javafx.fxml.FXML
    private TextField addresstextfield;
    @javafx.fxml.FXML
    private TextField emailtextfield;
    @javafx.fxml.FXML
    private TextField nametextfield;

    @javafx.fxml.FXML
    public void initialize() {
        nametextfield.setText("Sumiya Hoque");
        phonetextfield.setText("01712345678");
        emailtextfield.setText("supplier@gmail.com");
        addresstextfield.setText("Dhaka, Bangladesh");
    }

    @javafx.fxml.FXML
    public void backbutton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void editbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshbutton(ActionEvent actionEvent) {
    }
}