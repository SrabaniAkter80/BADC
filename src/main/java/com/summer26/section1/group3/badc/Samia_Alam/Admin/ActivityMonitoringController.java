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
    @FXML
    private TextField userIdTF;
    @FXML
    private TextField timeTF;
    @FXML
    private ComboBox<String> actionComboBox;

    private final File file = new File("activity.bin");

    @FXML
    public void initialize() {

        userRoleCB.getItems().addAll(
                "Admin",
                "Accountant",
                "Field Officer",
                "Dealer",
                "Farmer"
        );

        actionComboBox.getItems().addAll(
                "User Login",
                "Created User",
                "Inventory Updated"
        );

        userIdTableCol.setCellValueFactory(new PropertyValueFactory<>("userId"));
        actionTableCol.setCellValueFactory(new PropertyValueFactory<>("action"));
        timeStampTableCol.setCellValueFactory(new PropertyValueFactory<>("timestamp"));

        if (!file.exists() || !hasValidData()) {
            writeSampleData();
        }

        loadData(null, null, null);
    }

    private boolean hasValidData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            ois.readObject();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void writeSampleData() {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(file))) {

            oos.writeObject(new ActivityMonitoring(
                    "A001", "User Login", "07/08/2026 10:30 AM"));

            oos.writeObject(new ActivityMonitoring(
                    "A002", "Created User", "07/08/2026 11:00 AM"));

            oos.writeObject(new ActivityMonitoring(
                    "A003", "Inventory Updated", "07/08/2026 12:15 PM"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadData(String dateFilter, String userIdFilter, String actionFilter) {

        activityTV.getItems().clear();

        boolean noFilter = (dateFilter == null && userIdFilter == null && actionFilter == null);

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {

            while (true) {

                ActivityMonitoring activity =
                        (ActivityMonitoring) ois.readObject();

                boolean matches = noFilter;

                if (!noFilter) {
                    if (dateFilter != null && activity.getTimestamp().startsWith(dateFilter)) {
                        matches = true;
                    }
                    if (userIdFilter != null && activity.getUserId().equalsIgnoreCase(userIdFilter)) {
                        matches = true;
                    }
                    if (actionFilter != null && activity.getAction().equalsIgnoreCase(actionFilter)) {
                        matches = true;
                    }
                }

                if (matches) {
                    activityTV.getItems().add(activity);
                }
            }

        } catch (EOFException e) {


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void searchButton(ActionEvent actionEvent) {

        String dateFilter = null;
        if (datepicker.getValue() != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            dateFilter = datepicker.getValue().format(formatter);
        }

        String userIdFilter = userIdTF.getText().trim();
        if (userIdFilter.isEmpty()) userIdFilter = null;

        String actionFilter = actionComboBox.getValue();

        loadData(dateFilter, userIdFilter, actionFilter);

        if (activityTV.getItems().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Search");
            alert.setHeaderText(null);
            alert.setContentText("No matching activity found.");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Search");
            alert.setHeaderText(null);
            alert.setContentText("Activity logs loaded successfully.");
            alert.showAndWait();
        }
    }

    @FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/AdminDashboard.fxml");
    }
}