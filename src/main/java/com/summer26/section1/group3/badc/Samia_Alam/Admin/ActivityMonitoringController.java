package com.summer26.section1.group3.badc.Samia_Alam.Admin;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.format.DateTimeFormatter;

public class ActivityMonitoringController {

    @FXML
    private TableColumn<ActivityMonitoring, String> actionTableCol;
    @FXML
    private TableColumn<ActivityMonitoring, String> timeStampTableCol;
    @FXML
    private TableColumn<ActivityMonitoring, String> userIdTableCol;
    @FXML
    private ComboBox<String> userRoleCB;
    @FXML
    private TableView<ActivityMonitoring> activityTV;
    @FXML
    private DatePicker datepicker;

    File file = new File("activity.bin");

    @FXML
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

        if (!file.exists()) {
            writeSampleData();
        }

        loadData(null);
    }

    private void writeSampleData() {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(file));

            oos.writeObject(new ActivityMonitoring(
                    "A001",
                    "User Login",
                    "07-08-2026 10:30 AM"
            ));

            oos.writeObject(new ActivityMonitoring(
                    "A002",
                    "Created User",
                    "07-08-2026 11:00 AM"
            ));

            oos.writeObject(new ActivityMonitoring(
                    "A003",
                    "Inventory Updated",
                    "07-08-2026 12:15 PM"
            ));

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadData(String dateFilter) {

        activityTV.getItems().clear();

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(file));

            while (true) {

                ActivityMonitoring activity =
                        (ActivityMonitoring) ois.readObject();

                if (dateFilter == null ||
                        activity.getTimestamp().startsWith(dateFilter)) {
                    activityTV.getItems().add(activity);
                }

            }

        } catch (EOFException e) {

            // End of File

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void searchButton(ActionEvent actionEvent) {

        if (datepicker.getValue() == null || userRoleCB.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Search Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select a date and user role.");
            alert.showAndWait();
            return;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String selectedDate = datepicker.getValue().format(formatter);

        loadData(selectedDate);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Search");
        alert.setHeaderText(null);
        alert.setContentText("Activity logs loaded successfully.");
        alert.showAndWait();
    }

    @FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/AdminDashboard.fxml");
    }
}