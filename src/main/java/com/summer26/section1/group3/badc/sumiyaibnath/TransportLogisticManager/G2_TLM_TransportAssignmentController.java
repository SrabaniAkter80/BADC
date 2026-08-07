package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class G2_TLM_TransportAssignmentController
{
    @javafx.fxml.FXML
    private TextField driver;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colvehicle;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colstatus;
    @javafx.fxml.FXML
    private TableView<Transport> tableview;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> coldriver;
    @javafx.fxml.FXML
    private TextField vehicle;
    @javafx.fxml.FXML
    private TextField transportid;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> coltransportid;
    @javafx.fxml.FXML
    private TextField status;

    private Transport selectedTransport;

    @javafx.fxml.FXML
    public void initialize() {

        status.setText("Assigned");

        coltransportid.setCellValueFactory(new PropertyValueFactory<>("transportId"));
        coldriver.setCellValueFactory(new PropertyValueFactory<>("driverName"));
        colvehicle.setCellValueFactory(new PropertyValueFactory<>("vehicleId"));
        colstatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        for (Transport transport : TransportManager.getTransportList()) {

            if ("Assigned".equalsIgnoreCase(transport.getStatus())) {
                tableview.getItems().add(transport);
            }

        }
    }


    @javafx.fxml.FXML
    public void confirm(ActionEvent actionEvent) {
        if (selectedTransport == null) {
            label.setText("Search for a valid Transport ID first.");
            return;
        }
        if (driver.getText().isEmpty()
                || vehicle.getText().isEmpty()) {
            label.setText("Please fill up all the fields.");
            return;
        }

        selectedTransport.setDriverName(driver.getText());
        selectedTransport.setVehicleId(vehicle.getText());
        selectedTransport.setStatus("Assigned");

        TransportManager.updateTransport();
        tableview.getItems().add(selectedTransport);
        clearFields();
        label.setText("Transport assigned successfully.");
    }
    private void clearFields() {
        transportid.clear();
        driver.clear();
        vehicle.clear();
        status.setText("Assigned");
        selectedTransport = null;
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G0_TLM_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void search(ActionEvent actionEvent) {
        if (transportid.getText().trim().isEmpty()) {
            label.setText("Enter Transport ID.");
            return;
        }

        selectedTransport = TransportManager.findTransport(transportid.getText());

        if (selectedTransport == null) {
            label.setText("Transport ID not found.");
            return;
        }

        if (TransportManager.isAssigned(transportid.getText())) {
            label.setText("Transport has already been assigned.");
            selectedTransport = null;
            return;
        }

        if (!TransportManager.isScheduled(transportid.getText())) {
            label.setText("Transport is not scheduled.");
            selectedTransport = null;
            return;
        }
        label.setText("Transport found. Enter driver and vehicle.");
    }
}