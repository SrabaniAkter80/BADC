package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.io.IOException;

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
    public void backbutton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/SP_Dashboard.fxml");

    }

    @javafx.fxml.FXML
    public void editbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshbutton(ActionEvent actionEvent) {
    }
}