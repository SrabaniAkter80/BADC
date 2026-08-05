package com.summer26.section1.group3.badc.Samia_Alam.Admin;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class ActivityMonitoringController
{
    @javafx.fxml.FXML
    private TableColumn <ActivityMonitoring, String> actionTableCol;
    @javafx.fxml.FXML
    private TableColumn <ActivityMonitoring, String> timeStampTableCol;
    @javafx.fxml.FXML
    private TableColumn <ActivityMonitoring, String> userIdTableCol;
    @javafx.fxml.FXML
    private ComboBox <String> userRoleCB;
    @javafx.fxml.FXML
    private TableView <ActivityMonitoring> activityTV;
    @javafx.fxml.FXML
    private DatePicker datepicker;

    @javafx.fxml.FXML
    public void initialize() {
        userRoleCB.getItems().addAll(
                "Admin",
                "Accountant",
                "Field Officer",
                "Dealer",
                "Farmer"
        );

        userIdTableCol.setCellValueFactory(new PropertyValueFactory<>("userId"));
        actionTableCol.setCellValueFactory(new PropertyValueFactory<>("action"));
        timeStampTableCol.setCellValueFactory(new PropertyValueFactory<>("timestamp"));
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
        if (datepicker.getValue() == null || userRoleCB.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Search Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select a date and user role.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Search");
        alert.setHeaderText(null);
        alert.setContentText("Activity logs searched successfully.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/AdminDashboard.fxml");
    }
}