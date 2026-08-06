package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class G4_Application_StatusController {

    @javafx.fxml.FXML
    private Label ApplicationStatusPageLabel;

    @javafx.fxml.FXML
    private TableColumn<Application, String> applicationTypeColumn;

    @javafx.fxml.FXML
    private TableView<Application> Application_Status_TableView;

    @javafx.fxml.FXML
    private TableColumn<Application, String> currentStatusColumn;

    @javafx.fxml.FXML
    private TableColumn<Application, String> submissionDateColumn;


    private static final String FILE_NAME =
            "data/applications.bin";


    private final ObservableList<Application> applications =
            FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {

        applicationTypeColumn.setCellValueFactory(
                new PropertyValueFactory<>("applicationType")
        );

        submissionDateColumn.setCellValueFactory(
                new PropertyValueFactory<>("submissionDate")
        );

        currentStatusColumn.setCellValueFactory(
                new PropertyValueFactory<>("currentStatus")
        );

        loadApplications();


        Application_Status_TableView.setItems(
                applications
        );
    }


    private void loadApplications() {

        ArrayList<Application> applicationList =
                BinaryFileUtil.readObjects(FILE_NAME);

        applications.setAll(applicationList);
    }


    @javafx.fxml.FXML
    public void HandleBacktoDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G0_Farmer_Dashboard.fxml");

    }
}