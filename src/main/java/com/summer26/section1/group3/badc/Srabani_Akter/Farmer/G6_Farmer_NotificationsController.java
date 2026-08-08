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

public class G6_Farmer_NotificationsController {

    @javafx.fxml.FXML
    private TableView<Notification> Farmer_Notificatios_Tableview;

    @javafx.fxml.FXML
    private TableColumn<Notification, String> notificationTitleColumn;

    @javafx.fxml.FXML
    private TableColumn<Notification, String> messageColumn;

    @javafx.fxml.FXML
    private Label notificationsLabel;

    @javafx.fxml.FXML
    private TableColumn<Notification, String> dateColumn;


    private static final String FILE_NAME =
            "data/notifications.bin";
    private final ObservableList<Notification> notifications =
            FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        notificationTitleColumn.setCellValueFactory(new PropertyValueFactory<>("notificationTitle"));

        messageColumn.setCellValueFactory(new PropertyValueFactory<>("message"));

        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        loadNotifications();
        Farmer_Notificatios_Tableview.setItems(notifications);
    }
    private void loadNotifications() {

        ArrayList<Notification> notificationList = BinaryFileUtil.readObjects(FILE_NAME);

        notifications.setAll(notificationList);
    }
    @javafx.fxml.FXML
    public void handleBackToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G0_Farmer_Dashboard.fxml");

    }


}