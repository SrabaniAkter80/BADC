package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class G4_DeliveryScheduleController
{
    @javafx.fxml.FXML
    private DatePicker deliveryDatePicker;
    @javafx.fxml.FXML
    private TextField deliveryLocationTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void scheduleDeliveryButton(ActionEvent actionEvent) {
        LocalDate deliveryDate = deliveryDatePicker.getValue();
        String location = deliveryLocationTextField.getText();

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}