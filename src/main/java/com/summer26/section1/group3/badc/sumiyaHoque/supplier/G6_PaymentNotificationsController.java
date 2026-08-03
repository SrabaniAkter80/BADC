package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class G6_PaymentNotificationsController
{
    @javafx.fxml.FXML
    private TableView<PaymentNotification> paymentNotificationTableView;
    @javafx.fxml.FXML
    private TableColumn<PaymentNotification,String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<PaymentNotification,Double> amountColumn;
    @javafx.fxml.FXML
    private TableColumn<PaymentNotification,String> paymentDateColumn;
    @javafx.fxml.FXML
    private TableColumn<PaymentNotification,String> paymentIdColumn;





    @javafx.fxml.FXML
    public void initialize() {
        paymentIdColumn.setCellValueFactory(new PropertyValueFactory<>("paymentId"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        paymentDateColumn.setCellValueFactory(new PropertyValueFactory<>("paymentDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));


    }

    @javafx.fxml.FXML
    public void refreshButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/SP_Dashboard.fxml");
    }
}