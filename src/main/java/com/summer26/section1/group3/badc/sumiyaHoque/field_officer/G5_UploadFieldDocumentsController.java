package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.io.IOException;

public class G5_UploadFieldDocumentsController
{
    @javafx.fxml.FXML
    private TextArea documentDescriptionTextArea;

    @javafx.fxml.FXML
    public void initialize() {


    }

    @javafx.fxml.FXML
    public void chooseFileOnClick(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void uploadButtonOnClick(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void backButtonOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/FieldOfficer_Dashboard.fxml");
    }
}