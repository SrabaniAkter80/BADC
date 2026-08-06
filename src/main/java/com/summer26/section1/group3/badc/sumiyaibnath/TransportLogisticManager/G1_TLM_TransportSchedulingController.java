package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;

public class G1_TLM_TransportSchedulingController
{
    @javafx.fxml.FXML
    private TableColumn<Transport, String> coldestination;
    @javafx.fxml.FXML
    private TextField destination;
    @javafx.fxml.FXML
    private DatePicker scheduleddate;
    @javafx.fxml.FXML
    private TableView<Transport> tableview;
    @javafx.fxml.FXML
    private TableColumn<Transport, LocalDate> coldate;
    @javafx.fxml.FXML
    private TextField transportid;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colstatus;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> coltransportid;
    @javafx.fxml.FXML
    private TextField status;

    @javafx.fxml.FXML
    public void initialize() {

        status.setText("Scheduled");

        coltransportid.setCellValueFactory(new PropertyValueFactory<>("transportId"));
        coldestination.setCellValueFactory(new PropertyValueFactory<>("destination"));
        coldate.setCellValueFactory(new PropertyValueFactory<>("scheduledDate"));
        colstatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        tableview.getItems().addAll(TransportManager.getTransportList());
    }

    @javafx.fxml.FXML
    public void confirmschedule(ActionEvent actionEvent) {
        if (transportid.getText().trim().isEmpty()
                || destination.getText().trim().isEmpty()
                || scheduleddate.getValue() == null) {
            label.setText("Please fill up all the fields.");
            return;
        }

        if (TransportManager.transportExists(transportid.getText())) {
            label.setText("Transport ID already exists.");
            return;
        }

        Transport transport = new Transport(
                transportid.getText(),
                destination.getText(),
                scheduleddate.getValue(),
                "",
                "",
                null,
                "Scheduled"
        );

        TransportManager.addTransport(transport);
        tableview.getItems().add(transport);
        clearFields();
        label.setText("Transport Scheduled Successfully.");
    }

    private void clearFields() {
        transportid.clear();
        destination.clear();
        scheduleddate.setValue(null);
        status.setText("Scheduled");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G0_TLM_Dashboard.fxml");
    }
}